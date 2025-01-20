/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cosmetic.controller.alogrithms;
import com.cosmetic.model.FragnanceModel;
import com.cosmetic.model.MakeupModel;
import java.util.ArrayList;

/**
 * LMUID: 23048679
 *
 * @author Aaditi Ghimire
 */
public class MergeSort {

    /**
     * Recursively splits the given list of MakeupModel objects and sorts them
     * in ascending order based on their IDs using the merge sort algorithm.
     *
     * @param makeupList The list of MakeupModel objects to be sorted.
     * @param low The starting index of the portion of the list to be sorted.
     * @param high The ending index of the portion of the list to be sorted.
     */
    public void ExecuteMergeSortA(ArrayList<MakeupModel> makeupList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortA(makeupList, low, mid);
            ExecuteMergeSortA(makeupList, mid + 1, high);
            MergeSortId(makeupList, low, mid, high);

        }
    }

    /**
     * Merges two sorted makeupList of MakeupModel objects into a single sorted
     * makeupList.
     *
     * @param makeupList The list of MakeupModel objects being sorted.
     * @param low The starting index of the first makeupList.
     * @param mid The ending index of the first makeupList.
     * @param high The ending index of the second makeupList.
     */
    public void MergeSortId(ArrayList<MakeupModel> makeupList, int low, int mid, int high) {
        ArrayList<MakeupModel> newList = new ArrayList<>();
        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (makeupList.get(i).getMid() <= makeupList.get(j).getMid()) {
                newList.add(makeupList.get(i));
                i++;
            } else {
                newList.add(makeupList.get(j));
                j++;
            }
        }

        while (i <= mid) {
            newList.add(makeupList.get(i));
            i++;
        }
        while (j <= high) {
            newList.add(makeupList.get(j));
            j++;
        }
        for (int k = 0; k < newList.size(); k++) {
            makeupList.set(low + k, newList.get(k));
        }
    }
     /**
     * Recursively splits the given list of MakeupModel objects and sorts them in descending order
     * based on their IDs using the merge sort algorithm.
     *
     * @param makeupList The list of MakeupModel objects to be sorted.
     * @param low        The starting index of the portion of the list to be sorted.
     * @param high       The ending index of the portion of the list to be sorted.
     */

    public void ExecuteMergeSortD(ArrayList<MakeupModel> makeupList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortD(makeupList, low, mid);
            ExecuteMergeSortD(makeupList, mid + 1, high);

            MergeSortIdD(makeupList, low, mid, high);

        }
    }
    /**
     * Merges two sorted makeupList of MakeupModel objects into a single sorted makeupList in descending order.
     *
     * @param makeupList The list of MakeupModel objects being sorted.
     * @param low        The starting index of the first makeupList.
     * @param mid        The ending index of the first makeupList.
     * @param high       The ending index of the second makeupList.
     */

    public void MergeSortIdD(ArrayList<MakeupModel> makeupList, int low, int mid, int high) {
        ArrayList<MakeupModel> newList = new ArrayList<>();
        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (makeupList.get(i).getMid() >= makeupList.get(j).getMid()) {
                newList.add(makeupList.get(i));
                i++;
            } else {
                newList.add(makeupList.get(j));
                j++;
            }
        }

        while (i <= mid) {
            newList.add(makeupList.get(i));
            i++;
        }
        while (j <= high) {
            newList.add(makeupList.get(j));
            j++;
        }
        for (int k = 0; k < newList.size(); k++) {
            makeupList.set(low + k, newList.get(k));
        }
    }
     /**
     * Recursively splits the given list of FragnanceModel objects and sorts them in ascending order
     * based on their IDs using the merge sort algorithm.
     *
     * @param fragnanceList The list of FragnanceModel objects to be sorted.
     * @param low           The starting index of the portion of the list to be sorted.
     * @param high          The ending index of the portion of the list to be sorted.
     */

    public void ExecuteMergeSortFA(ArrayList<FragnanceModel> fragnanceList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortFA(fragnanceList, low, mid);
            ExecuteMergeSortFA(fragnanceList, mid + 1, high);

            MergeSortIdFA(fragnanceList, low, mid, high);

        }
    }
    
    /**
     * Merges two sorted fragnanceList of FragnanceModel objects into a single sorted fragnanceList in ascending order.
     *
     * @param fragnanceList The list of FragnanceModel objects being sorted.
     * @param low           The starting index of the first fragnanceList.
     * @param mid           The ending index of the first fragnanceList.
     * @param high          The ending index of the second fragnanceList.
     */

    public void MergeSortIdFA(ArrayList<FragnanceModel> fragnanceList, int low, int mid, int high) {
        ArrayList<FragnanceModel> newList = new ArrayList<>();
        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (fragnanceList.get(i).getFid() <= fragnanceList.get(j).getFid()) {
                newList.add(fragnanceList.get(i));
                i++;
            } else {
                newList.add(fragnanceList.get(j));
                j++;
            }
        }

        while (i <= mid) {
            newList.add(fragnanceList.get(i));
            i++;
        }
        while (j <= high) {
            newList.add(fragnanceList.get(j));
            j++;
        }
        for (int k = 0; k < newList.size(); k++) {
            fragnanceList.set(low + k, newList.get(k));
        }
    }
    
    /**
     * Recursively splits the given list of FragnanceModel objects and sorts them in descending order
     * based on their IDs using the merge sort algorithm.
     *
     * @param fragnanceList The list of FragnanceModel objects to be sorted.
     * @param low           The starting index of the portion of the list to be sorted.
     * @param high          The ending index of the portion of the list to be sorted.
     */

    public void ExecuteMergeSortFD(ArrayList<FragnanceModel> fragnanceList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortFD(fragnanceList, low, mid);
            ExecuteMergeSortFD(fragnanceList, mid + 1, high);

            MergeSortIdFD(fragnanceList, low, mid, high);
        }
    }
      /**
     * Merges two sorted fragnanceList of FragnanceModel objects into a single sorted fragnanceList in descending order.
     *
     * @param fragnanceList The list of FragnanceModel objects being sorted.
     * @param low           The starting index of the first fragnanceList.
     * @param mid           The ending index of the first fragnanceList.
     * @param high          The ending index of the second fragnanceList.
     */

    public void MergeSortIdFD(ArrayList<FragnanceModel> fragnanceList, int low, int mid, int high) {
        ArrayList<FragnanceModel> newList = new ArrayList<>();
        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (fragnanceList.get(i).getFid() >= fragnanceList.get(j).getFid()) {
                newList.add(fragnanceList.get(i));
                i++;
            } else {
                newList.add(fragnanceList.get(j));
                j++;
            }
        }

        while (i <= mid) {
            newList.add(fragnanceList.get(i));
            i++;
        }
        while (j <= high) {
            newList.add(fragnanceList.get(j));
            j++;
        }
        for (int k = 0; k < newList.size(); k++) {
            fragnanceList.set(low + k, newList.get(k));
        }
    }
}
