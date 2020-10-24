package com.company.Current.Pr14;

import com.company.Current.Pr13.Student;

public class Search {

    public static Student LinearSearch(Student[] arr, int id) {
        for (Student student : arr) {
            if (student.getId() == id)
                return student;
        }
        return null;
    }

    public static Student BinarySearch(Student[] arr, int id) {

        int left = 0;
        int right = arr.length;
        int mid;

        while (left < right)
        {
            mid = left + (right - left) / 2;

            if (arr[mid].getId() == id)
                return arr[mid];

            if (arr[mid].getId() > id)
                right = mid;
            else
                left = mid + 1;
        }

        return null;
    }
}
