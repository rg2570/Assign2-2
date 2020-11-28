import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public interface InputProcessor {

    ArrayList<ProcessedInput> inputProcess(File file) throws IOException;
}
