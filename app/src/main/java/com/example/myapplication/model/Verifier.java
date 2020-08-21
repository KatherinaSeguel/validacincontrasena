package com.example.myapplication.model;

public class Verifier  implements Iverifier{
public  static  final int MIN_LENGTH = 5;
public static  final int WEAK = -1;
public  static  final int MEDIUM= -2;
public static  final int STRONG = -3;

    @Override
    public boolean evaluateLength(String password) {

        return password.length()>MIN_LENGTH;
    }

    @Override
    public boolean evaluateUpper(String password) {

        return !password.toLowerCase().equals(password);//pasa a minusculas y compara con la password.
    }
}
