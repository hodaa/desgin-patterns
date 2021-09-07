class Client
{
	
	public static void main (String[] args) 
	{ 
		Singletone object = Singletone.getInstance();
		object.printMe();

	}
}