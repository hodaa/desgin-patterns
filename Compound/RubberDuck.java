public class RubberDuck  implements Quackable
{
    public void quack(){
        
        Subject subject = new Subject();
        Observer observer= new Observer();

        subject.register(observer);
        subject.notifyMe();


        System.out.println("Squezze");
    
    }
}