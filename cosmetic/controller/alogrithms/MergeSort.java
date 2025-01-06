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
 * @author ASUS1
 */
public class MergeSort {

    public void ExecuteMergeSortA(ArrayList<MakeupModel> makeupList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortA(makeupList, low, mid);
            ExecuteMergeSortA(makeupList, mid + 1, high);

            MergeSortId(makeupList, low, mid, high);

        }
    }

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

    public void ExecuteMergeSortD(ArrayList<MakeupModel> makeupList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortD(makeupList, low, mid);
            ExecuteMergeSortD(makeupList, mid + 1, high);

            MergeSortIdD(makeupList, low, mid, high);

        }
    }

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

    public void ExecuteMergeSortFA(ArrayList<FragnanceModel> fragnanceList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortFA(fragnanceList, low, mid);
            ExecuteMergeSortFA(fragnanceList, mid + 1, high);

            MergeSortIdFA(fragnanceList, low, mid, high);

        }
    }

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

    public void ExecuteMergeSortFD(ArrayList<FragnanceModel> fragnanceList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            ExecuteMergeSortFD(fragnanceList, low, mid);
            ExecuteMergeSortFD(fragnanceList, mid + 1, high);

            MergeSortIdFD(fragnanceList, low, mid, high);

        }
    }

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
