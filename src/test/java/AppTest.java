import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppTest {

    @Test
    public void UseInputProcessor() throws IOException {
        InputProcessorImpl ipi = new InputProcessorImpl();
        File input = Paths.get("./rawInput.txt").toFile();
        ArrayList ipiResult = ipi.inputProcess(input);

        assertThat(ipiResult).hasSize(10);
        ipiResult.forEach(i -> System.out.println(i));
    }

    @Test
    public void UseItemProcessor(){
        ItemProcessorImpl itemP = new ItemProcessorImpl();
        SampleList testSample = new SampleList();
        HashMap itemPResult = itemP.processItem(testSample.list1);

        assertThat(itemPResult).hasSize(2);
        assertThat(itemPResult).containsKey("Germany");
        assertThat(itemPResult).containsKey("Italy");


    }

    public static class SampleList {
        public ArrayList<ProcessedInput> list1 = new ArrayList() {{
            add(("'Germany', 2020-11-20, 'AY56T'"));
            add(("'Italy', 2020-11-28', 'AT721'"));
        }};


    }




}
