package mainpkg.garmentsindustry.porosh;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Grievance {
    private final StringProperty workerId;
    private final StringProperty complaintId;
    private final StringProperty workerName;
    private final StringProperty department;
    private final StringProperty typeOfComplaint;

    public Grievance(String workerId, String complaintId, String workerName, String department, String typeOfComplaint) {
        this.workerId = new SimpleStringProperty(workerId);
        this.complaintId = new SimpleStringProperty(complaintId);
        this.workerName = new SimpleStringProperty(workerName);
        this.department = new SimpleStringProperty(department);
        this.typeOfComplaint = new SimpleStringProperty(typeOfComplaint);
    }

    public StringProperty workerIdProperty() { return workerId; }
    public StringProperty complaintIdProperty() { return complaintId; }
    public StringProperty workerNameProperty() { return workerName; }
    public StringProperty departmentProperty() { return department; }
    public StringProperty typeOfComplaintProperty() { return typeOfComplaint; }
}
