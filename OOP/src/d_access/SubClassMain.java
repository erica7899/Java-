package d_access;
import d_access.sub.*;
public class SubClassMain extends Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassMain me = new SubClassMain();
		//me.a="private change";
		me.b="public change";
		me.c="proteced change";//부모 자식 간에는 가능
		//me.d="default change";//동일 폴더만 접근 가능

	}

}
