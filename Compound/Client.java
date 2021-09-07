class Client{
     public static void main(String[] args)
     {
        Simulator sim = new Simulator();

        RubberDuck rubberDuck = new RubberDuck();
        Decorator deco = new Decorator(new RubberDuck());
        sim.simulate(deco);

        // RubberDuck rubberDuck = new RubberDuck();
        Decorator deco2 = new Decorator(new RubberDuck());
        sim.simulate(deco2);

        GooseAdapter goose = new GooseAdapter(new Goose());
        sim.simulate(goose);

        System.out.println(deco.getCount());
        // Subject subject = new Subject();
        // Observer observer= new Observer();

        // subject.register(observer);
        // subject.notifyMe();

    }
}