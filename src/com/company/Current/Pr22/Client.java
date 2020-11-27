package com.company.Current.Pr22;

public class Client {

    private String name;
    private long INN;

    public String getName(){
        return name;
    }

    public long getINN(){
        return INN;
    }

    Client (String name, long INN) {
        this.name = name;
        this.INN = INN;
    }

}
