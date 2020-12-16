import java.util.*;
public class SingleNumber {
    public  static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        int lessVal = Integer.MAX_VALUE;
        int lessKey = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int curVal = entry.getValue();
            if(curVal < lessVal ) {
                lessVal = entry.getValue();
                lessKey = entry.getKey();
            }
        }
        return lessKey;

    }
    public static void main(String args[]) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
