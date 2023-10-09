package day9.Arrayprogram;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []b=new int[10];
     System.out.println(b[0]);
     System.out.println(b[1]);
     System.out.println(b[2]);
     System.out.println(b[3]);
     System.out.println(b[4]);
     System.out.println(b[5]);
     System.out.println(b[6]);
     System.out.println(b[7]);
     System.out.println(b[8]);
     System.out.println(b[9]);
     System.out.println("=======after initilazation======");
    b[0]=10;
    b[1]=20;
    b[2]=30;
    b[3]=40;
    b[4]=50;
    b[5]=60;
    b[6]=70;
    b[7]=80;
    b[8]=90;
    b[9]=100;

    System.out.println(b[0]);
    System.out.println(b[1]);
    System.out.println(b[2]);
    System.out.println(b[3]);
    System.out.println(b[4]);
    System.out.println(b[5]);
    System.out.println(b[6]);
    System.out.println(b[7]);
    System.out.println(b[8]);
    System.out.println(b[9]);
    System.out.println("=============================");
   for(int a:b) {
	   System.out.println(a);
   }
   System.out.println("======clone=====");
   int []clonearray=b.clone();
   for(int a:clonearray) {
	   System.out.println(a);
   }
   Arrays.sort(b);
        for (int a:b) {
        	System.out.println(b);
        }
	}

}
