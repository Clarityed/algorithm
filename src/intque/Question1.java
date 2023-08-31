package intque;

/**
 * 给你一个整数 n，请怕判断 n 是否为丑数。如果是，返回 true；否则，返回 false。
 * 注意：丑数是只包含质因数 2、3 和 5 的 正整数。
 * 注意：质因数是能整除给定正整数的质数
 * 注意：质数是指在大于 1 的自然数中，除了 1 和它本身以外不再有其他因数的自然数。
 *
 * @author: clarity
 * @date: 2023年08月03日 10:44
 */
public class Question1 {

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        if (n <= 5) {
            return true;
        }
        // i = 2，3，4，5 其中 4 虽然不是质因子，但是能被 4 整除的，肯定能被 2 整除
        for (int i = 2; i <= 5; ++i) {
            // 如果余数为 0，表示能被整除，并且如果符合丑数，肯定能被整除
            while (n % i == 0) {
                n /= i;
            }
            if (n == 1) {
                break;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.println(question1.isUgly(1));
        System.out.println(question1.isUgly(6));
        System.out.println(question1.isUgly(14));
        System.out.println(question1.isUgly(501));
        System.out.println(question1.isUgly(13));
        System.out.println(question1.isUgly(16));
    }
}
