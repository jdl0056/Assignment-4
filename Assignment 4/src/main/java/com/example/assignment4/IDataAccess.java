package com.example.assignment4;

public interface IDataAccess {
    public Balance loadBalance(double bal);
    public double saveBalance(Balance balance);
}
