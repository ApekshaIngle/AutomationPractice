package ExceptionHandling;

public class NullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Apeksha";
        try {
        	System.out.println(s.toUpperCase());
        }
        catch(NullPointerException n){
        	System.out.println("Null can't be casted ");
        }
	}

}
