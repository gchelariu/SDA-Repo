package com.sda.fisiere;

/*
 * Describes the behaviour of the file
 * */

import java.util.List;

public interface IFileManipulator {

    String ABSOLUTE_PATH = "C:\\Users\\gabri\\Desktop\\absolutFile.txt";
    String RELATIVE_PATH = IFileManipulator.class.getClassLoader().getResource("relativeFile.txt").getPath();

    List<String> readFromFile (PathType pathType);

    void writeToFile(List<String> linesToWrite);
}
