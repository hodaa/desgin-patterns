class Client
{
	
	public static void main (String args[]){

		DinerMenu dinerMenu= new DinerMenu();
		PanCakeMenu panCakeMenue = new PanCakeMenu();

		Waitress waitress = new Waitress(dinerMenu, panCakeMenue);
		waitress.printMenu();
	}
}