package com.example.gabriel.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Calculadora_main extends AppCompatActivity {

    TextView cal_Display;
    double n1,n2,resultado;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculadora_main);
    }

    private void onClickOperactionCaptureNumero1(View View) {
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        n1 = Double.parseDouble(cal_Display.getText().toString());
        cal_Display.setText("");

    }

    public void buttonPlus(View View){

        Operador = "+";
        onClickOperactionCaptureNumero1(View);
}
    public void buttonMinus(View View){

        Operador = "-";
        onClickOperactionCaptureNumero1(View);
    }

    public void buttonTimes(View View){

        Operador = "*";
        onClickOperactionCaptureNumero1(View);
    }
    public void buttonDivide(View View){

        Operador = "/";
        onClickOperactionCaptureNumero1(View);
    }

    public void button0 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"0");
}

    public void button1 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"1");
    }

    public void button2 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"2");
    }

    public void button3 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"3");
    }

    public void button4 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"4");
    }

    public void button5 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"5");
    }

    public void button6 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"6");
    }

    public void button7 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"7");
    }

    public void button8 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"8");
    }

    public void button9 (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+"9");
    }

    public void buttonDecimal (View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText(cal_Display.getText()+".");
    }

    public void buttonEquals(View View){
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        n2 = Double.parseDouble(cal_Display.getText().toString());

        if (Operador.equals("+")){
            resultado = n1 + n2;
        }
        else if (Operador.equals("-")) {
            resultado = n1 - n2;
        }
        else if (Operador.equals("*")){
            resultado = n1 * n2;
        }
        else if (Operador.equals("/")){
            resultado = n1 / n2;
        }
    }

    public void buttonClear(View View){
        n1 = 0.0;
        n2 = 0.0;
        cal_Display = (TextView) findViewById(R.id.cal_Display);
        cal_Display.setText("");
    }
}



