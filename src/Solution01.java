//53. 最大子数组和 - 寻找具有最大和的连续子数组
//https://leetcode.cn/problems/maximum-subarray/description/
/*
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组是数组中的一个连续部分。

示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
示例 2：

输入：nums = [1]
输出：1
示例 3：

输入：nums = [5,4,-1,7,8]
输出：23
 */

public class Solution01 {
    public int maxSubArray(int[] nums) {
        //
        int sum = 0;//当前最大和
        int maxsum =nums[0];//最大和
        for(int num : nums){
            sum = Math.max(sum + num ,num);
            maxsum = Math.max(sum,maxsum);
        }

        return maxsum;

    }

    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        int i = solution01.maxSubArray(new int[]{-2,1,0,8,-6});
        System.out.println(i);
    }
}
