public class Light  implements Reciver
{ 

	public  boolean onLight = false; 


	public void on()
	{
 		this.onLight = true;
 	    System.out.println("The light is On");
	 	  
	 }

	 public void off()
	{
 		this.onLight = false;
 	    System.out.println("The light is Off");
	 	  
	 }
	
}