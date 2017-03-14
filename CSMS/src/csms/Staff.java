package csms;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Staff {
    
    private final SimpleIntegerProperty staffId = new SimpleIntegerProperty();
    private final SimpleStringProperty staffFirstName = new SimpleStringProperty();
    
    public Staff(int staffId, String staff_F_Name){
        setStaffId(staffId);
        
    }
    
    public int getStaffId() {
        return staffId.get();
    }
    public void setStaffId(int staffId) {
        this.staffId.set(staffId);
    }
    
    public String getStaffName() {
        return staffFirstName.get();
    }
    
    public void setStaffName(String staff_F_Name) {
        staffFirstName.set(staff_F_Name);
    }
    
    
    
    
    
}