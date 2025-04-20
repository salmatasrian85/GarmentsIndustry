package mainpkg.garmentsindustry;

import java.time.LocalDate;

public class FinancialAid {
    private int workerId;
    private int amount;
    private String aidType;
    private String reason;
    private boolean accept;


    public FinancialAid(int workerId, int amount, String aidType, String reason, boolean accept) {
        this.workerId = workerId;
        this.amount = amount;
        this.aidType = aidType;
        this.reason = reason;
        this.accept = accept;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAidType() {
        return aidType;
    }

    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    @Override
    public String toString() {
        return "FinancialAid{" +
                "workerId=" + workerId +
                ", amount=" + amount +
                ", aidType='" + aidType + '\'' +
                ", reason='" + reason + '\'' +
                ", accept=" + accept +
                '}';
    }
}
