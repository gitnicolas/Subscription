// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ReplaceCustomToken extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String Tokenobject;
	private java.lang.String ReplaceValue;
	private IMendixObject __Emailobject;
	private emailtemplate.proxies.Email Emailobject;

	public ReplaceCustomToken(IContext context, java.lang.String Tokenobject, java.lang.String ReplaceValue, IMendixObject Emailobject)
	{
		super(context);
		this.Tokenobject = Tokenobject;
		this.ReplaceValue = ReplaceValue;
		this.__Emailobject = Emailobject;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.Emailobject = __Emailobject == null ? null : emailtemplate.proxies.Email.initialize(getContext(), __Emailobject);

		// BEGIN USER CODE
		if( !this.Emailobject.getUseOnlyPlainText() )
			this.Emailobject.setHtmlBody(this.Emailobject.getHtmlBody().replace(this.Tokenobject, this.ReplaceValue));
		this.Emailobject.setPlainBody(this.Emailobject.getPlainBody().replace(this.Tokenobject, this.ReplaceValue));
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ReplaceCustomToken";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
