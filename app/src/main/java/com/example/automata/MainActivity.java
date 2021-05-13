package com.example.automata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //campos
    private EditText et_cadena;
    private TextView tv_head;
    private boolean validado = false;
    private int bandera=0, caracteres=0;
    private String msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //uniendo la parte grafica con la lógica
        et_cadena = (EditText) findViewById(R.id.etcadena);

        tv_head = (TextView) findViewById(R.id.tvhead);

    }

    public void valida(View view) {
        validado = false;
        bandera=0;
        caracteres=0;
        String cadena = et_cadena.getText().toString();
        char[] xd = cadena.toCharArray();
        S(xd);
        //tv_head.setText(msj);

    }


    //métodos a,b,c,d,s


    public void S(char[] xd){
    int i=bandera;
    while(i< xd.length && !validado){
        //for(int i=bandera; i< xd.length; i++){
            if(xd[i] == 'a' || xd[i] == 'c'){
                caracteres++;
            }else if(xd[i] == 'b'){
                bandera=i+1;
                A(xd);
                validado = true;
            }else{
                validado = false;
                msj = "La cadena no es valida";
                tv_head.setText(msj);
            }
            i++;
        }

    }


    private void A(char[] xd) {
        //for(int i=bandera; i< xd.length; i++){
        int i=bandera;
        while(i< xd.length && !validado){
            if(xd[i] == 'a' || xd[i] == 'b'){
                caracteres++;
                S(xd);
            }else if(xd[i] == 'c'){
                bandera=i+1;
                B(xd);
                validado = true;
            }else{
                validado = false;
                msj = "La cadena no es valida";
                tv_head.setText(msj);
            }
            i++;
        }

    }

    private void B(char[] xd) {
        //for(int i=bandera; i< xd.length; i++){
        int i=bandera;
        while(i< xd.length && !validado){
            if(xd[i] == 'b' || xd[i] == 'c'){
                caracteres++;
                S(xd);
            }else if(xd[i] == 'a'){
                bandera=i+1;
                C(xd);
                validado = true;
            }else{
                validado = false;
                msj = "La cadena no es valida";
                tv_head.setText(msj);
            }
            i++;
        }
    }

    private void C(char[] xd) {
        //for(int i=bandera; i< xd.length; i++){
        int i=bandera;
        while(i< xd.length && !validado){
            if(xd[i] == 'a' || xd[i] == 'b'){
                caracteres++;
                S(xd);
            }else if(xd[i] == 'c'){
                bandera=i+1;
                D(xd);
                validado = true;
            }else{
                validado = false;
                msj = "La cadena no es valida";
                tv_head.setText(msj);
            }
            i++;
        }
    }

    private void D(char[] xd) {
        //for(int i=bandera; i< xd.length; i++){
        int i=bandera;
        while(i< xd.length && !validado){
        if(xd[i] == 'a' || xd[i] == 'b' || xd[i] == 'c'){
            caracteres++;
        }else{
            validado = false;
            msj = "La cadena no es valida";
            tv_head.setText(msj);
        }
        i++;
    }
        if(bandera == xd.length){
            validado = true;
            msj = "La cadena es valida";
            tv_head.setText(msj);
        }

    }

}//fin de la clase