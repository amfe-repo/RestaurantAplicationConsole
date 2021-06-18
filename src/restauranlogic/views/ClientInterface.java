package restauranlogic.views;

import java.util.ArrayList;
import restauranlogic.model.Client;
import java.util.List;
import java.util.Scanner;
import consoleviews.ConsoleTools;

public class ClientInterface extends GInterface {
    
    protected static List<Client> clientsList = new ArrayList<Client>();
    
    
    public ClientInterface() {
        this.title = "CLIENTS >>";
    }
    
    public ClientInterface(GInterface lastView) {
        this.title = "CLIENTS >>";
        this.lastView = lastView;
    }
    
    public void addClient() {
        
        ClientsDrawInterfaces cdi = new ClientsDrawInterfaces();
        
        this.clientsList.add(cdi.drawAdd(this.title));
        ConsoleTools.finishConsole();
        
        this.drawView();
            
    }
    public void updateClient() {
        
        ClientsDrawInterfaces cdi = new ClientsDrawInterfaces();
        
        Client cl = cdi.drawUpdate(this.clientsList, this.title);
        
        this.clientsList.set(cdi.searchId(this.clientsList, cl.getClientDni()), cl);
        
        ConsoleTools.finishConsole();
        this.drawView();
        
    }
    public void searchClient() {
        
        ClientsDrawInterfaces cdi = new ClientsDrawInterfaces();
        cdi.drawSearch(this.clientsList, this.title);
        
        ConsoleTools.finishConsole();
        this.drawView();
        
    }
    public void deleteClient() {
        
        ClientsDrawInterfaces cdi = new ClientsDrawInterfaces();
        
        this.clientsList.remove(cdi.drawDelete(clientsList, this.title));
        
        ConsoleTools.finishConsole();
        this.drawView();
        
    }

    @Override
    public boolean drawView() {
        
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("| "+this.title+"                                                   |");
            System.out.println("|                                                              |");
            System.out.println("| [1] ADD                                                      |");
            System.out.println("| [2] UPDATE                                                   |");
            System.out.println("| [3] SEARCH                                                   |");
            System.out.println("| [4] DELETE                                                   |");
            System.out.println("| [5] BACK                                                     |");
            System.out.println("|                                                              |");
            
            System.out.print(" Select a option: ");

            this.optionInterfaceSelection = Integer.parseInt(sc.nextLine());
            
            ConsoleTools.cleanConsole();

            menuSelection();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }    
           
        return true; 
    }
    
    private void menuSelection(){
        
        switch(this.optionInterfaceSelection){
            case 1:
                this.addClient();
                break;
            case 2:
                this.updateClient();
                break;
            case 3:
                this.searchClient();
                break;
            case 4:
                this.deleteClient();
                break;
            case 5:
                this.goBack();
                break;
            default:
                this.drawView();
        }
        
    }

   
    
}
    
    

