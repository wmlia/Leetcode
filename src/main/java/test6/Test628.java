package test6;

import java.security.interfaces.RSAKey;
import java.util.Arrays;

public class Test628 {
    public static void main(String[] args) {
//        628. 三个数的最大乘积
//        给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
//        输入: [1,2,3]
//        输出: 6

        int[] nums={1,2,4,5};

        int result = maximumProduct(nums);

        System.out.println(result);

    }

    public static int maximumProduct(int[] nums) {
        int result=0;
//        对数字进行排序
        Arrays.sort(nums);
//        我们将数组进行升序排序，如果数组中所有的元素都是非负数，那么答案即为最后三个元素的乘积。
//        result=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
//        如果数组中出现了负数，那么我们还需要考虑乘积中包含负数的情况，显然选择最小的两个负数和最大的一个正数是最优的，即为前两个元素与最后一个元素的乘积。
//        上述两个结果中的较大值就是答案。注意我们可以不用判断数组中到底有没有正数，0 或者负数，因为上述两个结果实际上已经包含了所有情况，最大值一定在其中。
        result=Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);

        return result;
    }
}
