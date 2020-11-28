package atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Halloworld {

    private int i;

    public Halloworld() {
    }

    private static final int RED = 1;
    public static void main(String[] args) {

        outPrintf();
        Date date = new Date();
        ArrayList list11 = new ArrayList();
        list11.add(1,22);
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void outPrintf() {
        System.out.println("helloworld");
    }

    public void mode1(){
        i = 10;
    }
}

