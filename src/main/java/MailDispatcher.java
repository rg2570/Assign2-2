import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public interface MailDispatcher {
    List<DispatchedMail> dispatch(HashMap<String, HashMap<LocalDate, String>> inputHash);
}
