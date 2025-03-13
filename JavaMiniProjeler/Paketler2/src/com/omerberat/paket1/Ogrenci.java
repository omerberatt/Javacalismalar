package com.omerberat.paket1;

import com.omerberat.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci {

    @Override
    public void ders_calis() {
        System.out.println("Ders Çalışıyorum.");
    }
}
