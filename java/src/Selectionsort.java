public class Selectionsort {
    private static int[] solve(int [] arr) {
        for(int i = 0; i<arr.length-1;i++) {
            int minInd = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] < minInd){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    private static void main(String args[]) {
        int arr[] = {2,1,3,2,3,2,3,2,3,21};
    }

}
