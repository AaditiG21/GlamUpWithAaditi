package com.cosmetic.model;

/**
 *
 * @author Aaditi Ghimire
 */
public class FragnanceModel {
    private int Fid;
    private String Fname;
    private String Fingredient;
    private int Fquantity;
    private String Fbrand;
    private double Fprice;
    private String Fmfgdate;
    private String Fexpdate;

    public FragnanceModel(int Fid, String Fname, String Fingredient, int Fquantity, String Fbrand, double Fprice, String Fmfgdate, String Fexpdate) {
        this.Fid = Fid;
        this.Fname = Fname;
        this.Fingredient = Fingredient;
        this.Fquantity = Fquantity;
        this.Fbrand = Fbrand;
        this.Fprice = Fprice;
        this.Fmfgdate = Fmfgdate;
        this.Fexpdate = Fexpdate;
    }

    public int getFid() {
        return Fid;
    }

    public void setFid(int Fid) {
        this.Fid = Fid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getFingredient() {
        return Fingredient;
    }

    public void setFingredient(String Fingredient) {
        this.Fingredient = Fingredient;
    }

    public int getFquantity() {
        return Fquantity;
    }

    public void setFquantity(int Fquantity) {
        this.Fquantity = Fquantity;
    }

    public String getFbrand() {
        return Fbrand;
    }

    public void setFbrand(String Fbrand) {
        this.Fbrand = Fbrand;
    }

    public double getFprice() {
        return Fprice;
    }

    public void setFprice(double Fprice) {
        this.Fprice = Fprice;
    }

    public String getFmfgdate() {
        return Fmfgdate;
    }

    public void setFmfgdate(String Fmfgdate) {
        this.Fmfgdate = Fmfgdate;
    }

    public String getFexpdate() {
        return Fexpdate;
    }

    public void setFexpdate(String Fexpdate) {
        this.Fexpdate = Fexpdate;
    }
    
    

}