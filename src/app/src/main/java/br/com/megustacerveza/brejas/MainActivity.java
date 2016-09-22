package br.com.megustacerveza.brejas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

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

        setContentView(R.layout.activity_main);
    }

    public void evaluate(View view) {

        BigDecimal valueLitrao = new BigDecimal(litrao.getText().toString());


        BigDecimal valueTradicional = new BigDecimal(tradicional.getText().toString());


        BigDecimal valueBigLatao = new BigDecimal(bigLatao.getText().toString());


        BigDecimal valueLatao = new BigDecimal(latao.getText().toString());


        BigDecimal valueLongNeck = new BigDecimal(longNeck.getText().toString());


        BigDecimal valueLata = new BigDecimal(lata.getText().toString());


        BigDecimal valueSafadinha = new BigDecimal(safadinha.getText().toString());


        BigDecimal valuePiriguete = new BigDecimal(piriguete.getText().toString());


        BigDecimal valueOtherVol = new BigDecimal(otherVol.getText().toString());


        BigDecimal valueOtherPrice = new BigDecimal(otherPrice.getText().toString());
    }
}
