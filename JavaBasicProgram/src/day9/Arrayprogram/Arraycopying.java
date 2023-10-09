package day9.Arrayprogram;

public class Arraycopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // first a[]=10,20,30,40,50----------> second b[] =10,20,30,40,50.
		int[] original= {10,20,30,40,50};
		int[] copy=original;
		   System.out.println("original lenth is :");
         for(int j=0;j<original.length;j++) {
	   System.out.println(original [j]);
	    
	   System.out.println("copy length is :");
	   for(int i=0;j<copy.length;j++) {
		   System.out.println(copy [j]);
	   }
   }
         
}
}