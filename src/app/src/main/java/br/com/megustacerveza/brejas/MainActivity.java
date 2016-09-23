package br.com.megustacerveza.brejas;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText litrao;
    private EditText tradicional;
    private EditText bigLatao;
    private EditText latao;
    private EditText longNeck;
    private EditText lata;
    private EditText safadinha;
    private EditText piriguete;
    private EditText otherVol;
    private EditText otherPrice;
    private Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        litrao = (EditText) findViewById(R.id.litrao);
        tradicional = (EditText) findViewById(R.id.tradicional);
        bigLatao = (EditText) findViewById(R.id.bigLatao);
        latao = (EditText) findViewById(R.id.latao);
        longNeck = (EditText) findViewById(R.id.longNeck);
        lata = (EditText) findViewById(R.id.lata);
        safadinha = (EditText) findViewById(R.id.safadinha);
        piriguete = (EditText) findViewById(R.id.piriguete);
        otherVol = (EditText) findViewById(R.id.otherVol);
        otherPrice = (EditText) findViewById(R.id.otherPrice);

        calc = new Calculator();

        setContentView(R.layout.activity_main);
    }

    public void evaluate(View view) {

        ArrayList<Breja> brejas = createBrejas();

        calculatePricePerVol(brejas);

        int menorPrice = calc.getBestPrice(brejas);

        new AlertDialog.Builder(this)
                .setTitle("posicao do menor preço")
                .setMessage(""+menorPrice)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void calculatePricePerVol(ArrayList<Breja> brejas) {

        for(Breja breja : brejas) {
            breja.setPricePerVol(calc.pricePerVolume(breja.getVol(), breja.getPrice()));
        }
    }

    private ArrayList<Breja> createBrejas() {

        ArrayList<Breja> brejas = new ArrayList<Breja>();

        if(!litrao.getText().toString().isEmpty()) {
            BigDecimal valueLitrao = new BigDecimal(litrao.getText().toString());

            Breja litrao = new Breja("litrao", new BigDecimal(1000), valueLitrao);
            brejas.add(litrao);
        }

        if(!tradicional.getText().toString().isEmpty()) {
            BigDecimal valueTradicional = new BigDecimal(tradicional.getText().toString());

            Breja tradicional = new Breja("tradicional", new BigDecimal(600), valueTradicional);
            brejas.add(tradicional);
        }

        if(!bigLatao.getText().toString().isEmpty()) {
            BigDecimal valueBigLatao = new BigDecimal(bigLatao.getText().toString());

            Breja bigLatao = new Breja("bigLatao", new BigDecimal(550), valueBigLatao);
            brejas.add(bigLatao);
        }

        if(!latao.getText().toString().isEmpty()) {
            BigDecimal valueLatao = new BigDecimal(latao.getText().toString());

            Breja latao = new Breja("latao", new BigDecimal(475), valueLatao);
            brejas.add(latao);
        }

        if(!longNeck.getText().toString().isEmpty()) {
            BigDecimal valueLongNeck = new BigDecimal(longNeck.getText().toString());

            Breja longNeck = new Breja("longNeck", new BigDecimal(355), valueLongNeck);
            brejas.add(longNeck);
        }

        if(!lata.getText().toString().isEmpty()) {
            BigDecimal valueLata = new BigDecimal(lata.getText().toString());

            Breja lata = new Breja("lata", new BigDecimal(350), valueLata);
            brejas.add(lata);
        }

        if(!safadinha.getText().toString().isEmpty()) {
            BigDecimal valueSafadinha = new BigDecimal(safadinha.getText().toString());

            Breja safadinha = new Breja("safadinha", new BigDecimal(300), valueSafadinha);
            brejas.add(safadinha);
        }

        if(!piriguete.getText().toString().isEmpty()) {
            BigDecimal valuePiriguete = new BigDecimal(piriguete.getText().toString());

            Breja piriguete = new Breja("piriguete", new BigDecimal(269), valuePiriguete);
            brejas.add(piriguete);
        }

        if((!otherVol.getText().toString().isEmpty()) && (!otherPrice.getText().toString().isEmpty())) {
            BigDecimal valueOtherVol = new BigDecimal(otherVol.getText().toString());
            BigDecimal valueOtherPrice = new BigDecimal(otherPrice.getText().toString());

            Breja other = new Breja("other", valueOtherVol, valueOtherPrice);
            brejas.add(other);
        }

        return brejas;
    }
}
