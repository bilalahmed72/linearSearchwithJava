package mypkg;
import java.util.*;

public class linearSearch {

    public static void main(String[] args) {

        // LINEAR SEARCH
        int[] myArr = {2, 5, 7, 8, 12, 35, 37, 57, 64, 78, 86, 94};
        int x = 37;
//        boolean found = false;

        for (int a = 0; a < myArr.length; a++) {
            if (myArr[a] == x) {
//                found = true;
                System.out.println("Found at index: " + a);
//                found = true;
                break;
            } else {
                System.out.println("Not found..");
            }
        }

        } // main class end

    } // public class end

