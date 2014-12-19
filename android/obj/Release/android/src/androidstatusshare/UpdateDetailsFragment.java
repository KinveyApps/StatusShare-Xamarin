package androidstatusshare;


public class UpdateDetailsFragment
	extends androidstatusshare.KinveyFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AndroidStatusShare.UpdateDetailsFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", UpdateDetailsFragment.class, __md_methods);
	}


	public UpdateDetailsFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == UpdateDetailsFragment.class)
			mono.android.TypeManager.Activate ("AndroidStatusShare.UpdateDetailsFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
