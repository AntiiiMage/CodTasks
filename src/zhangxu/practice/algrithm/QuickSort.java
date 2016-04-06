package zhangxu.practice.algrithm;

import zhangxu.utils.ArrayUtils;

public class QuickSort {
	
	private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) { 

            // find item on lo to swap
            while (ArrayUtils.less(a[++i], v))
                if (i == hi) break;

            // find item on hi to swap
            while (ArrayUtils.less(v, a[--j]))
                if (j == lo) break;      // redundant since a[lo] acts as sentinel

            // check if pointers cross
            if (i >= j) break;

            ArrayUtils.swap(a, i, j);
        }

        // put partitioning item v at a[j]
        ArrayUtils.swap(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }
	
	
	public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
        assert ArrayUtils.isSortedAsec(a);
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(Comparable[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
        assert ArrayUtils.isSortedAsec(a, lo, hi);
    }

}
