class Client
{

	 public static void main(String[] args) 
	 {
	 	Light light = new Light();

	 	LightOnCommand lightOnCommand = new LightOnCommand(light);
	 	LightOffCommand lightOffCommand = new LightOffCommand(light);

	 	GarageDoorCommand garageOpenDoor = new GarageDoorCommand(); // command

	 	RemoteControl remoteControl = new RemoteControl(); //invektor

	 	remoteControl.setCommand(lightOnCommand);
	 	remoteControl.setCommand(lightOffCommand);
	 	
	 	remoteControl.setCommand(garageOpenDoor);

	 }
	
}