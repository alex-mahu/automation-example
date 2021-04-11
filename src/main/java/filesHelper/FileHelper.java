package filesHelper;

import java.io.File;

public class FileHelper {
    public static String getDefaultFilePath() {
        File defaultFile = new File(FileHelper.class.getResource("DefaultFile.txt").getFile());
        return defaultFile.getAbsolutePath();
    }
}
