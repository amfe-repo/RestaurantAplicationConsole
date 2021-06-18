package restauranlogic.model;

public class Invoice {
    
    private String nameInvoice;
    private String dniClient;
    private float priceInvoice;
    private float changeMoney;
    
    public Invoice(String name, String dni, float price, float change) {
        
        this.nameInvoice = name;
        this.dniClient = dni;
        this.priceInvoice = price;
        this.changeMoney = change;
        
    }

    public String getNameInvoice() {
        return nameInvoice;
    }

    public void setNameInvoice(String nameInvoice) {
        this.nameInvoice = nameInvoice;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public float getPriceInvoice() {
        return priceInvoice;
    }

    public void setPriceInvoice(float priceInvoice) {
        this.priceInvoice = priceInvoice;
    }

    public float getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(float changeMoney) {
        this.changeMoney = changeMoney;
    }
   
}
