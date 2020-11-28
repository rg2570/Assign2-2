import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemProcessorImpl implements ItemProcessor {

    @Override
    public HashMap<String, HashMap<LocalDate, String>> processItem(ArrayList<ProcessedInput> items) {
        HashMap<String, HashMap<LocalDate, String>> resultHashmap = new HashMap<>();

        for(ProcessedInput item : items)
        {
            if (!resultHashmap.containsKey(item.getMailDestination()))
            {
                resultHashmap.put(item.getMailDestination(), new HashMap<LocalDate, String>());
            }
            if (!resultHashmap.get(item.getMailDestination()).containsKey(item.getMailReceptionDate()))
            {
                resultHashmap.get(item.getMailDestination()).put(item.getMailReceptionDate(), item.getMailId());
            }
        }
        return resultHashmap;
    }
}
