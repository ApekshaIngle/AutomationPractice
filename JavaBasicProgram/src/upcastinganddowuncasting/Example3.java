package upcastinganddowuncasting;
    class fruits2{
    	void shape2() {
    		System.out.println("I am a methode");
    	}
    	void color2() {
    		System.out.println("green color");
    	}
    }
    class Apple2 extends fruits2{
    	 public void taste2() {
    		System.out.println("i am c methode ");
    	}
    	 public void calling() {
    		System.out.println("i am calling ");
    	}
    	public void color2() {
    		System.out.println("red color ");
    	}
    }
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fruits2 r=new Apple2();
             r.color2();
             r.shape2();
             Apple2 a1=(Apple2)r;
                   a1.calling();
                   a1.color2();
                   a1.taste2();
                   a1.shape2();
              
              
	}

}
