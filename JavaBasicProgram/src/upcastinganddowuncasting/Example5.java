package upcastinganddowuncasting;
class sbi{
	void homeloan() {
		System.out.println("sbi homeloan");
	}
	void accounttype() {
		System.out.println("saving account");
	}
}
class icic extends sbi{
	void carloan() {
		System.out.println("icic carloan");
	}
	@Override
	public void accounttype() {
		System.out.println("current account");
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           sbi p1=new icic();//upcasting
            p1.accounttype();
            p1.homeloan();
            System.out.println("======================");
            icic s1=(icic)p1;
              s1.accounttype();
              s1.homeloan();
              s1.carloan();
	}

}
