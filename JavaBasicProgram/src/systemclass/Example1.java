package systemclass;//usefull methode //
  class Ref{
	  void calling() {
		  System.out.println("I am calling methode of ref class");
	  }
  }
public class Example1 {
     static Ref r1=new Ref();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  Ref r1=new Ref();
     //     r1.calling();
		Example1.r1.calling();
  //classname.staticrefrence of refcalss.nonstaticmthodeofrefclass
		System.out.println("Hello");
 //classname.staticrefrenceofprintsteamclass.nonstaicmethodeofprintsteamclass
		System.err.println("bye");
	System.out.println("user home dir :"+System.getProperty("user.home"));
	System.out.println("current working dir :"+System.getProperty("user.dir"));
	System.out.println("current working dir :"+System.getProperty("user.name"));
	System.out.println("current working dir :"+System.getProperty("java.home"));
	System.out.println("current working dir :"+System.getProperty("os.name"));
	
System.setProperty("user.home","C:\\Automation\\Workspace\\JavaBasicProgram\r\n"	+ "");
	System.out.println("updatet user home dir"+System.getProperty("user.home"));
	
	System.out.println("system time in nano"+System.nanoTime());
	System.out.println("system time in millis"+System.currentTimeMillis());
	System.exit(0);
	System.out.println("hello ,hiii");

	}

}
