package behavioral.strategy;

import behavioral.strategy.sortingstrategies.SortStrategy;

import java.util.List;

public class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public <T extends Comparable<T>> void sort(List<T> list) {
        strategy.sort(list);
    }
}
