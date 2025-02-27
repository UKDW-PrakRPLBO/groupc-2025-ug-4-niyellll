package org.example;

public class HDMI extends Colokan {

    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(merk, promisedBandwidth, harga);
    }

    @Override
    public double getRealBandwidth() {
        double ratio = (double) getHarga() / (double) 50000.0;
        if (ratio < 1) {
            return getPromisedBandwidth() * ratio;
        } else {
            return getPromisedBandwidth();
        }
    }
}
