package bootcamp.leetcode.editor.cn;//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2647 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
            return 0;
        }
        int sign = x > 0 ? 1 : -1;
        x = x < 0 ? -x : x;
        char[] array = String.valueOf(x).toCharArray();
        int length = array.length;
        if (length == 1) {
            return x;
        }

        /**
         * 倒叙遍历
         */
        //        char[] newArray = new char[length];
        //        for (int i = length - 1; i >= 0; i--) {
        //            newArray[length - 1 - i] = array[i];
        //        }
        //        long value = Long.valueOf(String.valueOf(newArray));

        /**
         * 左右交换
         */
        int start = 0, end = length - 1;
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        long value = Long.valueOf(String.valueOf(array));
        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
            return 0;
        }
        return  (int) value * sign;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
