package com.example.android.inclassassignment07_nuoj;

import java.io.Serializable;

/**
 * Created by Cherry on 3/6/18.
 */

public class People implements Serializable {
    private String name;
    private int age;
    private boolean married;

    public People(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getMarried(){
        return married;
    }
}
