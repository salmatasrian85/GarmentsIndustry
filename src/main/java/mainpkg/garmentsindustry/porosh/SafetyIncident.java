package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class SafetyIncident {
    private String incidentType;
    private String incidentLocation;
    private LocalDate dateOfIncident;
    private String description;

    public SafetyIncident(String incidentType, String incidentLocation, LocalDate dateOfIncident, String description) {
        this.incidentType = incidentType;
        this.incidentLocation = incidentLocation;
        this.dateOfIncident = dateOfIncident;
        this.description = description;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentLocation() {
        return incidentLocation;
    }

    public void setIncidentLocation(String incidentLocation) {
        this.incidentLocation = incidentLocation;
    }

    public LocalDate getDateOfIncident() {
        return dateOfIncident;
    }

    public void setDateOfIncident(LocalDate dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
