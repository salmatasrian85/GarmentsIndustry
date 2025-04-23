package mainpkg.garmentsindustry;


import java.time.LocalDate;

public class TrainingProgramme {
    private String name;
    private String trainingType;
    private LocalDate preferredDate;
    private String time;
    private boolean currentlyWorking;

    public TrainingProgramme(String name, String trainingType, LocalDate preferredDate, String time, boolean currentlyWorking) {
        this.name = name;
        this.trainingType = trainingType;
        this.preferredDate = preferredDate;
        this.time = time;
        this.currentlyWorking = currentlyWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public LocalDate getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public boolean isCurrentlyWorking() {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    @Override
    public String toString() {
        return "TrainingProgramme{" +
                "name='" + name + '\'' +
                ", trainingType='" + trainingType + '\'' +
                ", preferredDate=" + preferredDate +
                ", time='" + time + '\'' +
                ", currentlyWorking=" + currentlyWorking +
                '}';
    }


}
