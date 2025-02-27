package org.example;

public class TV {
    private int maxresolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxresolusi = maxResolusi;
    }

    public int getResolution() {
        if (colokan.getRealBandwidth() >= 10 && colokan.getRealBandwidth() <= 35) {
            return 480;
        } else if (colokan.getRealBandwidth() > 35 && colokan.getRealBandwidth() <= 100) {
            return 720;
        } else if (colokan.getRealBandwidth() > 100) {
            return 720;
        } else {
            System.out.println("tv tidak menyala - " + colokan.getMerk());
            return 0;
        }
    }


    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
