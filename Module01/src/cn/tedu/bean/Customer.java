package cn.tedu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Auther: LW
 * @Date: 2020/6/26
 * @Description: cn.tedu.bean
 * @version: 1.0
 */
public class Customer extends Person{
    private Integer age;
    private final static int INITIAL_SIZE = 10;

    public static void main(String[] arg) {
        getNum();
        //region Description
        System.err.println("hello");
        Date date = new Date();
        //endregion
        ArrayList<Object> list = new ArrayList<>();
        method();
    }

    private static void getNum() {
        int num = 10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method(){
        int sum= 11;
    }

    public void eat(){
        System.out.println("客户吃饭");
    }


}
