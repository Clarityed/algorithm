package intque;

import java.util.*;

/**
 * 给你两个数组，arr1 和 arr2
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 * 示例:
 * 输入: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]输出: [2,2,2,1,4,3,3,9,6,7,19]，使用 java 代码实现
 *
 * @author: clarity
 * @date: 2023年08月03日 14:34
 */
public class Question5 {
    public static int[] sortArrayByAnotherArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            list.add(num);
        }

        list.sort((a, b) -> {
            if (map.containsKey(a) && map.containsKey(b)) {
                return map.get(a) - map.get(b);
            } else if (map.containsKey(a)) {
                return -1;
            } else if (map.containsKey(b)) {
                return 1;
            } else {
                return a - b;
            }
        });

        int[] result = new int[arr1.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = sortArrayByAnotherArray(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
