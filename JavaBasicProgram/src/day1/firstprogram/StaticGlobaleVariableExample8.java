package day1.firstprogram;

public class StaticGlobaleVariableExample8 {
static long mark;
static int math;
static short English;
static byte history;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of marks is :"+StaticGlobaleVariableExample8.mark);
System.out.println("default value of math is :"+StaticGlobaleVariableExample8.math);
System.out.println("default value of English is :"+StaticGlobaleVariableExample8.English);
System.out.println("default value of history is :"+StaticGlobaleVariableExample8.history);
System.out.println("update value ");
StaticGlobaleVariableExample8.mark=45;
StaticGlobaleVariableExample8.math=56;
StaticGlobaleVariableExample8.English=60;
StaticGlobaleVariableExample8.history=45;
System.out.println("update value of mark is :"+StaticGlobaleVariableExample8.mark);
System.out.println("update value of math is :"+StaticGlobaleVariableExample8.math);
System.out.println("update value of English is :"+StaticGlobaleVariableExample8.English);
System.out.println("update value of history is :"+StaticGlobaleVariableExample8.history);
	}

}
