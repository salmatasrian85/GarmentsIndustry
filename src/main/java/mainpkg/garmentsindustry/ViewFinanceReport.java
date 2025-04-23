package mainpkg.garmentsindustry;

import java.time.LocalDate;

public class ViewFinanceReport {
    private  String type;
    private   String description;
    private LocalDate date;

    public ViewFinanceReport(String type, LocalDate date, String description) {
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "ViewFinanceReport{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
