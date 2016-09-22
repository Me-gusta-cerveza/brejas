package br.com.megustacerveza.brejas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evaluate(View view) {
        EditText litrao = (EditText) findViewById(R.id.litrao);
        BigDecimal valueLitrao = new BigDecimal(litrao.getText().toString());

        EditText tradicional = (EditText) findViewById(R.id.tradicional);
        BigDecimal valueTradicional = new BigDecimal(tradicional.getText().toString());

        EditText bigLatao = (EditText) findViewById(R.id.bigLatao);
        BigDecimal valueBigLatao = new BigDecimal(bigLatao.getText().toString());

        EditText latao = (EditText) findViewById(R.id.latao);
        BigDecimal valueLatao = new BigDecimal(latao.getText().toString());

        EditText longNeck = (EditText) findViewById(R.id.longNeck);
        BigDecimal valueLongNeck = new BigDecimal(longNeck.getText().toString());

        EditText lata = (EditText) findViewById(R.id.lata);
        BigDecimal valueLata = new BigDecimal(lata.getText().toString());

        EditText safadinha = (EditText) findViewById(R.id.safadinha);
        BigDecimal valueSafadinha = new BigDecimal(safadinha.getText().toString());

        EditText piriguete = (EditText) findViewById(R.id.piriguete);
        BigDecimal valuePiriguete = new BigDecimal(piriguete.getText().toString());

        EditText otherVol = (EditText) findViewById(R.id.otherVol);
        BigDecimal valueOtherVol = new BigDecimal(otherVol.getText().toString());

        EditText otherPrice = (EditText) findViewById(R.id.otherPrice);
        BigDecimal valueOtherPrice = new BigDecimal(otherPrice.getText().toString());
    }
}
