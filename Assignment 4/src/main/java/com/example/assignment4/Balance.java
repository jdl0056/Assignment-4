package com.example.assignment4;

public class Balance {
    public double bal;
    public String toSQL(){
        StringBuilder sb = new StringBuilder("(");
        sb.append(bal).append(",");
        return sb.toString();
    }
}
