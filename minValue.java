public class minValue {
    public static void main(String[] args) {
        int nums[] = {-2, 0, 5, 7, 9};
        int min = nums[0];

        int minIndex = 0; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
             
                minIndex = i; 
            }
        }
      
        System.out.println("The index of min is " + minIndex);
    }
}


