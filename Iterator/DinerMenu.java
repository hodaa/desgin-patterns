
import java.util.Iterator;

public class DinerMenu
{
	
	MenuItem[] menuItems;


	public DinerMenu()
	{
		addItem("egg", "very small");

	}

	public void addItem(String name, String description)
	{
		MenuItem menuItem =new MenuItem(name,description);

	}


	public Iterator createIterator()
	{
		 return new DinerMenuIterator(menuItems);
	}

}