package com.icp.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String args[]) {
        try {
            File file = new File("/home/icp/file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }
    }
}