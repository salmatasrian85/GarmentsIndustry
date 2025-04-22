package mainpkg.garmentsindustry;

public class ShiftChange {
    private String name;
    private int workerId;
    private String currentShift;
    private String requestedShift;
    private String reason;

    @Override
    public String toString() {
        return "Submitted Succcesfully!\n\n"+
                "name=" + name + '\n' +
                "workerId=" + workerId +
                "currentShift=" + currentShift + '\n' +
                "requestedShift=" + requestedShift + '\n' +
                "reason=" + reason + '\n' ;
    }

    public ShiftChange(String name, int workerId, String currentShift, String requestedShift, String reason) {
        this.name = name;
        this.workerId = workerId;
        this.currentShift = currentShift;
        this.requestedShift = requestedShift;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getCurrentShift() {
        return currentShift;
    }

    public void setCurrentShift(String currentShift) {
        this.currentShift = currentShift;
    }

    public String getRequestedShift() {
        return requestedShift;
    }

    public void setRequestedShift(String requestedShift) {
        this.requestedShift = requestedShift;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
