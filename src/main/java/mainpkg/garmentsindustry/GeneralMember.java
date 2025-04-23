package mainpkg.garmentsindustry;

public class GeneralMember {
    public static String companyPolicyNote = "............";
    private String workerId;
    private String name;
    private double salary;

    public static String getCompanyPolicyNote() {
        return companyPolicyNote;
    }

    public static void setCompanyPolicyNote(String companyPolicyNote) {
        GeneralMember.companyPolicyNote = companyPolicyNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public GeneralMember(String workerId, String name, double salary) {
        this.workerId = workerId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "GeneralMember{" +
                "workerId='" + workerId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
