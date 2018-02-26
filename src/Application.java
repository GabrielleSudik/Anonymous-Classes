//anonymous classes allow extending a class or implementing an interface one time.

class Machine{
	public void start() {
		System.out.println("Starting machine.");
	}
}

interface Plant{
	public void grow();
	//remember interface methods don't have bodies
	//I don't remember why lol
}

public class Application {

	public static void main(String[] args) {
		
		Machine mech1 = new Machine();		
		mech1.start();

		//let's say you want to override "start" in Machine.
		//you could make a whole child class. 
		//or you could do this:
		
		Machine mech2 = new Machine() {
			@Override
			public void start() {
				System.out.println("Overriding the normal method!");
			}
		};
		mech2.start();
		
		//that little thing was actually a child class
		//without a name
		
		//similarly, with interfaces,
		//you can create classes with methods with bodies
		//or use an anonymous class as a one-off
		//and put the method there
		
		Plant plant1 = new Plant() {
			@Override
			public void grow() {
				System.out.println("Plant is growing.");				
			}			
		};
		plant1.grow();
		
		//note above you didn't create a Plant class
		//but you were able to make plant1 "grow"
		//by using an anonymous method
		
		//I get the concept, but don't know when/why it would be used.
	}

}
