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
 * @author ASUS1
 */
public class InsertionSort {
     public void ExecuteInsertionSortByNameA( ArrayList <MakeupModel> makeupList){
        
        int listSize = makeupList.size();
        
        for(int i=1; i<listSize; i++ ) {
            MakeupModel temp = makeupList.get(i);
            int j = i - 1; 
            
           while(j>=0 && makeupList.get(j).getMname().compareTo(temp.getMname())>0){
               makeupList.set(j+1, makeupList.get(j));
               j--;
           
           }
            
           makeupList.set(j+1, temp);
            
        }
    }
    public void ExecuteInsertionSortByNameD( ArrayList <MakeupModel> makeupList){
        
        int listSize = makeupList.size();
        
        for(int i=1; i<listSize; i++ ) {
            MakeupModel temp = makeupList.get(i);
            int j = i - 1; 
            
           while(j>=0 && makeupList.get(j).getMname().compareTo(temp.getMname())<0){
               makeupList.set(j+1, makeupList.get(j));
               j--;
           
           }
            
           makeupList.set(j+1, temp);
            
        }
    }
      public void ExecuteInsertionSortByNameFA( ArrayList <FragnanceModel> fragnanceList){
        
        int listSize = fragnanceList.size();
        
        for(int i=1; i<listSize; i++ ) {
            FragnanceModel temp = fragnanceList.get(i);
            int j = i - 1; 
            
           while(j>=0 && fragnanceList.get(j).getFname().compareTo(temp.getFname())>0){
               fragnanceList.set(j+1, fragnanceList.get(j));
               j--;
           
           }
            
          fragnanceList.set(j+1, temp);
            
        }
    }
    public void ExecuteInsertionSortByNameFD( ArrayList <FragnanceModel> fragnanceList){
        
        int listSize = fragnanceList.size();
        
        for(int i=1; i<listSize; i++ ) {
            FragnanceModel temp = fragnanceList.get(i);
            int j = i - 1; 
            
           while(j>=0 && fragnanceList.get(j).getFname().compareTo(temp.getFname())<0){
               fragnanceList.set(j+1, fragnanceList.get(j));
               j--;
           
           }
            
           fragnanceList.set(j+1, temp);
            
        }
    }
}
