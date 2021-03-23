
public class LightOnCommand implements Command 
{
	Light light;

	public LightOnCommand(Light light)
	{
		this.light = light;

	}

	public void excute()
	{
	   light.onMe();
	}
	
	public void undo()
	{
	   light.off();
	}
	
}