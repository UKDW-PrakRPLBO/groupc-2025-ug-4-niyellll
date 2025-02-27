package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public Colokan(String merk, double promisedBandwidth, int harga) {
        this.merk = merk;
        this.promisedBandwidth = promisedBandwidth;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public abstract double getRealBandwidth();
}
