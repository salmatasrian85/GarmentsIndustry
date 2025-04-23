package mainpkg.garmentsindustry.porosh;

import java.time.LocalDate;

public class WelfareBudgetRequest {

    private String requestId;
    private String department;
    private String description;
    private String proposedBudget;
    private String currentFundAvailable;
    private String amount;
    private LocalDate submissionDate;

    public WelfareBudgetRequest(String requestId, String department, String amount, LocalDate submissionDate,
                                String description, String proposedBudget, String currentFundAvailable) {
        this.requestId = requestId;
        this.department = department;
        this.description = description;
        this.proposedBudget = proposedBudget;
        this.currentFundAvailable = currentFundAvailable;
        this.amount = amount;
        this.submissionDate = submissionDate;
    }

    // Getters and Setters
    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getProposedBudget() { return proposedBudget; }
    public void setProposedBudget(String proposedBudget) { this.proposedBudget = proposedBudget; }

    public String getCurrentFundAvailable() { return currentFundAvailable; }
    public void setCurrentFundAvailable(String currentFundAvailable) { this.currentFundAvailable = currentFundAvailable; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    public LocalDate getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(LocalDate submissionDate) { this.submissionDate = submissionDate; }
}
