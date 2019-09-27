package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathManager {

    public File testPath;

    public void testFilePath() {
        Scanner s = null;
        File file = null;
        try {
            file = new File("src\\de.company.filepathhelper\\data\\PathManager.java");
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        while (s.hasNext()) {
//            String string = s.nextLine();
//            if (string != null) {
//                System.out.println(string.lines().count());
//            }
//        }
        this.testPath = file;
    }

    public void pathAbsoluteOrRelative() {
        String fileName = Paths.get(String.valueOf(testPath)).toString();
        System.out.println(fileName);

    }



}

