package com.example.task01;

import java.nio.charset.StandardCharsets;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();

    }

    static void codeWithNPE(){
        try {
            String test = null; //Любой ссылчный тип данных
            System.out.println(test.getBytes(StandardCharsets.UTF_8));
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
