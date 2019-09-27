package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathManager {

    public File file = null;
    public File testPath = null;
    public Scanner s = null;

    public void testFilePath(File file) {
        try {
            this.file = file;
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.testPath = file;
    }

    public void testFilePath() {
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

    public void makeRelativePathAbsolute() {
        String filePath = Paths.get(String.valueOf(testPath)).toString();
        System.out.println(filePath);

        // C:\Users\itk20user\Projekte\FilePathHelper\src\de.company.filepathhelper\data
//        while (s.hasNext()) {
//            filePath = s.
//        }

    }
}

