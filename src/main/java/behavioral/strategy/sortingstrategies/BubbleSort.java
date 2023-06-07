package behavioral.strategy.sortingstrategies;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortStrategy {
    /**
     * Sorts a list using the Bubble sort approach
     * @Time_Complexity O(n * n)
     * @param list The list to be sorted
     * @param <T>
     */
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        int size = list.size();

        while (true) {
            boolean sorted = true;

            for (int i = 0; i < size - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    sorted = false;
                    Collections.swap(list, i, i + 1);
                }
            }

            if (sorted) {
                break;
            }
        }
    }
}
