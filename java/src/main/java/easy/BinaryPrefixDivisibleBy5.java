/*
 * Copyright (C) 2021 Crasoft Inc.
 * @author: Javokhirbek Nazarov
 * @date: 21/03/22
 * Code base is a private asset of the company. Any use outside company or
 * without the permission of the company is prohibited
 */

package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {

  public static void main(String[] args) {
    int[] nums;
    nums = new int[] {0,1,1};
    System.out.println(solution(nums));

    nums = new int[] {1,1,1};
    System.out.println(solution(nums));

    nums = new int[] {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
    System.out.println(solution(nums));
  }

  public static List<Boolean> solution(int[] nums){
    List<Boolean> result = new ArrayList<>(nums.length);
    int sum = 0;

    for(int num : nums){
      sum = (sum<<1);
      sum = (sum + num) % 10;
      result.add(Boolean.valueOf(sum %5==0));
    }

    return result;
  }

}
