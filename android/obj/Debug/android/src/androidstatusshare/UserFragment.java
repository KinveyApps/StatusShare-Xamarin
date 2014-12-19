package androidstatusshare;


public class UserFragment
	extends androidstatusshare.KinveyFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AndroidStatusShare.UserFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", UserFragment.class, __md_methods);
	}


	public UserFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == UserFragment.class)
			mono.android.TypeManager.Activate ("AndroidStatusShare.UserFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
