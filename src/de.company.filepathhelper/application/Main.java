package application;

import data.PathManager;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        PathManager test = new PathManager();
        //test.testFilePath();
        test.testFilePath(new File("src\\de.company.filepathhelper\\data\\PathManager.java"));
        test.pathAbsoluteOrRelative();


    }
}
