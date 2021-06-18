package restaurantsystem;


import restauranlogic.views.GInterface;
import restauranlogic.views.CreateView;

public class RestaurantSystem {
    
    public static void main(String[] args) {
        
        //Create app views
        GInterface app;
        CreateView createViewComp = new CreateView();
        
        app = createViewComp.createInterface(0);
        
        if(app.drawView()) //Login sucessfully
        {
            app = createViewComp.createInterface(1);
            app.drawView();
            
            while (app.optionInterfaceSelection >= 0 && app.optionInterfaceSelection < 3) 
            {       
                app = createViewComp.createInterface(app.optionInterfaceSelection+1);
                app.drawView();
                
            }
            
            System.out.println("Adios");
        }
     
    }
    
}
