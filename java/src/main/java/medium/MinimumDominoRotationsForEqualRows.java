/*
 * Copyright (C) 2021 Crasoft Inc.
 * @author: Javokhirbek Nazarov
 * @date: 20/03/22
 * Code base is a private asset of the company. Any use outside company or
 * without the permission of the company is prohibited
 */

package medium;

import java.util.Arrays;

public class MinimumDominoRotationsForEqualRows {

  public static void main(String[] args) {
    int[] a = {2,1,2,4,2,2};
    int[] b = {5,2,6,2,3,2};
    System.out.println(min(a, b));

    a = new int[] {3, 5, 1, 2, 3};
    b = new int[] {3,6,3,3,4};
    System.out.println(min(a, b));

    a = new int[] {1,2,1,1,1,2,2,2};
    b = new int[] {2,1,2,2,2,2,2,2};
    System.out.println(min(a, b));

    a = new int[] {1,2,1,2,2,2,2,2};
    b = new int[] {2,1,2,1,1,2,2,2};
    System.out.println(min(a, b));
  }

  static int min(int[] tops, int[] bottoms){
    int min = -1;
    min = traverseAndGetMin(tops, bottoms,  tops[0], min);
    if(tops[0] != bottoms[0]){
      min = traverseAndGetMin(tops, bottoms,  bottoms[0], min);
    }

    return min;
  }

  static int traverseAndGetMin(int[] tops, int[] bottoms, int common, int min){
    int tCount = 0;
    int bCount = 0;

    for(int i = 0; i< tops.length; i++){
      if(common != tops[i] && common!= bottoms[i]){
        tCount = bCount = 0;
        break;
      }
      if(common == tops[i])
        tCount++;
      if(common == bottoms[i])
        bCount++;
    }

    min = getMin(tCount, min, tops.length);
    min = getMin(bCount, min, tops.length);
    return min;
  }

  static int getMin(int count, int min, int length){
    if(count != 0) {
      count = Math.min(count, length - count);
      min = min != -1 ? Math.min(min, count) : count;
    }
    return min;
  }

}
