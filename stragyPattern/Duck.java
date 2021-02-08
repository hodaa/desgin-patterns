class Duck
{

	FlyBehavior flyBehavior;


	public void setFlyBehavior(FlyBehavior fl){

		flyBehavior = fl;
	}
	
	public static void main(String[] args)
	{

		System.out.println("main class");

	}

	public void preformFly(){

		flyBehavior.fly();	
	}

	public void display(){

		System.out.println("I am ducke");

	}
}