package br.com.megustacerveza.brejas;

import java.math.BigDecimal;

/**
 * Created by ladeia on 9/23/16.
 */
public class Breja {
    String name;
    BigDecimal volume;
    BigDecimal price;
    BigDecimal pricePerVolume;

    public BigDecimal getVolume() {
        return volume;
    }

    public Breja(String name, BigDecimal volume, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public Breja(String name, BigDecimal volume, BigDecimal price, BigDecimal pricePerVolume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.pricePerVolume = pricePerVolume;
    }

    public void setVolume(BigDecimal volume) {

        this.volume = volume;
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

    public BigDecimal getPricePerVolume() {
        return pricePerVolume;
    }

    public void setPricePerVolume(BigDecimal pricePerVolume) {
        this.pricePerVolume = pricePerVolume;
    }


}
