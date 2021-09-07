class Client{

    public static void main (String args[])
    {
        Menu allMenus =new Menu("General Menu");
        Menu dinnerMenu = new Menu("Dinner Menu");
        Menu dessertMenu = new Menu("Dessert Menu");
        dinnerMenu.add(new MenuItem("Drinks"));
        // dinnerMenu.add(dessertMenu);

        allMenus.add(dinnerMenu);
        allMenus.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}