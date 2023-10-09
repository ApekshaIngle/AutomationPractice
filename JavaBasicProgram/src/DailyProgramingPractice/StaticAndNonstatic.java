package DailyProgramingPractice;

public class StaticAndNonstatic {
      static int a;
      static long b;
      static float c;
      static double d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("default value of a "+StaticAndNonstatic.a);
   System.out.println("default value of b "+StaticAndNonstatic.b);
   System.out.println("default value of c"+StaticAndNonstatic.c);
   System.out.println("default value of d "+StaticAndNonstatic.d);
   System.out.println("update value ====================");
   StaticAndNonstatic.a=34;
   StaticAndNonstatic.b=56;
   StaticAndNonstatic.c=87;
   StaticAndNonstatic.d=97;
   System.out.println("update value of a"+StaticAndNonstatic.a);
   System.out.println("update value of b"+StaticAndNonstatic.b);
   System.out.println("update value of c"+StaticAndNonstatic.c);
   System.out.println("update value of d"+StaticAndNonstatic.d);
	}

}
