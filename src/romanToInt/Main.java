package romanToInt;

import java.util.HashMap;

/**
 * 罗马数字转整数
 *
 * @author: Clarity
 * @date: 2022年09月11日 10:03
 */
public class Main {
    /*
    * 罗马数字包含以下七种字符:I，V，X，L，C，D和M。
    * 字符          数值
    * I             1
    * V             5
    * X             10
    * L             50
    * C             100
    * D             500
    * M             1000
    * 例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
    * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。
    * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
    *       1. I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
    *       2. X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
    *       3. C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
    * 给定一个罗马数字，将其转换成整数。
    * */
    public int romanToInt(String s) {
        HashMap<String, Integer> romanNumber = new HashMap<>();
        romanNumber.put("I", 1);
        romanNumber.put("V", 5);
        romanNumber.put("X", 10);
        romanNumber.put("L", 50);
        romanNumber.put("C", 100);
        romanNumber.put("D", 500);
        romanNumber.put("M", 1000);

        // 存放罗马数字对于的整数总和
        int sum = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) < chars.length && chars[i] == 'I' && chars[i + 1] == 'V') {
                sum += 4;
                i++;
                continue;
            }
            if ((i + 1) < chars.length && chars[i] == 'I' && chars[i + 1] == 'X') {
                sum += 9;
                i++;
                continue;
            }
            if ((i + 1) < chars.length && chars[i] == 'X' && chars[i + 1] == 'L') {
                sum += 40;
                i++;
                continue;
            }
            if ((i + 1) < chars.length && chars[i] == 'X' && chars[i + 1] == 'C') {
                sum += 90;
                i++;
                continue;
            }
            if ((i + 1) < chars.length && chars[i] == 'C' && chars[i + 1] == 'D') {
                sum += 400;
                i++;
                continue;
            }
            if ((i + 1) < chars.length && chars[i] == 'C' && chars[i + 1] == 'M') {
                sum += 900;
                i++;
                continue;
            }
            sum += romanNumber.get(String.valueOf(chars[i]));
        }

        return sum;
    }

    public static void main(String[] args) {
        Main myMain = new Main();
        System.out.println(myMain.romanToInt("MCMXCIV"));
    }
}
