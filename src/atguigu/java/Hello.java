package atguigu.java;

import java.util.Arrays;

/**
 * @author WenHui Li
 * @data 2020/11/28 - 14:58
 */
public class Hello {
    private static final int RED = 1;
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        System.out.println("ss");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        System.out.println("true = " + true);
        System.out.println(num1);

        String[] strings = {"11", "22", "33"};
        for (String ss : strings) {

        }


    }
    public void testHello (String s){
        System.out.println("OK");

    }

}
