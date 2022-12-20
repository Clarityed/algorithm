package longestCommonPrefix;

/**
 * 最长公共前缀
 *
 * @author: clarity
 * @date: 2022年09月12日 10:27
 */
public class Main {

    /*
    * 编写一个函数来查找字符串数组中的最长公共前缀。
    * 如果不存在公共前缀，返回空字符串 ""。
    * */

    public String longestCommonPrefix(String[] strs) {
        // 用于存放结果
        String result = "";

        // 判断两个时执行的，也是两个及两个以上要运行的
        if (strs.length > 1) {
            char[] chars1 = strs[0].toCharArray();
            char[] chars2 = strs[1].toCharArray();

            // 第一个字符串和第二个字符串，在循环外面进行比较
            // 首先要比较出哪个字符串比较长，比较短的字符长作为循环的次数
            if (chars1.length >= chars2.length) {
                for (int i = 0; i < chars2.length; i++) {
                    if (chars1[i] != chars2[i]) {
                        break;
                    }
                    result += String.valueOf(chars1[i]);
                }
            }
            if (chars1.length < chars2.length) {
                for (int i = 0; i < chars1.length; i++) {
                    if (chars1[i] != chars2[i]) {
                        break;
                    }
                    result += String.valueOf(chars1[i]);
                }
            }


            // 判断三个及三个以上的循环
            for (int i = 2; i < strs.length; i++) {
                String temp = "";
                char[] charsFor = strs[i].toCharArray();
                char[] tempStr = result.toCharArray();

                if (charsFor.length >= tempStr.length) {
                    if (strs[i] == "") {
                        result = "";
                    }
                    for (int j = 0; j < tempStr.length; j++) {
                        if (charsFor[j] != tempStr[j]) {
                            result = temp;
                            break;
                        }
                        temp += String.valueOf(charsFor[j]);
                        if (j == tempStr.length - 1) {
                            result = temp;
                        }
                    }
                }

                if (charsFor.length < tempStr.length) {
                    if (strs[i] == "") {
                        result = "";
                    }
                    for (int j = 0; j < charsFor.length; j++) {
                        if (charsFor[j] != tempStr[j]) {
                            result = temp;
                            break;
                        }
                        temp += String.valueOf(charsFor[j]);
                        if (j == charsFor.length - 1) {
                            result = temp;
                        }
                    }
                }

            }
        }

        if (strs.length == 1) {
            result = strs[0];
        }

        return result;

    }

    public static void main(String[] args) {
        Main myMain = new Main();
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"he", ""};
        String[] strs4 = {};
        String[] strs5 = {"abab","aba",""};
        System.out.println(myMain.longestCommonPrefix(strs1));
    }

}