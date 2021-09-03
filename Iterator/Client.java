class Client
{
	
	public static void main (String args[]){

		DinerMenu dinerMenu= new DinerMenu();
		PanCakeMenu panCakeMenu = new PanCakeMenu();

		Waitress waitress = new Waitress(dinerMenu, panCakeMenu);
		waitress.printMenu();
	}
}