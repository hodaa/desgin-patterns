import java.util.ArrayList;
import java.util.Iterator;


class Menu implements MenuComponent// composite class should have methods
{

    private  String name;
    ArrayList<MenuComponent> menuComponents=  new ArrayList<MenuComponent>();

     public Menu(String name){
        this.name= name;
     }

    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);

    }
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChildren(int child)
    {
        return menuComponents.get(child);
    }
 
    public void print()
    {
        System.out.println("This is the "+ name);
         Iterator <MenuComponent> iterator = menuComponents.iterator();
         while(iterator.hasNext()){
           MenuComponent  menuComponent = iterator.next();
           menuComponent.print();
         }
    }

}