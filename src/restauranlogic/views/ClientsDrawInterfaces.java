package restauranlogic.views;

import restauranlogic.model.Client;
import java.util.Scanner;
import consoleviews.ConsoleTools;
import java.util.ArrayList;
import java.util.List;

public class ClientsDrawInterfaces {

    public String titleDNI = "DNI Select";
        
    public Client drawAdd(String title) {
        
        String name = "", dni = "", phone = "", location = "";
        
        Scanner sc = new Scanner(System.in);
        
        ConsoleTools.cleanConsole();
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+title+" Add Client"+"                                       |");
        System.out.println("|                                                              |");
        System.out.print(" Name: ");
        name = sc.nextLine();
        System.out.print(" Dni: ");
        dni = sc.nextLine();
        System.out.print(" Phone: ");
        phone = sc.nextLine();
        System.out.print(" Location: ");
        location = sc.nextLine();
        
        return new Client(name, dni, phone, location);
    }
    public void drawSearch(List<Client> clientList, String title) {
        
        String dni = "";
        int id = 0;
        
        dni = drawDniView(titleDNI);
        
        id = searchId(clientList, dni);
        
        ConsoleTools.cleanConsole();
        try 
        {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("|"+title+" Search Client"+"                                                              |");
            System.out.println("|                                                              |");
            System.out.print("1. Name: ");
            System.out.println(clientList.get(id).getClientName());
            System.out.print("2. Location: ");
            System.out.println(clientList.get(id).getClientLocation());
            System.out.print("3. Dni: ");
            System.out.println(clientList.get(id).getClientDni());
            System.out.print("4. Phone: ");
            System.out.println(clientList.get(id).getClientPhone());
        }
        catch (Exception e) 
        {
            System.out.println("No existe ese usuario");
        }
        
    }
    public int drawDelete(List<Client> clientList, String title) {
        
        int id = 0;
        
        String dni = "";
        
        dni = drawDniView(titleDNI);
        
        id = searchId(clientList, dni);
        
        ConsoleTools.cleanConsole();
        try {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("|"+title+" Delete Client"+"                                                              |");
            System.out.println("|[OldClient]                                                   |");
            System.out.print("1. Name: ");
            System.out.println(clientList.get(id).getClientName());
            System.out.print("2. Location: ");
            System.out.println(clientList.get(id).getClientLocation());
            System.out.print("3. Phone: ");
            System.out.println(clientList.get(id).getClientPhone());
            System.out.println(" -------------------------------------------------------------- ");
        }
        catch(Exception e)
        {
            System.out.println("No existe ese usuario");
        }
        
        return id;
        
    }
    public Client drawUpdate(List<Client> clientList, String title) {
        
        String dni = "";
        int id = 0;
        
        dni = drawDniView(titleDNI);
        
        id = searchId(clientList, dni);
        
        ConsoleTools.cleanConsole();
        
        try {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("|"+title+" Update Client"+"                                                              |");
            System.out.println("|[OldInformation]                                              |");
            System.out.print("1. Name: ");
            System.out.println(clientList.get(id).getClientName());
            System.out.print("2. Location: ");
            System.out.println(clientList.get(id).getClientLocation());
            System.out.print("3. Phone: ");
            System.out.println(clientList.get(id).getClientPhone());
            System.out.println(" -------------------------------------------------------------- ");
        }
        catch(Exception e)
        {
            System.out.println("No existe ese usuario");
        }
        
        return createClient(dni);

    }
    
    public int searchId(List<Client> clientList, String dni){
        
        int counter = 0;
        
        for(Client cl : clientList){    
            if (cl.getClientDni().equals(dni)) break;        
            counter++;
        }
        
        return counter;
    }
    
    public String drawDniView(String title){
        String dni;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|"+title+"                                                              |");
        System.out.println("|                                                              |");
        System.out.print(" DNI: ");
        
        dni = sc.nextLine();
        
        ConsoleTools.cleanConsole();
        
        return dni;
   
    }
    
    private Client createClient(String dni){
        
        String name = "", phone = "", location = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" -------------------------------------------------------------- ");
        System.out.println("|                     | BURGERS AND MORE |                     |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.print(" Name: ");
        name = sc.nextLine();
        System.out.print(" Phone: ");
        phone = sc.nextLine();
        System.out.print(" Location: ");
        location = sc.nextLine();
        
        return new Client(name, dni, phone, location);
    }

}
