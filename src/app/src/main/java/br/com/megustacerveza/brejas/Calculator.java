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

    public int getBestPrice(ArrayList<Breja> prices){

        int minIndex = 0;

        for(int i =0; i < prices.size() ; i++){
            if (prices.get(i).getPricePerVol().compareTo(prices.get(minIndex).getPricePerVol())<0){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
