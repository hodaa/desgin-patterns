public class Singletone
{
	private Singletone(){};

	private static Singletone uniqueInstance;

	public static synchronized Singletone getInstance()
	{
		if(uniqueInstance == null){

			uniqueInstance = new Singletone();
		}

		return uniqueInstance;
		

	}

}