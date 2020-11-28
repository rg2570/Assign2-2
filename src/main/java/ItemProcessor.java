import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ItemProcessor {
    HashMap<String, HashMap<LocalDate, String>> processItem (ArrayList<ProcessedInput> arrayList);
}
