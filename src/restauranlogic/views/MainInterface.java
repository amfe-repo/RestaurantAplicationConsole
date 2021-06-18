package restauranlogic.views;

import consoleviews.ConsoleTools;
import java.util.Scanner;

public class MainInterface extends GInterface {
    
    //public int optionInterfaceSelection = 0;
    
    public MainInterface(){
        this.optionInterfaceSelection = 0;
        this.title = "Main Menu >>";
    }
    
    public MainInterface(GInterface lastView){
        this.optionInterfaceSelection = 0;
        this.title = "Main Menu >>";
        this.lastView = lastView;
    }
    
    @Override
    public boolean drawView() {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        try 
        {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("| "+this.title+"                                                 |");
            System.out.println("|                                                              |");
            System.out.println("| [1] CLIENTS                                                  |");
            System.out.println("| [2] BUY                                                      |");
            System.out.println("| [3] CLOSE                                                    |");
            System.out.println("|                                                              |");
            
            System.out.print(" Select a option: ");
            
            optionInterfaceSelection = Integer.parseInt(sc.nextLine());
            
            ConsoleTools.cleanConsole();
            

        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }    
           
        return true; 
    }

}