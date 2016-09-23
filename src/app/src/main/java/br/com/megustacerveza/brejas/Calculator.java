package br.com.megustacerveza.brejas;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Created by antonio on 13/09/2016.
 */
public class Calculator {

    public BigDecimal pricePerVolume(BigDecimal volume, BigDecimal price){
        return volume.divide(price, MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN);
    }

    public Breja getBestPrice(ArrayList<Breja> brejas){

        Breja theBest = new Breja("", new BigDecimal(99999), new BigDecimal(1), new BigDecimal(1));

        for(Breja breja : brejas){
            if (theBest.getPricePerVolume().compareTo(breja.getPricePerVolume())<0){
                theBest = breja;
            }
        }
        return theBest;
    }
}
