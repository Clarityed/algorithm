package lengthoflastword;

import java.util.ArrayList;

/**
 * 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * @author: clarity
 * @date: 2022年12月21日 14:52
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        String s4 = "luffy is still joyboy            ";
        String s5 = "a";
        String s6 = "a      ";
        System.out.println(main.lengthOfLastWord(s6));
    }

    public int lengthOfLastWord(String s) {
        // 最后一个单词的大小
        int j = 0;
        // 如果尾部有空格，记录大小
        int l = 0;
        // 开头不是空格的第一个单词长度
        int m = 0;
        char[] chars = s.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 存放组成这个字符串的每个字符
        ArrayList<Character> arrayList2 = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            arrayList2.add(chars[i]);
        }
        // 收集尾部空格
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                l++;
            } else {
                break;
            }
        }
        // 收集开头不是空格的第一个单词长度
        if (arrayList2.contains(' ') && chars[0] != ' ') {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    break;
                }
                m++;
            }
        }
        // 判断开头不是空格的第一个单词长度 + 尾部空格 = 字符长度 ?
        if (l + m == chars.length) {
            return m;
        }
        // 判断是否出现空格
        if (arrayList2.contains(' ')) {
            // 找到空格，计算后面的字符
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    j = chars.length - i - 1;
                    // 记录每个空格之后的字符数
                    arrayList.add(j);
                }
                // 如果列表里面包括 0，表示该字符串末尾有空格
                if (arrayList.contains(0)) {
                    j = arrayList.get(arrayList.size() - 1 - l) - l;
                }
            }
        } else {
            return chars.length;
        }
        return j;
    }
}
