package mainpkg.garmentsindustry;

public class WorkerProfile {
    String WorkerName;
    int Age;
    String Gender;
    int PhoneNumber;
    String Address;

    public WorkerProfile(String workerName, int age, String gender, int phoneNumber, String address) {
        WorkerName = workerName;
        Age = age;
        Gender = gender;
        PhoneNumber = phoneNumber;
        Address = address;
    }

    public String getWorkerName() {
        return WorkerName;
    }

    public void setWorkerName(String workerName) {
        WorkerName = workerName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Worker Details:\n" +
                "WorkerName = '" + WorkerName + "'\n" +
                "Age = " + Age + "\n" +
                "Gender = '" + Gender + "'\n" +
                "PhoneNumber = " + PhoneNumber + "\n" +
                "Address = '" + Address + "'";
    }
}
