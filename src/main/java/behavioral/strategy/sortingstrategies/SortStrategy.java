package behavioral.strategy.sortingstrategies;

import java.util.List;

public interface SortStrategy {
    /**
     * Sorts a list
     * @param list The list to be sorted
     * @param <T>
     */
    <T extends Comparable<T>> void sort(List<T> list);
}
