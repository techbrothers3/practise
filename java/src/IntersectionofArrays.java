import java.util.*;
public class IntersectionofArrays {
    private static ArrayList<Integer> solve(int[] arr,int []arr2) {
//        Method using HashMap; o(n);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i<arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i],map.get(arr[i])+1);
//            } else {
//                map.put(arr[i],1);
//            }
//        }
        ArrayList<Integer> l = new ArrayList<>();
//        for(int i = 0; i<arr2.length; i++) {
//            if(map.containsKey(arr2[i])) {
//                l.add(arr2[i]);
//                map.put(arr2[i],map.get(arr2[i])-1);
//                if(map.get(arr2[i]) == 0) map.remove(arr2[i]);
//            }
//        }
//        return l;
////        Using binary search
//        int st= 0;
//        int end = arr2.length-1;
//        while(st <= end)
//
//        Using merge sort logic
        int i = 0,j = 0;
        while(i != arr.length && j != arr2.length) {
            if(arr[i] == arr2[j]) {
                l.add(arr[i]);
                i++;
                j++;
            } else if(arr[i] < arr2[j]) i++;
             else if(arr2[j] < arr[i]) j++;
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {10000000};
        int arr2[] = {10000000};
        System.out.println((solve(arr,arr2)));

    }
}
