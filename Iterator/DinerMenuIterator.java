import java.util.Iterator;

class DinerMenuIterator implements Iterator 
{

	MenuItem[] items;

	int position = 0;


	public DinerMenuIterator(MenuItem[] items)
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