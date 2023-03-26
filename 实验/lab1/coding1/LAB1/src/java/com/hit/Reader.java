package com.hit;

public class Reader {
    public String name;
    public String password;
    public Reader(String name,String password)
    {
        this.name = name;
        this.password = password;
    }
    public Reader(){}

    @Override
    public String toString(){
        String s = "Name:"+ name + "," + "Password:" + password;
        return s;
    }
}
