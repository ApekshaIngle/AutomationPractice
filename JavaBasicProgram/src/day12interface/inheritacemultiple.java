package day12interface;
 interface A{
	     int girl=57;
	     void born();
 }
 interface B{
	 int boy=87;
	 void bday();
 }
 interface C{
	 int babygilr=45;
	 void child();
 }
 interface D{
	 int babyboy=98;
	 void infant();
 }
 class interface4 implements A,B,C,D{
	 
	 public void born () { 
		 System.out.println("I am born girl A");
	 }
	 public void bday() {
		 System.out.println("I am bday boy B");
	 }
	 public void child() {
		 System.out.println("I am bdaygirl C");
	 }
	 public void infant() {
		 System.out.println("I am bdayboy D");
	 }
 }
public class inheritacemultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface4 t3=new interface4();
		     t3.bday();
		     t3.born();
		     
		     t3.child();
		     t3.infant();
		     System.out.println("bdayboy :"+D.babyboy);
		     System.out.println("bdaygirl :"+C.babygilr);
		     System.out.println("Girl :"+A.girl);
		     System.out.println("Boy :"+B.boy);
	}

}
