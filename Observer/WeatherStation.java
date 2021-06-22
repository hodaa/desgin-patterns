
class WeatherStation
{

public static void main(String[] args){
	
	WeatherData weatherData = new WeatherData(); // subject 
	MobileDisplay mobileDisplay = new MobileDisplay(weatherData); // subscribe to subject

	
	weatherData.setMeasurement(80, 47, 140);
	weatherData.setMeasurement(4, 44, 33);


	}

}