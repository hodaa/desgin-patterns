
import java.util.Iterator;
class PanCakeMenuIterator implements Iterator
{
	
	MenuItem[] items;

	int position =0;


	public PanCakeMenuIterator(MenuItem[] items)
	{
		this.items = items;

	}


	public MenuItem next()
	{
		MenuItem item = items[position];
		position ++;
		return item;

	}

	


	public boolean hasNext()
	{
		if (position >items.length  || items[position] == null){
			return false;
		}
		else{
			return true;
		}

	}
}