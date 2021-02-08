
class WeatherStation
{

public static void main(String[] args){
	
	WeatherData weatherData = new WeatherData();
	MobileDisplay mobileDisplay = new MobileDisplay(weatherData);

	
	weatherData.setMeasurement(80, 47, 140);
	weatherData.setMeasurement(4, 44, 33);


	


	}

}