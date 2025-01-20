package com.cosmetic.model;

/**
 * LMUID: 23048679
 * @author Aaditi Ghimire
 */
public class FragnanceModel {
    private int Fid;
    private String Fname;
    private String Fingredient;
    private int Fquantity;
    private String Fbrand;
    private int Fprice;
    private String Fmfgdate;
    private String Fexpdate;
    
    
    /**
     * Constructor for the FragnanceModel class.
     * 
     * @param Fid         The ID of the fragrance.
     * @param Fname       The name of the fragrance.
     * @param Fingredient The ingredients used in the fragrance.
     * @param Fquantity   The available quantity of the fragrance.
     * @param Fbrand      The brand of the fragrance.
     * @param Fprice      The price of the fragrance.
     * @param Fmfgdate    The manufacturing date of the fragrance.
     * @param Fexpdate    The expiration date of the fragrance.
     */

    public FragnanceModel(int Fid, String Fname, String Fingredient, int Fquantity, 
            String Fbrand, int Fprice, String Fmfgdate, String Fexpdate) {
        this.Fid = Fid;
        this.Fname = Fname;
        this.Fingredient = Fingredient;
        this.Fquantity = Fquantity;
        this.Fbrand = Fbrand;
        this.Fprice = Fprice;
        this.Fmfgdate = Fmfgdate;
        this.Fexpdate = Fexpdate;
    }
    /**
     * @return The fragrance ID.
     */
    public int getFid() {
        return Fid;
    }
    
    
    /**
     * @param Fid The fragrance ID to set.
     */

    public void setFid(int Fid) {
        this.Fid = Fid;
    }
    
     /**
     * @return The name of the fragrance.
     */

    public String getFname() {
        return Fname;
    }
    
     /**
     * @param Fname The name of the fragrance to set.
     */

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    
    /**
     * @return The ingredients of the fragrance.
     */

    public String getFingredient() {
        return Fingredient;
    }
    
    /**
     * @param Fingredient The ingredients of the fragrance to set.
     */

    public void setFingredient(String Fingredient) {
        this.Fingredient = Fingredient;
    }
    
    /**
     * @return The quantity of the fragrance.
     */

    public int getFquantity() {
        return Fquantity;
    }
    
    /**
     * @param Fquantity The quantity of the fragrance to set.
     */

    public void setFquantity(int Fquantity) {
        this.Fquantity = Fquantity;
    }
    
    /**
     * @return The brand of the fragrance.
     */

    public String getFbrand() {
        return Fbrand;
    }
    
    /**
     * @param Fbrand The brand of the fragrance to set.
     */

    public void setFbrand(String Fbrand) {
        this.Fbrand = Fbrand;
    }
    
    /**
     * @return The price of the fragrance.
     */

    public double getFprice() {
        return Fprice;
    }
    
    /**
     * @param Fprice The price of the fragrance to set.
     */
    

    public void setFprice(int Fprice) {
        this.Fprice = Fprice;
    }
    
    /**
     * @return The manufacturing date of the fragrance.
     */

    public String getFmfgdate() {
        return Fmfgdate;
    }
    
    /**
     * @param Fmfgdate The manufacturing date of the fragrance to set.
     */

    public void setFmfgdate(String Fmfgdate) {
        this.Fmfgdate = Fmfgdate;
    }
    
    /**
     * @return The expiration date of the fragrance.
     */

    public String getFexpdate() {
        return Fexpdate;
    }
    
    /**
     * @param Fexpdate The expiration date of the fragrance to set.
     */

    public void setFexpdate(String Fexpdate) {
        this.Fexpdate = Fexpdate;
    }
}
