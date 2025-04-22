package mainpkg.garmentsindustry;

import java.time.LocalDate;

public class Renewal {
    private String memberId;
    private String fullName;
    private LocalDate renewalDate;
    private String duration;

    public Renewal(String memberId, String fullName, LocalDate renewalDate, String duration) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.renewalDate = renewalDate;
        this.duration = duration;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Renewal{" +
                "memberId='" + memberId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", renewalDate=" + renewalDate +
                ", duration='" + duration + '\'' +
                '}';
    }
}
