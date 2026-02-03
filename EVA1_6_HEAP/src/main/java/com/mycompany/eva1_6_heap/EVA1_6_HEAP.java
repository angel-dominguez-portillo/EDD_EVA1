/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_heap;

/**
 *
 * @author bisonte
 */
public class EVA1_6_HEAP {

    public static void main(String[] args) {
        int i = 100;
        Object obj = new Object();
        System.out.println(obj);

        EVA1_6_HEAP memory = new EVA1_6_HEAP();
        memory.foo(obj);
    }
    public void foo(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}
