package study0619;

import java.io.File;

/**
 * Goal: rename all files in /Users/insane/Desktop/52Hz, change them to "52Hz-00?.png"
 */

public class FileChangeNameDemo {
    public static void main(String args[]) {
        File file = new File("/Users/insane/Desktop/52Hz");

        File[] fileArr = file.listFiles();

        for (int i = 0; i < fileArr.length; i++) {
            String s = "/Users/insane/Desktop/s/52Hz-00" + (i + 1) + ".png";
            File newName = new File(s);
            fileArr[i].renameTo(newName);
        }

    }
}
