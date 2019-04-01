package jinsanjun.yueer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        ArrayList list = new ArrayList();
        list.add(123);
        try {
            FileInputStream fil = new FileInputStream("xxx.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        System.out.println();
//        synchronized ()


    }
}
