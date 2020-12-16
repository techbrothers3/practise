import java.util.Arrays;
public class DistanceBetweenTwoArrays {
    public  static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int dist = 0;
        for (int i = 0; i < arr1.length; i++) {

            int rend = d + arr1[i];
            int rst =  arr1[i] - d;
            int curr = arr1[i];
            int st = 0;
            int end = arr2.length-1;
            boolean isFound = false;
            while ( st <= end) {
                int mid = (st + end) / 2;

                if (arr2[mid] >= rst && arr2[mid] <= rend) {
                    isFound = true;
                    break;
                } else if (arr2[mid] > rend) {
                    end = mid-1;
                } else{
                    st = mid+1;
                }
            }
            if  (isFound == false) {
                dist++;

            }


        }
        return dist;
    }
    public static void main(String args[]) {
        int []arr1 = {4,5,8};
        int []arr2 = { 10,9,1,8};
        System.out.println(findTheDistanceValue(arr1,arr2,2));
    }
}
