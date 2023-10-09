package day4;

public class ReverseNumberForloop {

	public static void main(String[] args) {
		
     int num=123;
    int sum=0;
     for(; num>0;) {
    	int r= num % 10;
    	sum=sum* 10 +r;
    	num=num/10;
     }
    	System.out.println(sum);
	}

}
