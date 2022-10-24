package twonumbersum;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数之和
 *
 * @author: clarity
 * @date: 2022年09月08日 11:47
 */
public class Main {
    /*
    * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    * 例如，121 是回文，而 123 不是。
    * */
    public int[] twoSum(int[] nums, int target) {
        // 创建可集合用于存放判断符合条件的结果
        List<Integer> beforeResult = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i + 1; j--) {
                if (nums[i] + nums[j] == target) {
                    if (beforeResult.size() == 0) {
                        beforeResult.add(i);
                        beforeResult.add(j);
                    }
                    int size = beforeResult.size();
                    for (int k = 0; k < size; k++) {
                        if (i == beforeResult.get(k)) {
                            break;
                        }
                        if (k == size - 1) {
                            beforeResult.add(i);
                        }
                    }
                    for (int k = 0; k < size; k++) {
                        if (j == beforeResult.get(k)) {
                            break;
                        }
                        if (k == size - 1) {
                            beforeResult.add(j);
                        }
                    }
                }
            }
        }
        int[] result = new int[beforeResult.size()];
        // 设置存储结果的数组
        int l = 0;
        for (Integer i : beforeResult) {
            result[l] = i;
            l++;
        }


        return result;
    }

    public static void main(String[] args) {
        Main myMain = new Main();
        int[] nums = {2, 7, 11, 15, 2, 7, 6, 3, -2};
        int target = 9;
        int[] result = myMain.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
