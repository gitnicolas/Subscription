// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package subscription.proxies;

public class Employee
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Subscription.Employee";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		LastName("LastName"),
		FirstName("FirstName"),
		EMail("EMail"),
		Phone("Phone"),
		Search("Search");

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

	public Employee(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Subscription.Employee"));
	}

	protected Employee(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject)
	{
		if (employeeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Subscription.Employee", employeeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Subscription.Employee");

		this.employeeMendixObject = employeeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Employee.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static subscription.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return subscription.proxies.Employee.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static subscription.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new subscription.proxies.Employee(context, mendixObject);
	}

	public static subscription.proxies.Employee load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return subscription.proxies.Employee.initialize(context, mendixObject);
	}

	public static java.util.List<subscription.proxies.Employee> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<subscription.proxies.Employee> result = new java.util.ArrayList<subscription.proxies.Employee>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Subscription.Employee" + xpathConstraint))
			result.add(subscription.proxies.Employee.initialize(context, obj));
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
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of EMail
	 */
	public final java.lang.String getEMail()
	{
		return getEMail(getContext());
	}

	/**
	 * @param context
	 * @return value of EMail
	 */
	public final java.lang.String getEMail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMail.toString());
	}

	/**
	 * Set value of EMail
	 * @param email
	 */
	public final void setEMail(java.lang.String email)
	{
		setEMail(getContext(), email);
	}

	/**
	 * Set value of EMail
	 * @param context
	 * @param email
	 */
	public final void setEMail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.EMail.toString(), email);
	}

	/**
	 * @return value of Phone
	 */
	public final java.lang.String getPhone()
	{
		return getPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone
	 */
	public final java.lang.String getPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Phone.toString());
	}

	/**
	 * Set value of Phone
	 * @param phone
	 */
	public final void setPhone(java.lang.String phone)
	{
		setPhone(getContext(), phone);
	}

	/**
	 * Set value of Phone
	 * @param context
	 * @param phone
	 */
	public final void setPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone)
	{
		getMendixObject().setValue(context, MemberNames.Phone.toString(), phone);
	}

	/**
	 * @return value of Search
	 */
	public final java.lang.String getSearch()
	{
		return getSearch(getContext());
	}

	/**
	 * @param context
	 * @return value of Search
	 */
	public final java.lang.String getSearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Search.toString());
	}

	/**
	 * Set value of Search
	 * @param search
	 */
	public final void setSearch(java.lang.String search)
	{
		setSearch(getContext(), search);
	}

	/**
	 * Set value of Search
	 * @param context
	 * @param search
	 */
	public final void setSearch(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String search)
	{
		getMendixObject().setValue(context, MemberNames.Search.toString(), search);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return employeeMendixObject;
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
			final subscription.proxies.Employee that = (subscription.proxies.Employee) obj;
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
		return "Subscription.Employee";
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
