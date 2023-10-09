
public class Example2Constructor {
      Example2Constructor(){
    	  System.out.println("user define cons : zero param cons");
      }
    	   
      Example2Constructor(int num){
    	  System.out.println("user define cons : int para cons");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2Constructor e1= new Example2Constructor();
		Example2Constructor e2= new Example2Constructor(45);
	}

}
