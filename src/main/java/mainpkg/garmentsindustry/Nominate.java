package mainpkg.garmentsindustry;

public class Nominate {
    String workerName;
    int workeId;
    int PhoneNumber;
    String awardCategory;
    String Address;

    public Nominate(String workerName, int workeId, int phoneNumber, String awardCategory, String address) {
        this.workerName = workerName;
        this.workeId = workeId;
        PhoneNumber = phoneNumber;
        this.awardCategory = awardCategory;
        Address = address;
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAwardCategory() {
        return awardCategory;
    }

    public void setAwardCategory(String awardCategory) {
        this.awardCategory = awardCategory;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Nominate{" +
                "workerName='" + workerName + '\'' +
                ", workeId=" + workeId +
                ", PhoneNumber=" + PhoneNumber +
                ", awardCategory='" + awardCategory + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
