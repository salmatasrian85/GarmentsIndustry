package mainpkg.garmentsindustry;

import java.time.LocalDate;

public class ReportSafetyProblem {
    private String workerName;
    private int workerId;
    private  String department;
    private String issueTitle;
    private LocalDate dateObserved;
    private String location ;
    private String description ;
    private String severity ;

    @Override
    public String toString() {
        return "ReportSafetyProblem{" +
                "workerName='" + workerName + '\n' +
                ", workerId=" + workerId +
                ", department='" + department + '\n' +
                ", issueTitle='" + issueTitle + '\n' +
                ", dateObserved=" + dateObserved +
                ", location='" + location + '\n' +
                ", description='" + description + '\n' +
                ", severity='" + severity + '\n' +
                '}';
    }

    public ReportSafetyProblem(String workerName, int workerId, String department, String issueTitle, LocalDate dateObserved, String location, String description, String severity) {
        this.workerName = workerName;
        this.workerId = workerId;
        this.department = department;
        this.issueTitle = issueTitle;
        this.dateObserved = dateObserved;
        this.location = location;
        this.description = description;
        this.severity = severity;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public LocalDate getDateObserved() {
        return dateObserved;
    }

    public void setDateObserved(LocalDate dateObserved) {
        this.dateObserved = dateObserved;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
