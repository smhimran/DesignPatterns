package behavioral.strategy.sortingstrategies;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortStrategy {
    /**
     * Sorts the list using Merge sort approach
     * @param list The list to be sorted
     * @param <T>
     */
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        if (list.size() <= 1) {
            return; // Base case: already sorted
        }

        int mid = list.size() / 2;
        List<T> left = new ArrayList<>(list.subList(0, mid));
        List<T> right = new ArrayList<>(list.subList(mid, list.size()));

        sort(left); // Sort the left half
        sort(right); // Sort the right half

        merge(list, left, right);
    }

    private <T extends Comparable<T>> void merge(List<T> list, List<T> left, List<T> right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
