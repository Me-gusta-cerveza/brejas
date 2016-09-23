package br.com.megustacerveza.brejas;

import java.math.BigDecimal;

/**
 * Created by ladeia on 9/23/16.
 */
public class Breja {
    String name;

    public BigDecimal getVol() {
        return vol;
    }

    public Breja(String name, BigDecimal vol, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.vol = vol;
        this.pricePerVol = pricePerVol;
    }

    public void setVol(BigDecimal vol) {

        this.vol = vol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPricePerVol() {
        return pricePerVol;
    }

    public void setPricePerVol(BigDecimal pricePerVol) {
        this.pricePerVol = pricePerVol;
    }

    BigDecimal vol;
    BigDecimal price;
    BigDecimal pricePerVol;
}
