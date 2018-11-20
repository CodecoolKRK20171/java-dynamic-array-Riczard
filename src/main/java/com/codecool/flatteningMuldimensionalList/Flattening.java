package com.codecool.flatteningMuldimensionalList;

import java.util.ArrayList;

public class Flattening {

    public Flattening(){

    }

    public ArrayList<Object> flattening(ArrayList<Object> multidimensionalList) {

        ArrayList<Object> list = new ArrayList<>();

        for(Object object: multidimensionalList){

            if(object.getClass().equals(String.class) || object.getClass().equals(Integer.class)){
                list.add(object);
            }
            else{
                list.addAll(flattening((ArrayList<Object>)object));
            }

        }

        return list;
    }


}
