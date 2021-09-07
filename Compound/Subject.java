import java.util.ArrayList;
class Subject{

    ArrayList<Observer>  observers =   new  ArrayList<Observer>();

    public void register(Observer observer)
    {
        observers.add(observer);

    }
    public void notifyMe(){
       for(Observer observer: observers){
           observer.update();
       }
    }
}