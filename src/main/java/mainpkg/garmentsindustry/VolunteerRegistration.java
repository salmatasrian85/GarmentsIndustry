package mainpkg.garmentsindustry;

public class VolunteerRegistration {
    private String name;
    private String memberId;
    private String activityArea;
    private String motivation;
    private boolean workedBefore;

    public VolunteerRegistration(String name, String memberId, String activityArea, String motivation, boolean workedBefore) {
        this.name = name;
        this.memberId = memberId;
        this.activityArea = activityArea;
        this.motivation = motivation;
        this.workedBefore = workedBefore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getActivityArea() {
        return activityArea;
    }

    public void setActivityArea(String activityArea) {
        this.activityArea = activityArea;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public boolean isWorkedBefore() {
        return workedBefore;
    }

    public void setWorkedBefore(boolean workedBefore) {
        this.workedBefore = workedBefore;
    }

    @Override
    public String toString() {
        return "VolunteerRegistration{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", activityArea='" + activityArea + '\'' +
                ", motivation='" + motivation + '\'' +
                ", workedBefore=" + workedBefore +
                '}';
    }
}
