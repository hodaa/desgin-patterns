public class Light
{

	public  boolean onLight = false; 


	public void onMe()
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