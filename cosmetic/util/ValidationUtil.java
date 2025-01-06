/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cosmetic.util;

import java.util.regex.Pattern;

/**
 * LMUID: 23048679
 * @author Aaditi Ghimire
 */


public class ValidationUtil {
    private static final Pattern  MID_PATTERN = Pattern.compile("^1\\d{3}$");
    private static final Pattern MNAME_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern MSHADE_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern MQUANTITY_PATTERN = Pattern.compile("^\\d{1}$");
    private static final Pattern MBRAND_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern MPRICE_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern MINGREDIENTS_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern MMFGDATE_PATTERN = Pattern.compile("^\\d{4}\\s+(January|February|March|April|May|June|July|August|September|October|November|December)$");
    private static final Pattern MEXPDATE_PATTERN = Pattern.compile("^\\d{4}\\s+(January|February|March|April|May|June|July|August|September|October|November|December)$");;
    
    private static final Pattern FID_PATTERN = Pattern.compile("^1\\d{3}$");
    private static final Pattern FNAME_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern FINGREDIENTS_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern FQUANTITY_PATTERN = Pattern.compile("^\\d{1}$");
    private static final Pattern FBRAND_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$", Pattern.CASE_INSENSITIVE);
    private static final Pattern FPRICE_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern FMFGDATE_PATTERN = Pattern.compile("^\\d{4}\\s+(January|February|March|April|May|June|July|August|September|October|November|December)$");
    private static final Pattern FEXPDATE_PATTERN = Pattern.compile("^\\d{4}\\s+(January|February|March|April|May|June|July|August|September|October|November|December)$");;
    
    
    
    /**
     * Validates if a string is null or empty.
     *
     * @param value
     * @ value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    
    /**
     * 
     *
     * @param Mid validate product code
     * @return true if valid, otherwise false
     */
    public static boolean validateMId(int Mid) {
        return MID_PATTERN.matcher(String.valueOf(Mid)).matches();
    }
    
    /**
     * 
     *
     * @param Mname validate product name
     * @return true if valid, otherwise false
     */
    public static boolean validateMName(String Mname) {
        return !isNullOrEmpty(Mname) && MNAME_PATTERN.matcher(Mname).matches();
    }

    /**
     * .
     *
     * @param Mshade validate product material
     * @return true if valid, otherwise false
     */
    public static boolean validateMShade(String Mshade) {
        return !isNullOrEmpty(Mshade) && MSHADE_PATTERN.matcher(Mshade).matches();
    }
    
    /**
     *
     *
     * @param Mquantity
     * @return true if valid, otherwise false
     */
    public static boolean validateMQuantity(int Mquantity) {
        return MQUANTITY_PATTERN.matcher(String.valueOf(Mquantity)).matches();
    }
    
    /**
     *.
     *
     * @param Mbrand validate gold carats
     * @return true if valid, otherwise false
     */
    public static boolean validateMBrand(String Mbrand) {
        return MBRAND_PATTERN.matcher(String.valueOf(Mbrand)).matches();
    }
    
    /**
     * 
     *
     * @param price validate product stock
     * @return true if valid, otherwise false
     */
    public static boolean validateMPrice(double price) {
        return MPRICE_PATTERN.matcher(String.valueOf(price)).matches();
    }
    
    /**
     * 
     *
     * @param ingredients
     
     * @return true if valid, otherwise false
     */
    public static boolean validateMINGREDIENTS(String  ingredients) {
        return MINGREDIENTS_PATTERN.matcher(String.valueOf(ingredients)).matches();
    }
    public static boolean validateMMFGDATE(String  Mmfgdate) {
        return MMFGDATE_PATTERN.matcher(String.valueOf(Mmfgdate)).matches();
    }
    
    
     public static boolean validateMEXPDATE(String  Mexpdate) {
        return MEXPDATE_PATTERN.matcher(String.valueOf(Mexpdate)).matches();
    }
     
     /**
     * Validates if a string is null or empty.
     *
     * @param value
     * @ value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    
    /**
     * 
     *
     * @param Fid validate product code
     * @return true if valid, otherwise false
     */
    public static boolean validateFId(int Fid) {
        return FID_PATTERN.matcher(String.valueOf(Fid)).matches();
    }
    
    /**
     * 
     *
     * @param name validate product name
     * @return true if valid, otherwise false
     */
    public static boolean validateFName(String name) {
        return !isNullOrEmpty(name) && FNAME_PATTERN.matcher(name).matches();
    }

    /**
     * .
    
     *
     * @param Fquantity
     * @return true if valid, otherwise false
     */
    public static boolean FvalidateQuantity(int Fquantity) {
        return FQUANTITY_PATTERN.matcher(String.valueOf(Fquantity)).matches();
    }
    
    /**
     *.
     *
     * @param Fbrand validate gold carats
     * @return true if valid, otherwise false
     */
    public static boolean validateFBrand(String Fbrand) {
        return FBRAND_PATTERN.matcher(String.valueOf(Fbrand)).matches();
    }
    
    /**
     * 
     *
     * @param Fprice validate product stock
     * @return true if valid, otherwise false
     */
    public static boolean validateFPrice(double Fprice) {
        return FPRICE_PATTERN.matcher(String.valueOf(Fprice)).matches();
    }
    
    /**
     * 
     *
     * @param Fingredients
     
     * @return true if valid, otherwise false
     */
    public static boolean validateFINGREDIENTS(String  Fingredients) {
        return FINGREDIENTS_PATTERN.matcher(String.valueOf(Fingredients)).matches();
    }
    public static boolean validateFMGDATE(String  Fmfgdate) {
        return FMFGDATE_PATTERN.matcher(String.valueOf(Fmfgdate)).matches();
    }
    
    
     public static boolean validateFEXPDATE(String  Fexpdate) {
        return FEXPDATE_PATTERN.matcher(String.valueOf(Fexpdate)).matches();
    }
     
    
}
