package mainpkg.garmentsindustry;

import java.time.LocalDate;

public class MedicalAid {
    private String name,healthService,time,gender,symptom,description;
    private LocalDate preferredDate;

    public MedicalAid(String name, String healthService, String time, String gender, String symptom, String description, LocalDate preferredDate) {
        this.name = name;
        this.healthService = healthService;
        this.time = time;
        this.gender = gender;
        this.symptom = symptom;
        this.description = description;
        this.preferredDate = preferredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthService() {
        return healthService;
    }

    public void setHealthService(String healthService) {
        this.healthService = healthService;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }

    @Override
    public String toString() {
        return "MedicalAid{" +
                "name='" + name + '\'' +
                ", healthService='" + healthService + '\'' +
                ", time='" + time + '\'' +
                ", gender='" + gender + '\'' +
                ", symptom='" + symptom + '\'' +
                ", description='" + description + '\'' +
                ", preferredDate=" + preferredDate +
                '}';
    }
}
