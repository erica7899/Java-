package d_access.sub;

public class Access {
	private   String a="private data";
	public    String b="public data";
	protected String c="protectesd data";
		      String d="default";// 아무것도 안붙은걸 defalt
	
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
