package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        try{
            throw new Exception("e");
        }
        catch(Exception e){
            System.out.print(e.getStackTrace()[1].getMethodName());
        }

    }

}