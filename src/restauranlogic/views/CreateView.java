package restauranlogic.views;

import java.util.ArrayList;
import java.util.List;

public class CreateView {
    
    public List<GInterface> listInterfaces = new ArrayList<GInterface>();
    
    public CreateView(){
        listInterfaces.add(new LoginInterface());
        listInterfaces.add(new MainInterface(new LoginInterface()));
        listInterfaces.add(new ClientInterface(new MainInterface(new LoginInterface())));
        listInterfaces.add(new OrderInterface(new MainInterface(new LoginInterface())));
    }
    
    public GInterface createInterface(int id) {
        
        return listInterfaces.get(id);
  
    }
    
}
