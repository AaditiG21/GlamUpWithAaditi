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
public class InsertionSort {

    /**
     * Sorts the given list of MakeupModel objects in ascending order based on
     * their names.
     *
     * @param makeupList The list of MakeupModel objects to be sorted. The list
     * will be sorted in-place, meaning the original list will be modified.
     */
    public void ExecuteInsertionSortByNameA(ArrayList<MakeupModel> makeupList) {

        int listSize = makeupList.size();

        for (int i = 1; i < listSize; i++) {
            MakeupModel temp = makeupList.get(i);
            int j = i - 1;

            while (j >= 0 && makeupList.get(j).getMname().compareTo(temp.getMname()) > 0) {
                makeupList.set(j + 1, makeupList.get(j));
                j--;

            }

            makeupList.set(j + 1, temp);

        }
    }

    public void ExecuteInsertionSortByNameD(ArrayList<MakeupModel> makeupList) {

        /**
         * Sorts the given list of MakeupModel objects in descending order based
         * on their names.
         *
         * @param makeupList The list of MakeupModel objects to be sorted. The
         * list will be sorted in-place, meaning the original list will be
         * modified.
         */
        int listSize = makeupList.size();

        for (int i = 1; i < listSize; i++) {
            MakeupModel temp = makeupList.get(i);
            int j = i - 1;

            while (j >= 0 && makeupList.get(j).getMname().compareTo(temp.getMname()) < 0) {
                makeupList.set(j + 1, makeupList.get(j));
                j--;

            }

            makeupList.set(j + 1, temp);

        }
    }

    public void ExecuteInsertionSortByNameFA(ArrayList<FragnanceModel> fragnanceList) {

        /**
         * Sorts the given list of FragnanceModel objects in ascending order
         * based on their names.
         *
         * @param fragnanceList The list of FragnanceModel objects to be sorted.
         * The list will be sorted in-place, meaning the original list will be
         * modified.
         */
        int listSize = fragnanceList.size();

        for (int i = 1; i < listSize; i++) {
            FragnanceModel temp = fragnanceList.get(i);
            int j = i - 1;

            while (j >= 0 && fragnanceList.get(j).getFname().compareTo(temp.getFname()) > 0) {
                fragnanceList.set(j + 1, fragnanceList.get(j));
                j--;

            }

            fragnanceList.set(j + 1, temp);

        }
    }

    public void ExecuteInsertionSortByNameFD(ArrayList<FragnanceModel> fragnanceList) {

        /**
         * Sorts the given list of FragnanceModel objects in descending order
         * based on their names.
         *
         * @param fragnanceList The list of FragnanceModel objects to be sorted.
         * The list will be sorted in-place, meaning the original list will be
         * modified.
         */
        int listSize = fragnanceList.size();

        for (int i = 1; i < listSize; i++) {
            FragnanceModel temp = fragnanceList.get(i);
            int j = i - 1;

            while (j >= 0 && fragnanceList.get(j).getFname().compareTo(temp.getFname()) < 0) {
                fragnanceList.set(j + 1, fragnanceList.get(j));
                j--;

            }

            fragnanceList.set(j + 1, temp);

        }
    }
}
