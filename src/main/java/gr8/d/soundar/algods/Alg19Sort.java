package gr8.d.soundar.algods;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Alg19Sort {
    public static <T extends Comparable<T>> T[] bubbleSort(T[] items) {
        /*
        O(n^2)
        For i in array.length - 1
            For j in array.length - i
                if array[j] > array[j+1] then swap
        */
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].compareTo(items[j+1]) > 0) {
                    T temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] items) {
        /*
        O(n^2)
        Iterate through items
            Assume current item is the minimum
            Iterate through rest of items after current item's position
                check if there is any actual minimum than the assumed minimum (current item)
            swap with current item's position if actual minimum is found
         */
        for (int i = 0; i < items.length; i++) {
            int minIndex = i;
            for (int j = i; j < items.length; j++) {
                if (items[minIndex].compareTo(items[j]) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = items[i];
                items[i] = items[minIndex];
                items[minIndex] = temp;
            }
        }
        return items;
    }

    public static <T extends Comparable<T>> List<T> mergeSort(List<T> items) {
        /*
        O(nlogn)
        Merge Sort
        ----- ----
        Split the array into two halfs, recursively, till the arrays have least posible length = 1
        Merge the split halfs backwards using merger function

        Merger function
        ------ --------
        Takes two sorted array
        Create a third array for result
        While there are any element left in both arrays
            compare first element of each array and move least value to result array
        move any remaining elements to result array
        */
        if (items.size() == 1)
            return items;

        int centerPoint = Math.floorDiv(items.size(), 2);

        List<T> items1 = IntStream.range(0, centerPoint)
            .boxed()
            .map(i -> items.get(i))
            .collect(Collectors.toList());

        List<T> items2 = IntStream.range(centerPoint, items.size())
            .boxed()
            .map(i -> items.get(i))
            .collect(Collectors.toList());

        return merger(mergeSort(items1), mergeSort(items2));
    }

    private static <T extends Comparable<T>> List<T> merger(List<T> items1, List<T> items2) {
        List<T> result = new LinkedList<>();
        while (items1.size() > 0 && items2.size() > 0) {
            if (items1.get(0).compareTo(items2.get(0)) > 0) {
                result.add(items2.remove(0));
            } else {
                result.add(items1.remove(0));
            }
        }
        result.addAll(items1);
        result.addAll(items2);
        return result;
    }
}