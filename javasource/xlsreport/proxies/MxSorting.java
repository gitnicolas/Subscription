// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxSorting
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxSortingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxSorting";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Summary("Summary"),
		Attribute("Attribute"),
		SortingDirection("SortingDirection"),
		MxSorting_MxSheet("XLSReport.MxSorting_MxSheet"),
		MxSorting_MxXPath("XLSReport.MxSorting_MxXPath");

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

	public MxSorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxSorting"));
	}

	protected MxSorting(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxSortingMendixObject)
	{
		if (mxSortingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxSorting", mxSortingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxSorting");

		this.mxSortingMendixObject = mxSortingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxSorting.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static xlsreport.proxies.MxSorting initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxSorting.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxSorting initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxSorting(context, mendixObject);
	}

	public static xlsreport.proxies.MxSorting load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxSorting.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxSorting> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxSorting> result = new java.util.ArrayList<xlsreport.proxies.MxSorting>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxSorting" + xpathConstraint))
			result.add(xlsreport.proxies.MxSorting.initialize(context, obj));
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
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Integer sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of Summary
	 */
	public final java.lang.String getSummary()
	{
		return getSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of Summary
	 */
	public final java.lang.String getSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Summary.toString());
	}

	/**
	 * Set value of Summary
	 * @param summary
	 */
	public final void setSummary(java.lang.String summary)
	{
		setSummary(getContext(), summary);
	}

	/**
	 * Set value of Summary
	 * @param context
	 * @param summary
	 */
	public final void setSummary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String summary)
	{
		getMendixObject().setValue(context, MemberNames.Summary.toString(), summary);
	}

	/**
	 * @return value of Attribute
	 */
	public final java.lang.String getAttribute()
	{
		return getAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute
	 */
	public final java.lang.String getAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute.toString());
	}

	/**
	 * Set value of Attribute
	 * @param attribute
	 */
	public final void setAttribute(java.lang.String attribute)
	{
		setAttribute(getContext(), attribute);
	}

	/**
	 * Set value of Attribute
	 * @param context
	 * @param attribute
	 */
	public final void setAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute)
	{
		getMendixObject().setValue(context, MemberNames.Attribute.toString(), attribute);
	}

	/**
	 * Set value of SortingDirection
	 * @param sortingdirection
	 */
	public final xlsreport.proxies.SortingDirection getSortingDirection()
	{
		return getSortingDirection(getContext());
	}

	/**
	 * @param context
	 * @return value of SortingDirection
	 */
	public final xlsreport.proxies.SortingDirection getSortingDirection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SortingDirection.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.SortingDirection.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SortingDirection
	 * @param sortingdirection
	 */
	public final void setSortingDirection(xlsreport.proxies.SortingDirection sortingdirection)
	{
		setSortingDirection(getContext(), sortingdirection);
	}

	/**
	 * Set value of SortingDirection
	 * @param context
	 * @param sortingdirection
	 */
	public final void setSortingDirection(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.SortingDirection sortingdirection)
	{
		if (sortingdirection != null)
			getMendixObject().setValue(context, MemberNames.SortingDirection.toString(), sortingdirection.toString());
		else
			getMendixObject().setValue(context, MemberNames.SortingDirection.toString(), null);
	}

	/**
	 * @return value of MxSorting_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxSorting_MxSheet() throws com.mendix.core.CoreException
	{
		return getMxSorting_MxSheet(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSorting_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxSorting_MxSheet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxSheet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSorting_MxSheet.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxSheet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSorting_MxSheet
	 * @param mxsorting_mxsheet
	 */
	public final void setMxSorting_MxSheet(xlsreport.proxies.MxSheet mxsorting_mxsheet)
	{
		setMxSorting_MxSheet(getContext(), mxsorting_mxsheet);
	}

	/**
	 * Set value of MxSorting_MxSheet
	 * @param context
	 * @param mxsorting_mxsheet
	 */
	public final void setMxSorting_MxSheet(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxSheet mxsorting_mxsheet)
	{
		if (mxsorting_mxsheet == null)
			getMendixObject().setValue(context, MemberNames.MxSorting_MxSheet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSorting_MxSheet.toString(), mxsorting_mxsheet.getMendixObject().getId());
	}

	/**
	 * @return value of MxSorting_MxXPath
	 */
	public final xlsreport.proxies.MxXPath getMxSorting_MxXPath() throws com.mendix.core.CoreException
	{
		return getMxSorting_MxXPath(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSorting_MxXPath
	 */
	public final xlsreport.proxies.MxXPath getMxSorting_MxXPath(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxXPath result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSorting_MxXPath.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxXPath.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSorting_MxXPath
	 * @param mxsorting_mxxpath
	 */
	public final void setMxSorting_MxXPath(xlsreport.proxies.MxXPath mxsorting_mxxpath)
	{
		setMxSorting_MxXPath(getContext(), mxsorting_mxxpath);
	}

	/**
	 * Set value of MxSorting_MxXPath
	 * @param context
	 * @param mxsorting_mxxpath
	 */
	public final void setMxSorting_MxXPath(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxXPath mxsorting_mxxpath)
	{
		if (mxsorting_mxxpath == null)
			getMendixObject().setValue(context, MemberNames.MxSorting_MxXPath.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSorting_MxXPath.toString(), mxsorting_mxxpath.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxSortingMendixObject;
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
			final xlsreport.proxies.MxSorting that = (xlsreport.proxies.MxSorting) obj;
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
		return "XLSReport.MxSorting";
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
