/*
 * Copyright (C) 2021 Crasoft Inc.
 * @author: Javokhirbek Nazarov
 * @date: 26/03/22
 * Code base is a private asset of the company. Any use outside company or
 * without the permission of the company is prohibited
 */

package easy;

// https://leetcode.com/problems/binary-search/
public class BinarySearch {

  public static void main(String[] args) {

    int [] nums ;
    int target;

    nums = new int[] {-1,0,3,5,9,12};
    target = 9;
//    System.out.println(solution(nums, target));

    nums = new int[] {-1,0,3,5,9,12};
    target = 2;
//    System.out.println(solution(nums, target));

    nums = new int[] {-1,0,2,5,9,12, 34, 78, 105, 108, 300, 400};
    target = 78;
//    System.out.println(solution(nums, target));

    nums = new int[] {-1,0,3,5,9,12};
    target = 12;
    System.out.println(solution(nums, target));
  }

  private static int solution(int[] nums, int target){
    int middle = -1;
    int start = 0;
    int end = nums.length;

    while (end - start > 0){
      middle = (end + start) / 2;
      if(nums[middle] == target) {
        return middle;
      }
      else {
        if (nums[middle] > target){
          end = middle -1;
        }
        else{
          start = middle + 1;
        }
      }
    }

    return -1;
  }
}
