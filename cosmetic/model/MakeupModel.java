package com.cosmetic.model;

/**
 * LMUID: 23048679
 * @author Aaditi Ghimire
 */
public class MakeupModel{
    
    private int Mid;
    private String Mname;
    private String Mshade;
    private int Mquantity;
    private String Mbrand;
    private int Mprice;
    private String Mingredients;
    private String Mmfgdate;
    private String Mexpdate;
    
    /**
     * Constructor for creating a MakeupModel object with all necessary attributes.
     *
     * @param Mid         The unique identifier for the makeup product.
     * @param Mname       The name of the makeup product.
     * @param Mshade      The shade of the makeup product.
     * @param Mquantity   The available quantity of the makeup product.
     * @param Mbrand      The brand name of the makeup product.
     * @param Mprice      The price of the makeup product.
     * @param Mingredients The ingredients used in the makeup product.
     * @param Mmfgdate    The manufacturing date of the makeup product.
     * @param Mexpdate    The expiry date of the makeup product.
     */

    public MakeupModel(int Mid, String Mname, String Mshade, int Mquantity, String Mbrand, int Mprice, String Mingredients, String Mmfgdate, String Mexpdate) {
        this.Mid = Mid;
        this.Mname = Mname;
        this.Mshade = Mshade;
        this.Mquantity = Mquantity;
        this.Mbrand = Mbrand;
        this.Mprice = Mprice;
        this.Mingredients = Mingredients;
        this.Mmfgdate = Mmfgdate;
        this.Mexpdate = Mexpdate;
    }
    
    
     /**
     * @return The unique identifier for the makeup product.
     */
    public int getMid() {
        return Mid;
    }
    
    /**
     * @param Mid The unique identifier for the makeup product to set.
     */
    
    public void setMid(int Mid) {
        this.Mid = Mid;
    }
    
    /**
     * @return The name of the makeup product.
     */

    public String getMname() {
        return Mname;
    }
    
    /**
     * @param Mname The name of the makeup product to set.
     */

    public void setMname(String Mname) {
        this.Mname = Mname;
    }
    
    /**
     * @return The shade of the makeup product.
     */

    public String getMshade() {
        return Mshade;
    }
    
    /**
     * @param Mshade The shade of the makeup product to set.
     */

    public void setMshade(String Mshade) {
        this.Mshade = Mshade;
    }
    
    /**
     * @return The available quantity of the makeup product.
     */

    public int getMquantity() {
        return Mquantity;
    }
    
    /**
     * @param Mquantity The quantity of the makeup product to set.
     */

    public void setMquantity(int Mquantity) {
        this.Mquantity = Mquantity;
    }
    
    /**
     * @return The brand name of the makeup product.
     */

    public String getMbrand() {
        return Mbrand;
    }
    
     /**
     * @param Mbrand The brand name of the makeup product to set.
     */

    public void setMbrand(String Mbrand) {
        this.Mbrand = Mbrand;
    }
    
    
    /**
     * @return The price of the makeup product.
     */

    public double getMprice() {
        return Mprice;
    }
    
     /**
     * @param Mprice The price of the makeup product to set.
     */

    public void setMprice(int Mprice) {
        this.Mprice = Mprice;
    }
    
    /**
     * @return The ingredients used in the makeup product.
     */

    public String getMingredients() {
        return Mingredients;
    }
    
    /**
     * @param Mingredients The ingredients of the makeup product to set.
     */

    public void setMingredients(String Mingredients) {
        this.Mingredients = Mingredients;
    }
    
     /**
     * @return The manufacturing date of the makeup product.
     */

    public String getMmfgdate() {
        return Mmfgdate;
    }
    
    /**
     * @param Mmfgdate The manufacturing date of the makeup product to set.
     */

    public void setMmfgdate(String Mmfgdate) {
        this.Mmfgdate = Mmfgdate;
    }
    
    /**
     * @return The expiration date of the makeup product.
     */

    public String getMexpdate() {
        return Mexpdate;
    }
    
    /**
     * @param Mexpdate The expiration date of the makeup product to set.
     */

    public void setMexpdate(String Mexpdate) {
        this.Mexpdate = Mexpdate;
    } 
}
