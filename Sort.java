package org.example;
import java.util.Arrays;
import java.util.Comparator;

class Sort extends Thread {
    private Integer[] array;
    private int sortOrder;

    public Sort(Integer[] array, int sortOrder) {
        this.array = array;
        this.sortOrder = sortOrder;
    }

    public void run() {
        Comparator<Integer> comparator;
        if (sortOrder == 1) {
            comparator = Integer::compareTo;
        } else {
            comparator = (a, b) -> b.compareTo(a);
        }

        Arrays.sort(array, comparator);
    }
}
