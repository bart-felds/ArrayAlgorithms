public class maxValue {
    public static void main(String[] args) {
        int nums[] = {-2, 0, 5, 7, 9};

        int max_value = nums[0];

        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max_value) {
             
                max_value = nums[i];
            }
        }


        System.out.println("The max is: " + max_value);
    }
}
