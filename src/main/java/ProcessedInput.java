import java.time.LocalDate;
import java.util.Objects;

public class ProcessedInput {
    private String mailDestination;
    private LocalDate mailReceptionDate;
    private String mailId;

    public ProcessedInput(String mailDestination, LocalDate mailReceptionDate, String mailId) {
        this.mailDestination = mailDestination;
        this.mailReceptionDate = mailReceptionDate;
        this.mailId = mailId;
    }

    public String getMailDestination() {
        return mailDestination;
    }

    public LocalDate getMailReceptionDate() {
        return mailReceptionDate;
    }

    public String getMailId() {
        return mailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessedInput that = (ProcessedInput) o;
        return Objects.equals(mailDestination, that.mailDestination) &&
                Objects.equals(mailReceptionDate, that.mailReceptionDate) &&
                Objects.equals(mailId, that.mailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailDestination, mailReceptionDate, mailId);
    }

    @Override
    public String toString() {
        return "ProcessedInput{" +
                "mailDestination='" + mailDestination + '\'' +
                ", mailReceptionDate=" + mailReceptionDate +
                ", mailId='" + mailId + '\'' +
                '}';
    }
}
