package md5ee656c4160e4884dcca3dc2a663af3b0;


public class Voorraad
	extends md5ee656c4160e4884dcca3dc2a663af3b0.MainActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("LoginSystem.Voorraad, LoginSystem", Voorraad.class, __md_methods);
	}


	public Voorraad ()
	{
		super ();
		if (getClass () == Voorraad.class)
			mono.android.TypeManager.Activate ("LoginSystem.Voorraad, LoginSystem", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
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