package com.codecool.flatteningMuldimensionalList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlatteningTest {

    @Test
    void testFlatteningExpectedPass() {
        ArrayList<Object> multiDimensionalList = prepareMultidimensionalList();
        ArrayList<Object> expectedList = prepareExpectedList();

        Flattening flattening = new Flattening();

        ArrayList<Object> resultList = flattening.flattening(multiDimensionalList);

        assertEquals(expectedList.toString(), resultList.toString());

    }

    @Test
    void testFlattening2() {

        Flattening flattening = new Flattening();
        ArrayList<Object> resultList = flattening.flattening(prepareExpectedList2());

        assertEquals(prepareExpectedList2().toString(), resultList.toString());
    }

    private ArrayList<Object> prepareMultidimensionalList() {

        ArrayList<Object> multidimensionalList = new ArrayList<>();
        multidimensionalList.add(1);
        multidimensionalList.add(3);

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("age");
        list1.add(5);

        multidimensionalList.add(list1);
        multidimensionalList.add("Kraków");

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(1);

        ArrayList<Object> list3 = new ArrayList<>();
        list3.add(3);

        ArrayList<Object> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(5);

        list3.add(list4);
        list3.add("codecool");

        list2.add(list3);
        list2.add(6);
        list2.add(7);

        multidimensionalList.add(list2);

        return multidimensionalList;
    }

    private ArrayList<Object> prepareExpectedList() {

        ArrayList<Object> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add("age");
        list.add(5);
        list.add("Kraków");
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add("codecool");
        list.add(6);
        list.add(7);

        return list;
    }

    private ArrayList<Object> prepareExpectedList2() {
        ArrayList<Object> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add("codecool");
        list.add(5);
        list.add(8);

        return list;
    }

}