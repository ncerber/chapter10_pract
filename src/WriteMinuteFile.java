import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WriteMinuteFile {
    private String currentFileName;

    private String getFileName(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy_HHmm");
        return "d_"+simpleDateFormat.format(calendar.getTime())+".txt";
    }

    public void write(String writeString) throws IOException{
        String newFileName = getFileName();
        if (!newFileName.equals(currentFileName)){
            currentFileName = newFileName;
        }

        File cFile = new File(currentFileName);
        cFile.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(cFile,true);
        fileOutputStream.write(writeString.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
