package br.com.megustacerveza.brejas;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by antonio on 13/09/2016.
 */
public class Calculator {

    public BigDecimal pricePerVolume(BigDecimal volume, BigDecimal price){
        return volume.divide(price, MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN);
    }
}
