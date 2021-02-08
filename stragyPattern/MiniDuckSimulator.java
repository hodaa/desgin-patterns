

class MiniDuckSimulator extends Duck {


	public static void main(String[] args)
	{
		
		Duck duck = new Duck();
		duck.setFlyBehavior(new FlyWithWings());
		duck.preformFly();

		// duck.display();
	}



	public void display(){
		System.out.println("I am mini Duck");
	}


}