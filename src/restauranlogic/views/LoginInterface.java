package restauranlogic.views;

import java.util.Scanner;
import consoleviews.ConsoleTools;

public class LoginInterface extends GInterface {
    
    private final String userName;
    private final String userPass;
    
    public LoginInterface(){
        this.title = "LOGIN";
        this.userName = "admin";
        this.userPass = "12345";
    }
    
    public LoginInterface(GInterface lastView){
        this.userName = "admin";
        this.userPass = "12345";
        this.title = "LOGIN";
        this.lastView = lastView; 
    }
    
    public boolean verifyPassword(String user, String pass){
        return !(!user.equals(this.userName) || !pass.equals(this.userPass));
    }
    
    @Override
    public boolean drawView() {
        
        String user = "", pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            System.out.println(" -------------------------------------------------------------- ");
            System.out.println("|                     | BURGERS AND MORE |                     |");
            System.out.println("|                                                              |");
            System.out.println("|                           | "+this.title+" |                          |");
            System.out.println("|                                                              |");
            System.out.println("|                    ----------------------                    |");
            System.out.print("                      User: ");
            user = sc.nextLine();
            System.out.print("                      Password: ");
            pass = sc.nextLine();
            System.out.println("|                    ----------------------                    |");
            System.out.println("|                                                              |");
            
            if(verifyPassword(user, pass))
            {
                System.out.println("|                          [CORRECTO]                          |");
                ConsoleTools.finishConsole();
                return true;
            }
            else
            {
                System.out.println("|                         [INCORRECTO]                         |");
                ConsoleTools.finishConsole();
                return false;
            }
            
            //sc.close();
            
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        
    }
    
    
}
