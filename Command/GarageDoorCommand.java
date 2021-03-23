class GarageDoorCommand implements Command
{
	public void up()
	{
		System.out.println("The door is up");
	}

	public void up()
	{
		System.out.println("The door is Down");
	}

	 public void excute()
	 {
	 	this.up();

	 }

	  public void undo()
	 {
	 	this.down();

	 }
}