package com.example.mylibrarymodule;

public class SaveData {
    String fName;
    String sName;
    public SaveData(String firstName,String secondName){
        this.fName = firstName;
        this.sName = secondName;
    }

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }
}
