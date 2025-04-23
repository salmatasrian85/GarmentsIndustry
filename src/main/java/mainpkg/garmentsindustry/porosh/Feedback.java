package mainpkg.garmentsindustry.porosh;

import java.time.LocalDateTime;

public class Feedback {
    private String ticketID;
    private String title;
    private String message;
    private String program;
    private String status;
    private LocalDateTime lastUpdated;

    public Feedback(String ticketID, String title, String message, String program, String status, LocalDateTime lastUpdated) {
        this.ticketID = ticketID;
        this.title = title;
        this.message = message;
        this.program = program;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    public String getTicketID() { return ticketID; }
    public String getTitle() { return title; }
    public String getMessage() { return message; }
    public String getProgram() { return program; }
    public String getStatus() { return status; }
    public LocalDateTime getLastUpdated() { return lastUpdated; }
}

