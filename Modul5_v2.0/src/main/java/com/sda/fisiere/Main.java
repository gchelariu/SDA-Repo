package com.sda.fisiere;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        IFileManipulator legacy = new LegacyFileManipulator();
        List<String> lines = legacy.readFromFile(PathType.ABSOLUT);

        printLines(lines);
    }

    private static void printLines(List<String> lines) {
        for(String line : lines){
            System.out.println(line);
        }
    }
}
