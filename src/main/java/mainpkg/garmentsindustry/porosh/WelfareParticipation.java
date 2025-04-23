package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class WelfareParticipation {
    private String workerId;
    private String name;
    private String department;
    private String programName;
    private LocalDate enrolledDate;

    public WelfareParticipation(String workerId, String name, String department, String programName, LocalDate enrolledDate) {
        this.workerId = workerId;
        this.name = name;
        this.department = department;
        this.programName = programName;
        this.enrolledDate = enrolledDate;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getProgramName() {
        return programName;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }
}
