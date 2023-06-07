package behavioral.strategy;

import behavioral.strategy.sortingstrategies.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list;

        System.out.println("Selection sort...");
        Sorter sorter = new Sorter(new SelectionSort());
        list = generateRandomList(10);
        System.out.println("Before sort: " + list);
        sorter.sort(list);
        System.out.println("After sort: " + list);

        System.out.println("Bubble sort...");
        list = generateRandomList(10);
        sorter.setStrategy(new BubbleSort());
        System.out.println("Before sort: " + list);
        sorter.sort(list);
        System.out.println("After sort: " + list);

        System.out.println("Insertion sort...");
        sorter.setStrategy(new InsertionSort());
        list = generateRandomList(10);
        System.out.println("Before sort: " + list);
        sorter.sort(list);
        System.out.println("After sort: " + list);

        System.out.println("Merge sort...");
        sorter.setStrategy(new MergeSort());
        list = generateRandomList(10);
        System.out.println("Before sort: " + list);
        sorter.sort(list);
        System.out.println("After sort: " + list);

        System.out.println("Intro sort...");
        sorter.setStrategy(new IntroSort());
        list = generateRandomList(10);
        System.out.println("Before sort: " + list);
        sorter.sort(list);
        System.out.println("After sort: " + list);
    }

    private static List<Integer> generateRandomList(int size) {
        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(0, 10);
            randomList.add(randomNumber);
        }

        return randomList;
    }
}
