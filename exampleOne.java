//Barrington Fields \ This is a repository for all twelve-algorithms | 
public class exampleOne{

public static void main(String[] args) {
    System.out.println();
    int []nums =  {-2,0,5,7,9};
    int counter = 0;
    for(int i=0; i<nums.length; i++){
        System.out.println(nums[i]);
    }

    for(int num: nums){
        System.out.println(nums[num]);
    }
    while(counter<nums.length){
        System.out.println(nums[counter]);
    }
}
}