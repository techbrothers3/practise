import java.util.*;
public class ConnectRopes {
    static int ans;
    private static int solve(int [] A) {
        int []heap = new int [A.length];
        ans = 0;
        int n = A.length;
        for (int i = n-1; i >= 0; i--) {
            heap[i] = A[i];
            downHeap(heap,i,n);
        }
        System.out.println(Arrays.toString(heap));
        while(n > 1) {
            int sum = heap[0];
            swap(n-1,0,heap);
            n--;
            downHeap(heap,0,n);
            sum += heap[0];
            swap(n-1,0,heap);
            n--;
            downHeap(heap,0,n);
            ans += sum;
            n++;
            heap[n-1] = sum;
            upHeap(heap,n-1);
        }
        return ans;
    }

    private static void upHeap(int[] heap, int i) {
        int parent = (i-1)/2;
        if ( heap[parent] > heap[i]) {
            swap(parent,i,heap);
            upHeap(heap,parent);
        }
    }

    static void downHeap(int [] heap,int ind,int n) {
        int left = 2*ind+1;
        int right = 2*ind+2;
        if (inRange(left,n) && heap[left] < heap[ind] && inRange(right,n) && heap[right] < heap[ind]) {
            if (heap[left] < heap[right]) {
                swap(ind,left,heap);
                downHeap(heap,left,n);
            } else {
                swap(ind,right,heap);
                downHeap(heap,right,n);
            }
        } else if (inRange(left,n) && heap[left] < heap[ind]) {
            swap(ind,left,heap);
            downHeap(heap,left,n);
        } else if (inRange(right,n) && heap[right] < heap[ind]) {
            swap(ind,right,heap);
            downHeap(heap,right,n);
        }
    }
    static void swap(int i, int j, int[] heap) {
        int greaterNum = heap[i];
        heap[i] = heap[j];
        heap[j] = greaterNum;
    }
    static boolean inRange(int j, int n) {
        if (j >= n) return false;
        return true;
    }
    public static void main(String[] args) {
        int A[] = { 5,17,100,11 };
        System.out.println(solve(A));
    }
}
