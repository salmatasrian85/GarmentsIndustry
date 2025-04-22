package mainpkg.garmentsindustry;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrainingProgCreate {
    private String title;
    private String description;
    private LocalDate date;
    private String time;
    private int maxParticipants;


    public TrainingProgCreate(String title, String description, LocalDate date, String time, int maxParticipants) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.maxParticipants = maxParticipants;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Override
    public String toString() {
        return "Created Successfullly\n" +
                "title=" + title + '\n' +
                "description= " + description  +"\n"+
                " date=" + date +"\n"+
                "time='" + time + "\n" +
                "maxParticipants=" + maxParticipants ;
    }
}
