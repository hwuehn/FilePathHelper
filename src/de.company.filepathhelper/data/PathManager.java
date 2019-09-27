package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PathManager {

    public static void testFilePath() {
        Scanner s = null;
        try {
            File file = new File("src\\de.company.filepathhelper\\data\\PathManager.java");
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (s.hasNext()) {
            String string = s.nextLine();
            if (string != null) {
                System.out.println(string.lines().count());
            }
        }


    }
}
