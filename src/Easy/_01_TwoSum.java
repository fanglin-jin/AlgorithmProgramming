package Easy;
/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * */
public class _01_TwoSum {
	    public static int[] twoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[j] == target - nums[i]) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	    public static void main(String[] args) {
	    	int[] nums = {11,12,13,23,2,3,5};
	    	int target = 14;
	    	int[] result = new int[2];
	    	result = twoSum(nums,target);
	    	System.out.println("输出结果：");
	    	System.out.println(result[0]);
	    	System.out.println(result[1]);
	    }
}
