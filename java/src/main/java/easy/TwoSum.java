package easy;

public class TwoSum {

    public static void main(String[] args) {
        int[] res = twoSum(new int[] {3, 2, 4}, 6);

        for(int r: res){
            System.out.println(r);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int diff;

        for(int i = 0; i < nums.length-1; i++){
            diff = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == diff)
                    return new int[] {i, j};
            }
        }
        return new int[] {};
    }
}
