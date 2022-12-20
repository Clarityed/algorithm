package searchinsertionlocation;

/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * @author: clarity
 * @date: 2022年12月20日 15:12
 */


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(main.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
