package day9.Arrayprogram;

public class Duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,2,1,5,4,6};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
				{
					
					System.out.println("the duplicate element is"+arr[j]);
				}
			}
		}
	}

}
