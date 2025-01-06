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
* @author ASUS1
 */
public class BinarySearch {
    public MakeupModel searchByNameProduct (
        String searchValue,
        List<MakeupModel> makeupList,
        int low,
        int high
    ) {
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
        String searchValue,
        List<FragnanceModel> fragnanceList,
        int low,
        int high
    ) {
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
