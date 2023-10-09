package day9.Arrayprogram;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[]=new int [5];
       System.out.println(array[0]);
       System.out.println(array[1]);
       System.out.println(array[2]);
       System.out.println(array[3]);
       System.out.println(array[4]);
       System.out.println("===========================");
               array[0]=10; 
    	       array[1]=20;
    	       array[2]=30;
    	       array[3]=40;
    	       array[4]=50;
    	       System.out.println(array[0]);
    	       System.out.println(array[1]);
    	       System.out.println(array[2]);
    	       System.out.println(array[3]);
    	       System.out.println(array[4]);
    	       System.out.println("===========================");
    	       for(int a:array) {
    	    	   System.out.println(a);
    	       }

      Arrays.sort(a);
	}

}
