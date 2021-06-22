public class Mocha extends Condiment 
{

	Beverage beverage;

	public Mocha(Beverage beverage)
	{
		this.beverage =beverage;

	}

	public   String getDescription(){
		 return "moch";


	}

	public double cost()
	{

		 return 15.0+ beverage.cost();
	}

}
