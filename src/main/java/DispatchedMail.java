import java.time.LocalDate;
import java.util.Objects;

public class DispatchedMail {
    String mailDestination;
    LocalDate mailReceptionDate;
    String mailId;
    String checkFlag;

    public DispatchedMail(String mailDestination, LocalDate mailReceptionDate, String mailId, String checkFlag) {
        this.mailDestination = mailDestination;
        this.mailReceptionDate = mailReceptionDate;
        this.mailId = mailId;
        this.checkFlag = checkFlag;
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

    public String getCheckFlag() {
        return checkFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DispatchedMail that = (DispatchedMail) o;
        return mailDestination.equals(that.mailDestination) &&
                mailReceptionDate.equals(that.mailReceptionDate) &&
                mailId.equals(that.mailId) &&
                checkFlag.equals(that.checkFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailDestination, mailReceptionDate, mailId, checkFlag);
    }

    @Override
    public String toString() {
        return "DeparturedMail{" +
                "mailDestination='" + mailDestination + '\'' +
                ", mailReceptionDate=" + mailReceptionDate +
                ", mailId='" + mailId + '\'' +
                ", checkFlag='" + checkFlag + '\'' +
                '}';
    }
}
