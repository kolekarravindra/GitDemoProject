
public class Test101 {

	public final int a ;
	public Test101(int a) {
	this.a = a;
	}

	public static void main(String[] args) {
	Test101 t = new Test101(10);
	Test101 t1 = new Test101(5);

	System.out.println(t.a);
	System.out.println(t1.a);

	}
	
}
