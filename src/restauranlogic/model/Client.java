package restauranlogic.model;

public class Client {
    
    private String clientName;
    private String clientDni;
    private String clientPhone;
    private String clientLocation;

    public Client(String name, String dni, String phone, String location) {
        this.clientName = name;
        this.clientDni = dni;
        this.clientPhone = phone;
        this.clientLocation = location;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientDni() {
        return clientDni;
    }

    public void setClientDni(String clientDni) {
        this.clientDni = clientDni;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }
    
}
