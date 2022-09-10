/*
Rhiana Thelemaque
CS313
Lab 1
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {
    public static void main(String args[]) {
        try {
            File file = new File("/home/icp/file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException fnf) {
            System.out.println("No file found!");
        }
    }
//    public static void main(String[] args) {
//        // getting the multiplication table of a number to n*12
//        Tester.multiplicationTable(24);
//
//        // getting the factorial of a number
//        int fact = Tester.factorial(5);
//        System.out.println(fact);
//    }
//
//
//    static void multiplicationTable(int n) {
//        for (int i = 1; i <= n*12; i++) {
//            int val = i * n;
//            System.out.println(String.format("%d * %d = %d", i, n, val));
//        }
//    }

//    static int factorial(int fact) {
//        if (fact == 0) {
//            return 1;
//        }
//        return fact * factorial(fact - 1);
//    }
}
