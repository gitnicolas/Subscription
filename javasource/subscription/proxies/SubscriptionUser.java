// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package subscription.proxies;

public class SubscriptionUser
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject subscriptionUserMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Subscription.SubscriptionUser";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DisclaimerAccepted("DisclaimerAccepted"),
		SubscriptionUser_User("Subscription.SubscriptionUser_User");

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

	public SubscriptionUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Subscription.SubscriptionUser"));
	}

	protected SubscriptionUser(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject subscriptionUserMendixObject)
	{
		if (subscriptionUserMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Subscription.SubscriptionUser", subscriptionUserMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Subscription.SubscriptionUser");

		this.subscriptionUserMendixObject = subscriptionUserMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SubscriptionUser.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static subscription.proxies.SubscriptionUser initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return subscription.proxies.SubscriptionUser.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static subscription.proxies.SubscriptionUser initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new subscription.proxies.SubscriptionUser(context, mendixObject);
	}

	public static subscription.proxies.SubscriptionUser load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return subscription.proxies.SubscriptionUser.initialize(context, mendixObject);
	}

	public static java.util.List<subscription.proxies.SubscriptionUser> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<subscription.proxies.SubscriptionUser> result = new java.util.ArrayList<subscription.proxies.SubscriptionUser>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Subscription.SubscriptionUser" + xpathConstraint))
			result.add(subscription.proxies.SubscriptionUser.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DisclaimerAccepted
	 */
	public final java.lang.Boolean getDisclaimerAccepted()
	{
		return getDisclaimerAccepted(getContext());
	}

	/**
	 * @param context
	 * @return value of DisclaimerAccepted
	 */
	public final java.lang.Boolean getDisclaimerAccepted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DisclaimerAccepted.toString());
	}

	/**
	 * Set value of DisclaimerAccepted
	 * @param disclaimeraccepted
	 */
	public final void setDisclaimerAccepted(java.lang.Boolean disclaimeraccepted)
	{
		setDisclaimerAccepted(getContext(), disclaimeraccepted);
	}

	/**
	 * Set value of DisclaimerAccepted
	 * @param context
	 * @param disclaimeraccepted
	 */
	public final void setDisclaimerAccepted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean disclaimeraccepted)
	{
		getMendixObject().setValue(context, MemberNames.DisclaimerAccepted.toString(), disclaimeraccepted);
	}

	/**
	 * @return value of SubscriptionUser_User
	 */
	public final system.proxies.User getSubscriptionUser_User() throws com.mendix.core.CoreException
	{
		return getSubscriptionUser_User(getContext());
	}

	/**
	 * @param context
	 * @return value of SubscriptionUser_User
	 */
	public final system.proxies.User getSubscriptionUser_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SubscriptionUser_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SubscriptionUser_User
	 * @param subscriptionuser_user
	 */
	public final void setSubscriptionUser_User(system.proxies.User subscriptionuser_user)
	{
		setSubscriptionUser_User(getContext(), subscriptionuser_user);
	}

	/**
	 * Set value of SubscriptionUser_User
	 * @param context
	 * @param subscriptionuser_user
	 */
	public final void setSubscriptionUser_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User subscriptionuser_user)
	{
		if (subscriptionuser_user == null)
			getMendixObject().setValue(context, MemberNames.SubscriptionUser_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SubscriptionUser_User.toString(), subscriptionuser_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return subscriptionUserMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final subscription.proxies.SubscriptionUser that = (subscription.proxies.SubscriptionUser) obj;
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
		return "Subscription.SubscriptionUser";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
