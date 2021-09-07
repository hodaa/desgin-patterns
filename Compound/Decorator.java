class Decorator implements Quackable
{
    static int count = 0;
    
    Quackable quackable;

    public Decorator(Quackable duck){
        this.quackable = duck;
    }
    public void quack()
    {
        this.quackable.quack();
        count ++;
    

    }
    public static int getCount(){
          return count;
    }

}