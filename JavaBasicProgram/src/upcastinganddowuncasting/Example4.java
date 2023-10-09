package upcastinganddowuncasting;
 class A{
	 void a() {
		 System.out.println("I am a methode ");
	 }
	 void b() {
		 System.out.println("I am b methode ");
	 }
 }
 class B extends A{
	 void c() {
		 System.out.println("I am c methode ");
	 }
	 @Override
     void a() {
		 System.out.println("I am override methode");
	 }
 }
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A p=new B();
         p.a();
         p.b();
         B l=(B)p;
         l.a();
         l.b();
         l.c();
	}

}
