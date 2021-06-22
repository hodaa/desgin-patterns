public class Latte extends Beverage
{
	Beverage beverage;


	String description;

	public  Latte(Beverage beverage)
	{
		this.beverage = beverage;
		description = "Latte";
	}

	public double cost()
	{

		return  3.0+ beverage.cost();
	}
	
}