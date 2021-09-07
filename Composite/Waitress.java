class Waitress{

    MenuComponent allMenus;

    public Waitress(Menu allMenus){
        this.allMenus = allMenus;

    }

    public void printMenu(){
        System.out.println("I am the waitress");
        allMenus.print();
    }
}