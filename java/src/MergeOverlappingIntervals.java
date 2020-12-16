import java.util.*;

public class MergeOverlappingIntervals {
    static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    private static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        return intervals;
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        System.out.println(merge(intervals));
    }
}
