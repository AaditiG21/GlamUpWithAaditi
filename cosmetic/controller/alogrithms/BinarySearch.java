/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cosmetic.controller.alogrithms;

import com.cosmetic.model.FragnanceModel;
import com.cosmetic.model.MakeupModel;
import java.util.List;


/**
 *
 * LMUID: 23048679
* @author Aaditi Ghimire 
 */

public class BinarySearch {
    
     /**
     * Searches for a MakeupModel in a sorted list by its name using binary search.
     *
     * @param searchValue The name of the makeup product to search for.
     * @param makeupList  The sorted list of MakeupModel objects.
     * @param low         The starting index of the search range.
     * @param high        The ending index of the search range.
     * @return The MakeupModel object if found, or null if not found.
     */
    public MakeupModel searchByNameProduct (
        String searchValue,
        List<MakeupModel> makeupList,
        int low,
        int high
    )
    {
        if (high < low) {
            return null;
        }
        //indexing
        int Mid = (low+high)/2;
        
        if (makeupList.get(Mid).getMname().toLowerCase().equals(searchValue.toLowerCase())) {
            return makeupList.get(Mid);
        } else if (searchValue.compareToIgnoreCase(makeupList.get(Mid).getMname()) < 0) {
            //search value is less than mid value
            return searchByNameProduct(searchValue, makeupList, low, Mid-1);
        } else {
            return searchByNameProduct(searchValue, makeupList, Mid+1, high);
        }
        
    }
    
    public FragnanceModel searchByNameProductF (
    /**
     * Searches for a FragnanceModel in a sorted list by its name using binary search.
     *
     * @param searchValue The name of the fragrance product to search for.
     * @param fragnanceList The sorted list of FragnanceModel objects.
     * @param low The starting index of the search range.
     * @param high The ending index of the search range.
     * @return The FragnanceModel object if found, or null if not found.
     */
        String searchValue,
        List<FragnanceModel> fragnanceList,
        int low,
        int high
    ) 
    {
        if (high < low) {
            return null;
        }
        //indexing
        int Fid = (low+high)/2;
        
        if (fragnanceList.get(Fid).getFname().toLowerCase().equals(searchValue.toLowerCase())) {
            return fragnanceList.get(Fid);
        } else if (searchValue.compareToIgnoreCase(fragnanceList.get(Fid).getFname()) < 0) {
            //search value is less than mid value
            return searchByNameProductF(searchValue, fragnanceList, low, Fid-1);
        } else {
            return searchByNameProductF(searchValue, fragnanceList, Fid+1, high);
        }
        
    }
        
}
