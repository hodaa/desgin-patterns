class MenuItem implements MenuComponent  //leaf node
{
    private String name;
 
    public MenuItem(String name)
    { 
        this.name = name;
    }
    public void print(){
        System.out.println("I am sub menu " + name);
    }
}