package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};
        int temp;

        System.out.print("Contents of array before for loop - ");
        for (int j : nums) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int x = 0; x < nums.length / 2; x++){
            temp = nums[x];
            nums[x] = nums[nums.length - x - 1];
            nums[nums.length - x - 1] = temp;
        }

        System.out.print("Contents of array after for loop - ");
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

}
