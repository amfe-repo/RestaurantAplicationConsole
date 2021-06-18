package restauranlogic.views;

import consoleviews.ConsoleTools;
import foodlogic.FoodAdultCart;
import foodlogic.FoodCart;
import foodlogic.FoodChildCart;
import java.util.Scanner;
import restauranlogic.model.Client;
import restauranlogic.model.Invoice;


public class OrderInterface extends GInterface {
    
    private Client actualClient;
    private Invoice actualInvoice;
    
    public OrderInterface() {
        this.title = "Order >> ";
    }
    
    public OrderInterface(GInterface lastview) {
        this.lastView = lastview;
        this.title = "Order >> ";    
    }

    @Override
    public boolean drawView() {
        
        int option = 0;
        
        FoodCart fc;
        Scanner sc = new Scanner(System.in);
        
        findClient();
        
        fc = findMenu();
        
        ConsoleTools.cleanConsole();
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+this.title+" Client: "+this.actualClient.getClientName()+"                                                         |");
        System.out.println("|                                                              |");
        System.out.println("|Menu Available:                                               |");
        System.out.println("|                                                              |");
        System.out.println("|Burgers:                                                      |");
        System.out.println("|[1] "+fc.createBurger().name+"      $ "+fc.createBurger().price+"|");
        System.out.println("|Desserts:                                                     |");
        System.out.println("|[2] "+fc.createDessert().name+"      $ "+fc.createDessert().price+"|"); 
        System.out.print(" Select a option: ");
        
        option = Integer.parseInt(sc.nextLine());
        
        if (option == 1) 
        {
            prepareInvoice(fc.createBurger().price);
        }
        else
        {
            prepareInvoice(fc.createDessert().price);
        }
         
        createInvoice();
        return true;
    }
    
    private String dniView()
    {
        String dni = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+this.title+"                                                             |");
        System.out.println("|                                                              |");
        System.out.print(" DNI: ");
        
        dni = sc.nextLine();
        
        return dni;
    }
    
    private void findClient(){
        
        String dni = "";
        int id = 0;

        dni = dniView();
        ClientsDrawInterfaces cdi = new ClientsDrawInterfaces();
        
        id = cdi.searchId(ClientInterface.clientsList, dni);
        
        this.actualClient = ClientInterface.clientsList.get(id);
    }
    
    private FoodCart findMenu(){
        
        int option = 0;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+this.title+" Client: "+this.actualClient.getClientName()+"                                                         |");
        System.out.println("|                                                              |");
        System.out.println("|Menus Availables:                                             |");
        System.out.println("|                                                              |");
        System.out.println("|[1] Adult Cart                                                |");
        System.out.println("|[2] Child Cart                                                |");
        System.out.print(" Select a option: ");
        
        option = Integer.parseInt(sc.nextLine());
        
        if (option == 1) 
        {
            return new FoodAdultCart();
        }
        
        return new FoodChildCart();
    }
    
    private void prepareInvoice(float price){
        
        float cash = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+this.title+" Client: "+this.actualClient.getClientName()+"                                                         |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.print(" Give me cash: ");
        cash = Float.parseFloat(sc.nextLine());
        
        if (cash > price)
        {
            actualInvoice = new Invoice(this.actualClient.getClientName(), this.actualClient.getClientDni(),
            price, cash - price);
            
            System.out.println("PAGO CORRECTO"); 
        }
        else
        {
            System.out.println("PAGO INCORRECTO"); 
        }
        
         ConsoleTools.finishConsole();
    }
    
    private void createInvoice(){
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|                           [INVOICE]                          |");
        System.out.println("|                                                              |");
        System.out.println("| Client: "+this.actualInvoice.getNameInvoice()+"              |");
        System.out.println("| DNI: "+this.actualInvoice.getDniClient()+"                   |");
        System.out.println("| Price: "+this.actualInvoice.getPriceInvoice()+"              |");
        System.out.println("| Change: "+this.actualInvoice.getChangeMoney()+"              |");
        ConsoleTools.finishConsole();
        
    }
    
}
