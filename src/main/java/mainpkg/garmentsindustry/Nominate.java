package mainpkg.garmentsindustry;

public class Nominate {
    String workerName;
    int workeId;
    String awardCategory;
    String reason;


    @Override
    public String toString() {
        return "Nominate{" +
                "workerName='" + workerName + '\'' +
                ", workeId=" + workeId +
                ", awardCategory='" + awardCategory + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public Nominate(String workerName, int workeId, String awardCategory, String reason) {
        this.workerName = workerName;
        this.workeId = workeId;
        this.awardCategory = awardCategory;
        this.reason = reason;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkeId() {
        return workeId;
    }

    public void setWorkeId(int workeId) {
        this.workeId = workeId;
    }


    public String getAwardCategory() {
        return awardCategory;
    }

    public void setAwardCategory(String awardCategory) {
        this.awardCategory = awardCategory;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
