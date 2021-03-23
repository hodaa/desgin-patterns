class Espersso extends Beverage
{
	Beverage beverage;

	String description;


	public Espersso(Beverage beverage){
		
		this.beverage = beverage;

		description = "Espersso";

	}

	public String getDescription()
	{

		return beverage.getDescription() + "essperso";
	}

	public double cost()
	{
		return  10.0;
	}

}
	
