package com.example.tacocloud.domain;

import org.omg.CORBA.PUBLIC_MEMBER;

//import lomback.Data;
public class Ingredient {
    private final String id;
    public String getId() {
        return id;
    }

    private final String name;
    public String getName() {
        return name;
    }

    private final Type type;
    public Type getType() {
        return type;
    }


    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }


    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
