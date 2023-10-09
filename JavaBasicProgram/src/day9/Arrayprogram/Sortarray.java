package day9.Arrayprogram;
import java.util.Arrays;
import java.util.Scanner;
public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[5];
     Scanner e= new Scanner(System.in);
     System.out.println("Enter elements of array");
     for(int i=0;i<a.length;i++) {
    	 a[i]=e.nextInt();
     }
     Arrays.sort(a);
     for(int i=0;i<a.length;i++) {
System.out.println(a[i] +" ");
	}

	}}
