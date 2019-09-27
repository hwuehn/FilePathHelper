package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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

    public List<String> makeRelativePathAbsolute() {
        final String homeDirectory = "C:\\Users\\itk20user";
        final String currentWorkingDirectory = "C:\\Users\\itk20user\\Projekte\\FilePathHelper";

        String filePath = Paths.get(String.valueOf(testPath)).toString();
        System.out.println(filePath);

        // C:\Users\itk20user\Projekte\FilePathHelper\src\de.company.filepathhelper\data
//        Stream.of(filePath)
//                .map( e -> e.replaceFirst("~",homeDirectory )
//                            .replaceFirst(".", currentWorkingDirectory)).forEach(System.out::println);

        String path;
        List<String> pathAsList = new ArrayList<>();

        while (true) {
            if (filePath.isEmpty()) break;
            int anzahlZeichen = anzahlBisTrenner(filePath);
            System.out.println(anzahlZeichen);
            String wort = schneideWort(anzahlZeichen , filePath);
            System.out.println(wort);
            pathAsList.add(wort);
            filePath = filePath.substring(anzahlZeichen + 1);
            System.out.println(filePath);
        }
        return pathAsList;
    }

    private static String schneideWort(int anzahlZeichen, String filePath) {
        return filePath.substring(0, anzahlZeichen );
    }

    private static int anzahlBisTrenner(String filePath) {
        return filePath.indexOf("\\", 0);
    }





    public void pathBuilder() {

        List<Integer> list = Arrays.asList(1, -1, 3, 4);
        List<Integer> list2 = ListTool.invertUsingStreams(list);
        list2.stream().forEach(System.out::println);

        String del = "/";
        String path = "";
        boolean flag = false;
        for (int i : list2) {
            String what = String.valueOf(i);
            String delXX = del;
            if (i == -1) {
                flag = true;
            }
            if (flag) {
                flag = false;
                what = "";
                delXX = "";
            }
            path = path + delXX + what;
        }
    }
}
