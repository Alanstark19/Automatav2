package com.example.automata;

public class Automata4 {
    String cadena;
    char[] caracter;
    int cont = 0;
    String concatenacion = "",msj;
    boolean validacion = true;

    public Automata4(String cadena) {
        this.cadena = cadena;
        caracter = cadena.toCharArray();

        S();
    }

    private void S() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    A();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
                resultado(validacion);
            }
        }
    }

    private void A() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    resultado(validacion);
                    break;
                }
                else{
                    B();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;


                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
                resultado(validacion);
            }
        }
    }

    private void B() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;

                if(cont == cadena.length()){
                    validacion = false;
                    resultado(validacion);
                    break;
                }
                else{
                    S();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
                resultado(validacion);
            }
        }
    }

    private void resultado(boolean validacion) {
        if(validacion == true){
            msj = "cadena válida para el automata4";

        }
        else{
            msj = "cadena inválida para el automata4";
        }
    }

    public String mensaje(){
        return  msj;
    }
}
