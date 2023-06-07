package behavioral.strategy.sortingstrategies;

import java.util.List;

public class IntroSort implements SortStrategy {
    /**
     * Sorts a list using the Introspective sort approach
     * @param list The list to be sorted
     * @param <T>
     */
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int depthLimit = (int) (2 * Math.floor(Math.log(list.size())));

        introsort(list, 0, list.size() - 1, depthLimit);
    }

    private <T extends Comparable<T>> void introsort(List<T> list, int left, int right, int depthLimit) {
        if (left < right) {
            if (depthLimit == 0) {
                // If depth limit is reached, switch to Heap Sort
                heapsort(list, left, right);
            } else {
                int partitionIndex = partition(list, left, right);
                introsort(list, left, partitionIndex - 1, depthLimit - 1);
                introsort(list, partitionIndex + 1, right, depthLimit - 1);
            }
        }
    }

    private <T extends Comparable<T>> int partition(List<T> list, int left, int right) {
        T pivot = list.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, right);
        return i + 1;
    }

    private <T extends Comparable<T>> void heapsort(List<T> list, int left, int right) {
        buildHeap(list, left, right);
        for (int i = right; i > left; i--) {
            swap(list, left, i);
            heapify(list, left, i - 1, left);
        }
    }

    private <T extends Comparable<T>> void buildHeap(List<T> list, int left, int right) {
        int heapSize = right - left + 1;
        for (int i = left + heapSize / 2; i >= left; i--) {
            heapify(list, left, right, i);
        }
    }

    private <T extends Comparable<? super T>> void heapify(List<T> list, int left, int right, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex - left + 1;
        int rightChild = 2 * rootIndex - left + 2;

        if (leftChild <= right && list.get(leftChild).compareTo(list.get(largest)) > 0) {
            largest = leftChild;
        }

        if (rightChild <= right && list.get(rightChild).compareTo(list.get(largest)) > 0) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            swap(list, rootIndex, largest);
            heapify(list, left, right, largest);
        }
    }

    private <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
