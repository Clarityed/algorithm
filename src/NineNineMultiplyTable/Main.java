package NineNineMultiplyTable;

/**
 * 打印九九乘法表
 *
 * @author: clarity
 * @date: 2023年03月21日 15:18
 */
public class Main {

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 9; i++) {
            k++;
            for (int j = 1; j <= k; j++) {
                if (j == k) {
                    System.out.println(j + "*" + i + "=" + (i * j));
                } else {
                    System.out.print(j + "*" + i + "=" + (i * j) + " ");
                }
            }
        }
    }
}
