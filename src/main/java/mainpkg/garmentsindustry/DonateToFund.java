package mainpkg.garmentsindustry;

public class DonateToFund {
    private String memberId;
    private String fullName;
    private String donationField;
    private double amount;
    private String paymentMethod;

    public DonateToFund(String memberId, String fullName, String donationField, double amount, String paymentMethod) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.donationField = donationField;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDonationField() {
        return donationField;
    }

    public void setDonationField(String donationField) {
        this.donationField = donationField;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "DonateToFund{" +
                "memberId='" + memberId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", donationField='" + donationField + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
