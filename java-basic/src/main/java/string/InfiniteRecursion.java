package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2020/11/26 08:38
 */
public class InfiniteRecursion {
    /**
     * use super.toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
