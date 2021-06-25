package edu.cnm.deepdive;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class CodingBatTwoTwos {

  private static int[] one = {4, 2, 2, 3};
  private static int[] two = {2, 2, 4};
  private static int[] three = {2, 2, 4, 2};

  public static void main(String[] args) {
    System.out.println("for the array [4, 2, 2, 3], the outcome will be " + twoTwo(one) + ".");
    System.out.println("for the array [2, 2, 4], the outcome will be " + twoTwo(two) + ".");
    System.out.println("for the array [2, 2, 4, 2], the outcome will be " + twoTwo(three) + ".");
  }

  public static boolean twoTwo(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        if (!(i < nums.length-1 && nums[i+1] == 2 ||
            nums.length > 1 && i > 0 && nums[i-1] == 2))
          return false;
      }
    }
    return true;
  }

}
