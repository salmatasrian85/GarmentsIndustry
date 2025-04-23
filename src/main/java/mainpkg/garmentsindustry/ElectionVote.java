package mainpkg.garmentsindustry;

public class ElectionVote {
    @Override
    public String toString() {
        return "ElectionVote{" +
                "memberId='" + memberId + '\'' +
                ", candidate='" + candidate + '\'' +
                '}';
    }

    private String memberId;
    private String candidate;

    public ElectionVote(String memberId, String candidate) {
        this.memberId = memberId;
        this.candidate = candidate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }
}
