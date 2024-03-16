package org.example;

public class FullPage {
    public static void main(String[] args) {

        //llamados a las clases
        Registro registro = new Registro();
        LoginShop login = new LoginShop();


        //Llamados a las instancias
        registro.realizarRegistro();
        login.loginShop();


    }
}

