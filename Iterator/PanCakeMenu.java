import java.util.Iterator;
import java.util.ArrayList;

class PanCakeMenu
{
	
	ArrayList <MenuItem> menuItems;

	
	public PanCakeMenu()
	{	 
		addItem("sandwaithc","delisious");

	}


	public void addItem(String name , String descripiton)
	{
	 		MenuItem menuItem=  new MenuItem(name,descripiton);
	 		menuItems.add(menuItem);

	}



	public Iterator createIterator()
	{
		 return new PanCakeMenuIterator(menuItems);
	}
	
}