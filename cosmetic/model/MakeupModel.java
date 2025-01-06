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
    private double Mprice;
    private String Mingredients;
    private String Mmfgdate;
    private String Mexpdate;

    public MakeupModel(int Mid, String Mname, String Mshade, int Mquantity, String Mbrand, double Mprice, String Mingredients, String Mmfgdate, String Mexpdate) {
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

    public int getMid() {
        return Mid;
    }

    public void setMid(int Mid) {
        this.Mid = Mid;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public String getMshade() {
        return Mshade;
    }

    public void setMshade(String Mshade) {
        this.Mshade = Mshade;
    }

    public int getMquantity() {
        return Mquantity;
    }

    public void setMquantity(int Mquantity) {
        this.Mquantity = Mquantity;
    }

    public String getMbrand() {
        return Mbrand;
    }

    public void setMbrand(String Mbrand) {
        this.Mbrand = Mbrand;
    }

    public double getMprice() {
        return Mprice;
    }

    public void setMprice(double Mprice) {
        this.Mprice = Mprice;
    }

    public String getMingredients() {
        return Mingredients;
    }

    public void setMingredients(String Mingredients) {
        this.Mingredients = Mingredients;
    }

    public String getMmfgdate() {
        return Mmfgdate;
    }

    public void setMmfgdate(String Mmfgdate) {
        this.Mmfgdate = Mmfgdate;
    }

    public String getMexpdate() {
        return Mexpdate;
    }

    public void setMexpdate(String Mexpdate) {
        this.Mexpdate = Mexpdate;
    }

    
}