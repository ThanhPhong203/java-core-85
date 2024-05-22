import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();

    }
}
