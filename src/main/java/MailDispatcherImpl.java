import org.assertj.core.groups.Tuple;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MailDispatcherImpl implements MailDispatcher{

    @Override
    public List<DispatchedMail> dispatch(HashMap<String, HashMap<LocalDate, String>> inputHash) {
        List<DispatchedMail> dispatchedAgenda = new ArrayList<DispatchedMail>();
        LocalDate today = LocalDate.now();
        String checkFlag;

        Set destinations = inputHash.keySet();

        for(Object destination : destinations)
        {
            String mailDestination = destination.toString();
            LocalDate mailReceptionDate = LocalDate.parse(inputHash.get(destination).toString());
            String mailId = inputHash.get(destination).get(mailReceptionDate);
            long days = Period.between(mailReceptionDate, today).getDays();
            if (days >= 3)
            {
                checkFlag = "YES";
            }
            else
            {
                checkFlag = "NO";
            }
            DispatchedMail newIem = new DispatchedMail(mailDestination, mailReceptionDate, mailId, checkFlag);
            dispatchedAgenda.add(newIem);

        }
        return dispatchedAgenda;
    }
}
