package palindrome;

/**
 * 回文数
 *
 * @author: clarity
 * @date: 2022年09月11日 9:40
 */
public class Main {
    /*
    * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
    * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
    * */
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        // 用于记录数组逆向顺序的数组下标
        int j = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[j]) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPalindrome(121));
        System.out.println(main.isPalindrome(-121));
        System.out.println(main.isPalindrome(10));
    }
}
