package br.com.megustacerveza.brejas;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

import dalvik.annotation.TestTargetClass;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalculatorTest {

    @Test
    public void division_by_one(){
        Calculator calc = new Calculator();
        assertEquals(new BigDecimal(3).setScale(2, RoundingMode.HALF_EVEN), calc.pricePerVolume(new BigDecimal(3), new BigDecimal(1)));
    }

    @Test(expected = ArithmeticException.class)
    public void division_by_zero(){
        Calculator calc = new Calculator();
        assertEquals(new BigDecimal(3).setScale(2, RoundingMode.HALF_EVEN), calc.pricePerVolume(new BigDecimal(3), new BigDecimal(0)));
    }

    @Test
    public void division_two_floats(){
        Calculator calc = new Calculator();
        assertEquals(new BigDecimal(3).setScale(2, RoundingMode.HALF_EVEN), calc.pricePerVolume(new BigDecimal(4.5), new BigDecimal(1.5)));
    }

    @Test
    public void division_two_broken_floats(){
        Calculator calc = new Calculator();
        assertEquals(new BigDecimal(0.52).setScale(2, RoundingMode.HALF_EVEN), calc.pricePerVolume(new BigDecimal(1.618), new BigDecimal(3.1416)));
    }

    @Test
    public void minor_price(){
        ArrayList<BigDecimal> prices = new ArrayList<BigDecimal>();
        prices.add(new BigDecimal(2.72).setScale(2, RoundingMode.HALF_EVEN));
        prices.add(new BigDecimal(1.52).setScale(2, RoundingMode.HALF_EVEN));
        prices.add(new BigDecimal(3.14).setScale(2, RoundingMode.HALF_EVEN));
        prices.add(new BigDecimal(0.52).setScale(2, RoundingMode.HALF_EVEN));
        prices.add(new BigDecimal(6.66).setScale(2, RoundingMode.HALF_EVEN));
        Calculator calc = new Calculator();
        assertEquals(3, calc.getBestPrice(prices));
    }
}
