import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WriteLogFile {
    private static final String PATH_TO_FILE = "d_logFile.txt";

    public void write(String writeString) throws IOException {
        String textDate;

        File cFile = new File(PATH_TO_FILE);
        cFile.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(cFile, true);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        textDate = simpleDateFormat.format(calendar.getTime());
        fileOutputStream.write(textDate.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(": ".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(writeString.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
