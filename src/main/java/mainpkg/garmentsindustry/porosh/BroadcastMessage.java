package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class BroadcastMessage {

    private String announcementTitle;
    private String audience;
    private LocalDate scheduleDate;
    private String recipientName;
    private String department;
    private boolean seen;

    public BroadcastMessage(String announcementTitle, String audience, LocalDate scheduleDate, String recipientName, String department, boolean seen) {
        this.announcementTitle = announcementTitle;
        this.audience = audience;
        this.scheduleDate = scheduleDate;
        this.recipientName = recipientName;
        this.department = department;
        this.seen = seen;
    }

    public String getAnnouncementTitle() { return announcementTitle; }
    public void setAnnouncementTitle(String announcementTitle) { this.announcementTitle = announcementTitle; }

    public String getAudience() { return audience; }
    public void setAudience(String audience) { this.audience = audience; }

    public LocalDate getScheduleDate() { return scheduleDate; }
    public void setScheduleDate(LocalDate scheduleDate) { this.scheduleDate = scheduleDate; }

    public String getRecipientName() { return recipientName; }
    public void setRecipientName(String recipientName) { this.recipientName = recipientName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public boolean isSeen() { return seen; }
    public void setSeen(boolean seen) { this.seen = seen; }
}
