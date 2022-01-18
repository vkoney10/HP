
public class StaticVar {

	
int a=30;
	static int b=30;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=40;
		StaticVar Obj1 = new StaticVar();
		Obj1.m();
		
		StaticVar Obj2 = new StaticVar();
		Obj2.m();
		StaticVar Obj3 = new StaticVar();
		Obj3.m();
	}
	void m() {
		 b++;
	a++;
	System.out.println("a="+a+ "b="+b);
	}
	
}
