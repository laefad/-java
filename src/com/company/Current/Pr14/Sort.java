package com.company.Current.Pr14;

import com.company.Current.Pr13.Student;

public class Sort {

    static public void QuickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student root = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGpa() > root.getGpa()) {
                i++;
            }

            while (array[j].getGpa() < root.getGpa()) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }


    public static void MergeSort(Student[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);

            Merge(arr, l, m, r);
        }
    }


    public static void Merge(Student[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getGpa() >= R[j].getGpa()) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
