class Starbuzz
 {

	public static void main(String args[])
	{
		Beverage  beverage = new Espersso();

		System.out.println(beverage.cost());




		Beverage  beverage2 = new Mocha(new Espersso());

		System.out.println(beverage2.cost());
	

	}
}