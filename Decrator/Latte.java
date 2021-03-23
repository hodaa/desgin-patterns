public class Latte extends Beverage
{
	Beverage beverage;


	String description;

	public  Latte(Beverage beverage)
	{
		beverage = beverage;
		description = "Latte";
	}

	public double cost(){

		return beverage.cost() + 10.0;

	}
	
}