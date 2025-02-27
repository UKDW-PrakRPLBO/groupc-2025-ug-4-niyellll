package org.example;

public class VGA extends Colokan {

    public VGA( int harga, double promisedBandwidth, String merk) {
        super(merk, promisedBandwidth, harga);
    }

    @Override
    public double getRealBandwidth() {
        double ratio = (double) getHarga() / (double) 30000.0;
        if (ratio < 1) {
            return getPromisedBandwidth() * ratio;
        } else {
            return getPromisedBandwidth();
        }
    }
}
