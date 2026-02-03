/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_referenciad;

/**
 *
 * @author bisonte
 */
public class EVA1_5_REFERENCIAD {

    public static void main(String[] args) {
        int x = 100;
        Prueba prueba = new Prueba();//CREANDO UNA INSTANCIA DE PRUEBA
        System.out.println(x);
        System.out.println(prueba);
        //En Java, una variable que guarda una direccion (memoria se llama REFERENCIA
        //En otros lenguajes --> apuntadores
        //COMO DESTRUYO EL OBJETO
        prueba = null;//esto solo desconecta la variable del objeto
    }
}


class Prueba{
    int y = 200;
}
