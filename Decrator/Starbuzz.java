class Starbuzz
 {

	public static void main(String args[])
	{
		Beverage  beverage = new Espersso(new Latte());

		System.out.println(beverage.cost());
	

	}
}