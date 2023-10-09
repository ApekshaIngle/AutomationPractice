package day8.inheritance;

class tomato{
	int fruitsage;
	tomato(){
		System.out.println("fruits class cons ");	
		fruitsage=7;

	}
	public void test() {
		System.out.println("fruits is sweet");
	}
}
class batato extends tomato{
	int fruitsage;
	batato(){
	   System.out.println("mango class cons");
		fruitsage=5;

   }
   public void test() {
	   System.out.println("mango are the tart in test");
   }
   public void shape(int i) {
	   System.out.println("mango are round in shape");
   }
}
public class inheritene8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		batato e1= new batato();
            e1.shape(78);
            e1.test();
            System.out.println(e1.fruitsage);
            tomato e2= new tomato();
             e2.test();
             System.out.println(e2.fruitsage);
            System.out.println("===============================");
            tomato e3=new batato();
                e3.test();
                System.out.println(e3.fruitsage);
                System.out.println("=======================");
                batato e4= new batato();
                   e4.test();
                   System.out.println(e4.fruitsage);
	}

}
