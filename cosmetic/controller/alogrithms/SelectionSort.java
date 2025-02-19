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
public class SelectionSort {

    /**
     * Sorts a list of MakeupModel objects in ascending order based on the
     * price.
     *
     * @param makeupList The list of MakeupModel objects to be sorted.
     */
    public void ExecuteSelectionSortA(ArrayList<MakeupModel> makeupList) {
        int listSize = makeupList.size();
        for (int step = 0; step < listSize - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                if (makeupList.get(next).getMprice()
                        < makeupList.get(minIndex).getMprice()) {
                    minIndex = next;
                }
            }

            MakeupModel tempMakeupModel = makeupList.get(step);
            makeupList.set(step, makeupList.get(minIndex));
            makeupList.set(minIndex, tempMakeupModel);
        }
    }

    /**
     * Sorts a list of MakeupModel objects in descending order based on the
     * price.
     *
     * @param makeupList The list of MakeupModel objects to be sorted.
     */
    public void ExecuteSelectionSortD(ArrayList<MakeupModel> makeupList) {

        int listSize = makeupList.size();

        for (int step = 0; step < listSize - 1; step++) {
            int maxIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                if (makeupList.get(next).getMprice()
                        > makeupList.get(maxIndex).getMprice()) {
                    maxIndex = next;
                }
            }

            MakeupModel tempMakeupModel = makeupList.get(step);
            makeupList.set(step, makeupList.get(maxIndex));
            makeupList.set(maxIndex, tempMakeupModel);
        }
    }

    /**
     * Sorts a list of FragnanceModel objects in ascending order based on the
     * price.
     *
     * @param fragnanceList The list of FragnanceModel objects to be sorted.
     */

    public void ExecuteSelectionSortFA(ArrayList<FragnanceModel> fragnanceList) {
        int listSize = fragnanceList.size();
        for (int step = 0; step < listSize - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                if (fragnanceList.get(next).getFprice()
                        < fragnanceList.get(minIndex).getFprice()) {
                    minIndex = next;
                }
            }

            FragnanceModel tempFragnanceModel = fragnanceList.get(step);
            fragnanceList.set(step, fragnanceList.get(minIndex));
            fragnanceList.set(minIndex, tempFragnanceModel);
        }

    }

    /**
     * Sorts a list of FragnanceModel objects in descending order based on the
     * price.
     *
     * @param fragnanceList The list of FragnanceModel objects to be sorted.
     */
    public void ExecuteSelectionSortFD(ArrayList<FragnanceModel> fragnanceList) {

        int listSize = fragnanceList.size();

        for (int step = 0; step < listSize - 1; step++) {
            int maxIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                if (fragnanceList.get(next).getFprice()
                        > fragnanceList.get(maxIndex).getFprice()) {
                    maxIndex = next;
                }
            }

            FragnanceModel tempFragnanceModel = fragnanceList.get(step);
            fragnanceList.set(step, fragnanceList.get(maxIndex));
            fragnanceList.set(maxIndex, tempFragnanceModel);
        }
    }
}
