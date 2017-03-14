package csms;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Services {
    
    private final SimpleIntegerProperty serviceId = new SimpleIntegerProperty();
    private final SimpleStringProperty serviceName = new SimpleStringProperty();
    
    public Services(int serviceId, String sName){
        setServiceId(serviceId);
        
    }
    
    public int getServiceId() {
        return serviceId.get();
    }
    public void setServiceId(int serviceId) {
        this.serviceId.set(serviceId);
    }
    
    public String getServiceName() {
        return serviceName.get();
    }
    
    public void setServiceName(String sName) {
        serviceName.set(sName);
    }
    
    
    
    
    
}
