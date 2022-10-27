package a1;

public class Summer {
  int index = 0;
  // Any other data fields you decide you need can go here.
  private int[] nums;

  public Summer(int n) {
    // This constructor allocates an array that holds n ints and puts that in nums.
    nums = new int[n];
  }

  public void add(int num) {
    // This method takes the parameter num and puts that value into nums.
    if (index < nums.length) nums[index++] = num;
  }

  public int sum() {
    /* This method goes through the array and adds up all the ints
    that have been stored in it so far. */

    int sum = 0;
    for (int i : nums) {
      sum += i;
    }
    return sum;
  }

  public int high() {
    /* Finds the largest number stored in the array so far
    and returns it. */

    int highest = nums[0];
    int current;
    for (int i = 0; i < index; i++) {
      current = nums[i];
      if (current > highest) {
        highest = current;
      }
    }
    return highest;
  }

  public int low() {
    /* Finds the smallest number stored in the array so far
    and returns it. */

    int lowest = nums[0];
    int current;
    for (int i = 0; i < index; i++) {
      current = nums[i];
      if (current < lowest) {
        lowest = current;
      }
    }
    return lowest;
  }

  public double average() {
    /* Finds the average of all the numbers stored in the array
    so far, and returns it. */

    int sum = sum();
    double count = count();
    if (sum != 0) {
      double average = ((double) sum / count);
      return average;
    } else {
      return 0.0;
    }
  }

  public double avgOver(int thresh) {
    /* Same as average() except only averages up
    stored numbers that are ABOVE ( > ) the threshold
    parameter "thresh". */

    int sum = 0;
    int count = 0;
    if (sum() != 0) {
      for (int i = 0; i < index; i++) {
        if (nums[i] > thresh) {
          sum += nums[i];
          count += 1;
        }
      }
      if (sum == 0) {
        return 0.0;
      }
      double averageover = ((double) sum / (double) count);
      return averageover;
    } else {
      return 0.0;
    }
  }

  public int count() {
    // Returns the number of ints that have been stored in the array.
    int count = 0;
    for (int i = 0; i < index; i++) {
      count += 1;
    }
    return count;
  }
}
