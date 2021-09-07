public class Singletone
{
	private Singletone(){};

	private static Singletone uniqueInstance;

	//private static Singletone uniqueInstance=  new Singletone(); //eager loading

	public static synchronized Singletone getInstance()
	{
		if(uniqueInstance == null){ //lazy loading

			uniqueInstance = new Singletone();
		}

		return uniqueInstance;
		

	}
	 public void  printMe(){
		 System.out.println("I am singletone class");
	 }

}