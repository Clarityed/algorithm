package intque;

/**
 * 定义一个方法 demo,传入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数。
 *
 * @author: clarity
 * @date: 2023年08月03日 12:19
 */
public class Question4 {

    public void demo(String str) {
        int engAlpNum = 0;
        int blankNum = 0;
        int albNum = 0;
        int otherCharNum = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 65 && aChar <= 90) {
                engAlpNum++;
            } else if (aChar >= 97 && aChar <= 122) {
                engAlpNum++;
            } else if (aChar == 32) {
                blankNum++;
            } else if (aChar >= 48 && aChar <= 57) {
                albNum++;
            } else {
                otherCharNum++;
            }
        }
        System.out.println(str + "中英文字母个数：" + engAlpNum);
        System.out.println(str + "中空格个数：" + blankNum);
        System.out.println(str + "中数字个数：" + albNum);
        System.out.println(str + "中其它字符个数：" + otherCharNum);
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        String str = "adwA125+++'''..   ";
        question4.demo(str);
    }
}
