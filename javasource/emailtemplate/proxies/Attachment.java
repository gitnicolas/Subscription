// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

public class Attachment extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmailTemplate.Attachment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Attachment_Email("EmailTemplate.Attachment_Email"),
		Attachment_EmailTemplate("EmailTemplate.Attachment_EmailTemplate");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Attachment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmailTemplate.Attachment"));
	}

	protected Attachment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attachmentMendixObject)
	{
		super(context, attachmentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("EmailTemplate.Attachment", attachmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmailTemplate.Attachment");
	}

	/**
	 * @deprecated Use 'Attachment.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emailtemplate.proxies.Attachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emailtemplate.proxies.Attachment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emailtemplate.proxies.Attachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emailtemplate.proxies.Attachment(context, mendixObject);
	}

	public static emailtemplate.proxies.Attachment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emailtemplate.proxies.Attachment.initialize(context, mendixObject);
	}

	public static java.util.List<emailtemplate.proxies.Attachment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emailtemplate.proxies.Attachment> result = new java.util.ArrayList<emailtemplate.proxies.Attachment>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EmailTemplate.Attachment" + xpathConstraint))
			result.add(emailtemplate.proxies.Attachment.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Attachment_Email
	 */
	public final emailtemplate.proxies.Email getAttachment_Email() throws com.mendix.core.CoreException
	{
		return getAttachment_Email(getContext());
	}

	/**
	 * @param context
	 * @return value of Attachment_Email
	 */
	public final emailtemplate.proxies.Email getAttachment_Email(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emailtemplate.proxies.Email result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attachment_Email.toString());
		if (identifier != null)
			result = emailtemplate.proxies.Email.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attachment_Email
	 * @param attachment_email
	 */
	public final void setAttachment_Email(emailtemplate.proxies.Email attachment_email)
	{
		setAttachment_Email(getContext(), attachment_email);
	}

	/**
	 * Set value of Attachment_Email
	 * @param context
	 * @param attachment_email
	 */
	public final void setAttachment_Email(com.mendix.systemwideinterfaces.core.IContext context, emailtemplate.proxies.Email attachment_email)
	{
		if (attachment_email == null)
			getMendixObject().setValue(context, MemberNames.Attachment_Email.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attachment_Email.toString(), attachment_email.getMendixObject().getId());
	}

	/**
	 * @return value of Attachment_EmailTemplate
	 */
	public final emailtemplate.proxies.EmailTemplate getAttachment_EmailTemplate() throws com.mendix.core.CoreException
	{
		return getAttachment_EmailTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of Attachment_EmailTemplate
	 */
	public final emailtemplate.proxies.EmailTemplate getAttachment_EmailTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emailtemplate.proxies.EmailTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attachment_EmailTemplate.toString());
		if (identifier != null)
			result = emailtemplate.proxies.EmailTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attachment_EmailTemplate
	 * @param attachment_emailtemplate
	 */
	public final void setAttachment_EmailTemplate(emailtemplate.proxies.EmailTemplate attachment_emailtemplate)
	{
		setAttachment_EmailTemplate(getContext(), attachment_emailtemplate);
	}

	/**
	 * Set value of Attachment_EmailTemplate
	 * @param context
	 * @param attachment_emailtemplate
	 */
	public final void setAttachment_EmailTemplate(com.mendix.systemwideinterfaces.core.IContext context, emailtemplate.proxies.EmailTemplate attachment_emailtemplate)
	{
		if (attachment_emailtemplate == null)
			getMendixObject().setValue(context, MemberNames.Attachment_EmailTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attachment_EmailTemplate.toString(), attachment_emailtemplate.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final emailtemplate.proxies.Attachment that = (emailtemplate.proxies.Attachment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "EmailTemplate.Attachment";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
