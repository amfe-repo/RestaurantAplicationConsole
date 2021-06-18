package consoleviews;

import java.util.Scanner;

public class ConsoleTools {
    public static void finishConsole(){ 
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|               [PRESIONE ENTER PARA CONTINUAR]                |");
        System.out.println(" -------------------------------------------------------------- ");
        
        sc.nextLine();
        //sc.close();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void cleanConsole(){ 
    
        System.out.println(" -------------------------------------------------------------- ");
       
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
