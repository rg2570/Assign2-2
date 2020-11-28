import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class InputProcessorImpl implements InputProcessor
{

    @Override
    public ArrayList<ProcessedInput> inputProcess(File file) throws IOException
    {
        ArrayList<ProcessedInput> inputToArrayList = new ArrayList<>();
        File inputFile = Paths.get("/home/vahid/IdeaProjects/Assign2-2/src/main/java/rawInput.txt").toFile();

        FileReader fr=new FileReader(inputFile);
        BufferedReader br=new BufferedReader(fr);
        StringBuffer sb=new StringBuffer();
        String line;

        while((line=br.readLine())!=null)
        {
            String[] splitter = line.split(" ");
            String mailDestination = splitter[0];
            LocalDate mailReceptionDate = LocalDate.parse(splitter[1]);
            String mailId = splitter[2];

            ProcessedInput newItem = new ProcessedInput(mailDestination, mailReceptionDate, mailId);
            inputToArrayList.add(newItem);
        }
        return inputToArrayList;
    }
}
