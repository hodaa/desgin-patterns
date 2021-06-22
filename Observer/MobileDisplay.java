class MobileDisplay implements Observer
{
	 public float haze;
	 public float temperature;
	 public float humidity;


	public MobileDisplay(Subject weatherData)
	{
		weatherData.registerObserver(this);

	}
	

	public void update(float haze,float emperature, float humidity){

		this.haze= haze;
		this.temperature = temperature;
		this.humidity =humidity;

		this.display();

	}

	public void display()
	{
		System.out.println ("Current Haze: " +haze);

	}

	

	
}