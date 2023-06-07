package behavioral.strategy.sortingstrategies;

import java.util.List;

import static java.util.Collections.swap;

public class SelectionSort implements SortStrategy {
    /**
     * Sorts a list using the Selection sort approach
     * @Time_Complexity O(n * n)
     * @param list The list to be sorted
     * @param <T>
     */
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(list, i, minIndex);
            }
        }
    }
}
