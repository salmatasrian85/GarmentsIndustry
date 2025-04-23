package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class PolicyReviewMeeting {

    private LocalDate meetingDate;
    private String time;
    private String stakeholders;
    private String meetingMode;
    private String agendaTitle;

    public PolicyReviewMeeting(LocalDate meetingDate, String time, String stakeholders, String meetingMode, String agendaTitle) {
        this.meetingDate = meetingDate;
        this.time = time;
        this.stakeholders = stakeholders;
        this.meetingMode = meetingMode;
        this.agendaTitle = agendaTitle;
    }

    public LocalDate getMeetingDate() { return meetingDate; }
    public void setMeetingDate(LocalDate meetingDate) { this.meetingDate = meetingDate; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getStakeholders() { return stakeholders; }
    public void setStakeholders(String stakeholders) { this.stakeholders = stakeholders; }

    public String getMeetingMode() { return meetingMode; }
    public void setMeetingMode(String meetingMode) { this.meetingMode = meetingMode; }

    public String getAgendaTitle() { return agendaTitle; }
    public void setAgendaTitle(String agendaTitle) { this.agendaTitle = agendaTitle; }
}
