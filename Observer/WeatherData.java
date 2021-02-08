
import java.util.ArrayList;

public class WeatherData implements Subject
{

	 public float  haze;
	 public float temperature;
	 public float humidity;
	 private ArrayList<Observer> observers;


	 public WeatherData()
	 {
	 	observers = new  ArrayList<Observer>();
	
	 }


	 public  void setMeasurement(float haze, float temperature, float humidity)
	 {
	 	this.haze= haze;
		this.temperature = temperature;
		this.humidity =humidity;
		this.notifyObserver();


	 }

	 public void registerObserver(Observer o){
	 	observers.add(o);

	 }

	 public void removeObserver(Observer o){
	 	this.observers.remove(o);

	 }

	 public void notifyObserver(){

	 	for(Observer observer: observers)	
	 	{
	 			observer.update(haze,temperature,humidity);
	 	}	

	 }


	
}