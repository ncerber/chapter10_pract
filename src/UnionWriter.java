import java.io.IOException;

public class UnionWriter {
    private WriteLogFile writeLogFile;
    private WriteMinuteFile writeMinuteFile;

    public UnionWriter() {
        this.writeLogFile = new WriteLogFile();
        this.writeMinuteFile = new WriteMinuteFile();
    }

    public void write(String writeString) throws IOException {
        writeLogFile.write(writeString);
        writeMinuteFile.write(writeString);
    }
}
