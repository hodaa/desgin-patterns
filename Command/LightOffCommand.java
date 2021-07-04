class LightOffCommand implements Command
{
	
	Light light;

	public LightOffCommand(Light light)
	{
		this.light = light;

	}
	public void excute()
	{
	   light.on();
	}

	public void undo()
	{
	   light.off();
	}

	
}