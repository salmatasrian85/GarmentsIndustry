package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class WorkerAttendance {

    private String workerID;
    private String workerName;
    private LocalDate attendanceDate;

    public WorkerAttendance(String workerID, String workerName, LocalDate attendanceDate) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.attendanceDate = attendanceDate;
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
}
