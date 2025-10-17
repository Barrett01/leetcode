package array;
/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。

示例 1:
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
示例 2:
输入: nums = [0]
输出: [0]
 */
public class Solution03 {
    //方法1 在创建一个数组
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        //在创建一个新数组
        int[] array = new int[n];
        int end = n-1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                array[start] = nums[i];
                start += 1;
            } else {
                array[end] = 0;
                end -= 1;
            }
        }
        // 将新数组内容复制回原数组
        for (int i = 0; i < n; i++) {
            nums[i] = array[i];
            System.out.print(nums[i] + "\t");
        }
    }

    //方法2：在不创建数组的情况下
    //使用两个循环 先把非零的放到最前面
    public void moveZeroes02(int[] nums) {
        //方法2：在不创建数组的情况下
        int start = 0;
        //使用两个循环 先把非零的放到最前面
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[start] = nums[i];
                start += 1;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println("\n"+"================");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }

    }




    public static void main(String[] args) {
        Solution03 solution03 = new Solution03();
        solution03.moveZeroes(new int[]{0, 1, 0, 3, 12});
        solution03.moveZeroes02(new int[]{0, 1, 0, 3, 0,7,9,0});
    }
}
