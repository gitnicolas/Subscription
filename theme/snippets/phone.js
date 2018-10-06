(function () {
	function require(url, callback) {
		var script = document.createElement('script');
		script.src = url;
		script.onload = callback;
		document.head.appendChild(script);
	}

	function apply() {
		var RegionCode = i18n.phonenumbers.RegionCode;
		var formatter = new i18n.phonenumbers.AsYouTypeFormatter(RegionCode.CH);

		function format(event) {
			var target = event.target;
			var value = target.value;
			var length = value.length;
			var char;
			formatter.clear();
			for (var i = 0; i < length; i++) {
				char = value.charAt(i);
				if (char !== ' ') formatter.inputDigit(char);
			}
			target.value = formatter.currentOutput_;
		}

		function validate(event) {
			var target = event.target;
			try {
				var phoneUtil = i18n.phonenumbers.PhoneNumberUtil.getInstance();
				var number = phoneUtil.parseAndKeepRawInput(target.value, RegionCode.CH);
				var PNT = i18n.phonenumbers.PhoneNumberType;
				var PNF = i18n.phonenumbers.PhoneNumberFormat;
				if (!phoneUtil.isPossibleNumber(number) || !phoneUtil.isValidNumber(number)) {
					target.value += ' (Invalid!)';
					return;
				}
				var type = phoneUtil.getNumberType(number);
				if (type != PNT.MOBILE && type != PNT.FIXED_LINE_OR_MOBILE && type != PNT.UNKNOWN) {
					target.value += ' (Not Mobile!)';
					return;
				}
				target.value = phoneUtil.format(number, PNF.INTERNATIONAL);
			} catch (error) {
				target.value += ' (Invalid!)';
			}
		}

		document.getElementsByClassName('mx-name-phone')[0].getElementsByTagName('input')[0].addEventListener('input', format);
		document.getElementsByClassName('mx-name-phone')[0].getElementsByTagName('input')[0].addEventListener('change', validate);
	}

	require('libraries/libphonenumber/libphonenumber.small.js', apply);
})();
