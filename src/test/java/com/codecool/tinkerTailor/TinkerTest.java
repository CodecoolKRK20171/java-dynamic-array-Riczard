package com.codecool.tinkerTailor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinkerTest {

    @Test
    void testetWinerExpected4(){
        Tinker tinker = new Tinker(5, 3);
        int winner = tinker.getWiner();
        int expectedWinner = 4;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test2getWinerExpected5(){
        Tinker tinker = new Tinker(6, 2);
        int winner = tinker.getWiner();
        int expectedWinner = 5;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test3getWinerExpected1(){
        Tinker tinker = new Tinker(6, 3);
        int winner = tinker.getWiner();
        int expectedWinner = 1;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test4getWinerExpected2(){
        Tinker tinker = new Tinker(3, 3);
        int winner = tinker.getWiner();
        int expectedWinner = 2;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test5getWinerExpected1(){
        Tinker tinker = new Tinker(3, 6);
        int winner = tinker.getWiner();
        int expectedWinner = 1;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test6getWinerExpected2(){
        Tinker tinker = new Tinker(2, 11);
        int winner = tinker.getWiner();
        int expectedWinner = 2;
        assertEquals(expectedWinner, winner);
    }

    @Test
    void test7getWinerExpected4(){
        Tinker tinker = new Tinker(6, 11);
        int winner = tinker.getWiner();
        int expectedWinner = 4;
        assertEquals(expectedWinner, winner);
    }

}