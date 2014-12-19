package androidstatusshare;


public class LoginFragment
	extends androidstatusshare.KinveyFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AndroidStatusShare.LoginFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", LoginFragment.class, __md_methods);
	}


	public LoginFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == LoginFragment.class)
			mono.android.TypeManager.Activate ("AndroidStatusShare.LoginFragment, Android-StatusShare, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
