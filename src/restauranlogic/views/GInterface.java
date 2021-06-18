package restauranlogic.views;

import consoleviews.ConsoleTools;

public abstract class GInterface {
    
    //protected int sizeView = 0;
    public int optionInterfaceSelection;
    protected GInterface lastView;
    protected String title = "";
   
    public abstract boolean drawView();
    
    public void goBack(){
        
        ConsoleTools.cleanConsole();
        
        if(!this.lastView.drawView()) this.drawView();
        this.optionInterfaceSelection = this.lastView.optionInterfaceSelection;
        
    }
}
