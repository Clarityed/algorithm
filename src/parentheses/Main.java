package parentheses;

/**
 * 有效的括号
 *
 * @author: clarity
 * @date: 2022年09月15日 12:17
 */
public class Main {

    /*
    * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
    * 有效字符串需满足：
    *    1. 左括号必须用相同类型的右括号闭合。
    *    2. 左括号必须以正确的顺序闭合。
    *    3. 每个右括号都有一个对应的相同类型的左括号。
    */

    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int temp = i;
            if (chars.length == 1) {
                break;
            }
            if (chars[i] == '{' && chars[i + 1] == '}') {
                if (chars.length % 2 == 0) {
                    i++;
                    if (chars.length == i + 1) {
                        return true;
                    }
                } else {
                    return false;
                }
                // 暂存 i 的值，用来判断 i 在当前循环中，是否有加1
                if (temp != i) {
                    i++;
                }
                continue;
            }
            if (chars[i] == '[' && chars[i + 1] == ']') {
                if (chars.length % 2 == 0) {
                    i++;
                    if (chars.length == i + 1) {
                        return true;
                    }
                } else {
                    return false;
                }
                // 暂存 i 的值，用来判断 i 在当前循环中，是否有加1
                if (temp != i) {
                    i++;
                }
                continue;
            }
            if (chars[i] == '(' && chars[i + 1] == ')') {
                if (chars.length % 2 == 0) {
                    i++;
                    if (chars.length == i + 1) {
                        return true;
                    }
                } else {
                    return false;
                }
                // 暂存 i 的值，用来判断 i 在当前循环中，是否有加1
                if (temp != i) {
                    i++;
                }
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Main MyMain = new Main();
        String s = "{[({)}]}";
        System.out.println(MyMain.isValid(s));

    }

}
