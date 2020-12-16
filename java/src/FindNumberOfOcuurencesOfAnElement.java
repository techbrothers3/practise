public class FindNumberOfOcuurencesOfAnElement {

    private static int solve(int []arr,int target) {
        int count = 0;
        int st = 0;
        int end = arr.length-1;
        while(st <= end) {
            int mid = (st+end)/2;
            if (arr[mid] == target) {
                int k = mid;
                count++;
                while (k-1 >= 0 && arr[k-1] == target) {
                    k--;
                    count++;
                }
                k = mid;
                while (k+1 <= arr.length-1 && arr[k+1] == target) {
                    k++;
                    count++;
                }
                return count;
            } else if (arr[mid] < target) st = mid+1;
            else end = mid-1;
        }

        return count;
    }
    public static void main(String[] args) {
        int []arr = {4,4,8,8,8,15,16,17,18,19};
        int target = 8;
        System.out.println(solve(arr,target));
    }
}
