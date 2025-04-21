package mainpkg.garmentsindustry;

import java.time.LocalDate;
import java.util.Date;

public class LeaveRequest {
    private String LeaveType;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String contactinfo;
    private String reason;

    public LeaveRequest(String leaveType, LocalDate startDate, LocalDate endDate, String contactinfo, String reason) {
        LeaveType = leaveType;
        StartDate = startDate;
        EndDate = endDate;
        this.contactinfo = contactinfo;
        this.reason = reason;
    }

    public String getLeaveType() {
        return LeaveType;
    }

    public void setLeaveType(String leaveType) {
        LeaveType = leaveType;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    @Override
    public String toString() {
        return "LeaveRequest{" +
                "LeaveType='" + LeaveType + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", contactinfo='" + contactinfo + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}