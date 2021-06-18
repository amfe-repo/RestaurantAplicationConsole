package restaurantsystem;


import restauranlogic.views.GInterface;
import restauranlogic.views.CreateView;

public class RestaurantSystem {
    
    public static void main(String[] args) {
        
        GInterface app;
        CreateView createViewComp = new CreateView();
        
        app = createViewComp.createInterface(0);
        
        if(app.drawView())
        {
            app = createViewComp.createInterface(1);
            app.drawView();
            
            while (app.optionInterfaceSelection >= 0) 
            {       
                app = createViewComp.createInterface(app.optionInterfaceSelection+1);
                app.drawView();
                
            }

        }
     
    }
    
}
