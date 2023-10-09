package polymorphism;
class Animal{
	void eat() {
		System.out.println("Animal eat");
	}
}
class herbivores extends Animal{
	void eat() {
		System.out.println("herbivores eat plants");
	}
}
class omnivores extends Animal{
	void eat () {
		System.out.println("omnivores eat plants and meat");
	}
}
class carnivores extends Animal {
	void eat () {
		System.out.println("carnivores eat meat");
	}
}
public class Runtimepolymorphis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Animal a=new Animal ();
         a.eat();
         Animal b=new herbivores();
         b.eat();
         Animal c=new omnivores();
         c.eat();
         Animal d=new carnivores();
         d.eat();
	}

}
