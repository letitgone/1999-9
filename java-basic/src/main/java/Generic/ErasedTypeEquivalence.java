package Generic;

import java.util.ArrayList;

/**
 * @Author ZhangGJ
 * @Date 2020/11/28 07:50
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
