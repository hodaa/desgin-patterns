class Client
{

	 public static void main(String[] args) 
	 {
	 	Light light = new Light(); // reciver


	 	RemoteControl remoteControl = new RemoteControl(); //invektor

	 	remoteControl.setCommand(new LightOnCommand(light));
	 	remoteControl.setCommand(new LightOffCommand(light));
	 	
	 	remoteControl.setCommand(GarageDoorCommand garageDoorCommand);

	 }
	
}