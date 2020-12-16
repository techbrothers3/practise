import java.util.Arrays;

public class FindFirstandLastPosition {

    private static int[] searchRange(int[] nums, int target) {
        int []newArr = {-1,-1};
        int st = 0;
        int end = nums.length-1;
        int stPos = -1;
        int endPos = -1;
        while(st <= end) {
            int mid = (st + end) / 2;
            if(nums[mid] == target) {
                int k = mid;
                while(k-1 >= 0 && nums[k-1] == nums[mid]) {
                    k--;
                }
                stPos = k;
                k = mid;
                while (k+1 < nums.length && nums[k+1] == nums[mid]) {
                    k++;
                }
                endPos = k;
                 newArr[0] = stPos;
                 newArr[1] = endPos;
                 return newArr;
            } else if (nums[mid] < target) st = mid+1;
            else end = mid-1;
        }


        return newArr;
    }

    public static void main(String args[]) {
        int []nums = {5};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
