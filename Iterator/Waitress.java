
// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

class Waitress
{

	DinerMenu dinerMenu;

	PanCakeMenu panCakeMenu;
	
	public Waitress(DinerMenu dinerMenu, PanCakeMenu panCakeMenu)
	{
		this.panCakeMenu = panCakeMenu;
		this.dinerMenu = dinerMenu;

	}

	public void printMenu()
	{
		System.out.println("start of the menue");

		Iterator panCakeIterator = panCakeMenu.createIterator();

		printMenu(panCakeIterator);

	}


	public void printMenu(Iterator iterator)
	{
		while(iterator.hasNext()){

			//MenuItem menuItem = iterator.next();
			System.out.println(iterator);
		}

	}
}