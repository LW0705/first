package cn.tedu;

import cn.tedu.bean.Customer;

import java.util.ArrayList;

/**
 * @Auther: LW
 * @Date: 2020/6/27
 * @Description: cn.tedu.bean
 * @version: 1.0
 *
 * 1.常用的模板
 */
public class TemplatesTest {
    //模板6：prsf
    private static final Customer CUST=new Customer();
    //变形：psf
    public static final int NUM1=1;
    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String NATION="China";


    //模板1：main/psvm
    public static void main(String[] args) {

        //模板2：sout/syso
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num=1;
        System.out.println("num = " + num);
        int num2=10;
        System.out.println(num);

        //模板3：fori
        String[] arr=new String[]{"Tom","Jerry","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(222);
        list.add(321);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr  倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板5：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }
}
