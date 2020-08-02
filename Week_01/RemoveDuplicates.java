public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0){
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            System.out.println("nums[j] ^ nums[i] = "+(nums[j] ^ nums[i]));
            if((nums[j] | nums[i])== nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }

        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] =new int[]{1,1,2};
        int size =  removeDuplicates(nums);
        System.out.println("size = "+size);
    }
}
