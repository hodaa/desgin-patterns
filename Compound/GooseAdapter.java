class GooseAdapter implements Quackable {
    
   Goose goose;

    public GooseAdapter(Goose goose)
    {
         this.goose= goose;
    }
     public void quack()
     {
          this.goose.honk();

     }

}