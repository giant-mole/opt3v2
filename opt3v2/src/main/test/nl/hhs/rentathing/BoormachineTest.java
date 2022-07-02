package nl.hhs.rentathing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoormachineTest {


    @Test
    void doorlopenTest() {
        //mcc
        Boormachine boormachine000=new Boormachine(5.0,"","", 0.0, false, 1, false, "","");
        Boormachine boormachine001=new Boormachine(5.0,"","", 0.0, false, 1, true, "", "");
        Boormachine boormachine010=new Boormachine(5.0,"","", 0.0, true, 1, false, "", "");
        Boormachine boormachine011=new Boormachine(5.0,"","", 0.0, true, 1, true, "", "");
        Boormachine boormachine100=new Boormachine(5.0,"","", 1.0, false, 1, false, "", "");
        Boormachine boormachine101=new Boormachine(5.0,"","", 1.0, false, 1, true, "", "");
        Boormachine boormachine110=new Boormachine(5.0,"","", 1.0, true, 1, false, "", "");
        Boormachine boormachine111=new Boormachine(5.0,"","", 1.0, true, 1, true, "", "");
        assertFalse(boormachine000.doorlopen());
        assertFalse(boormachine001.doorlopen());
        assertFalse(boormachine010.doorlopen());
        assertFalse(boormachine011.doorlopen());
        assertFalse(boormachine100.doorlopen());
        assertFalse(boormachine101.doorlopen());
        assertFalse(boormachine110.doorlopen());
        assertTrue(boormachine111.doorlopen());


        //mcdc
        assertFalse(boormachine011.doorlopen());
        assertFalse(boormachine101.doorlopen());
        assertFalse(boormachine110.doorlopen());
        assertTrue(boormachine111.doorlopen());
        //m
    }

    @Test
    void verhurenTest() {
        Boormachine boormachine000=new Boormachine(5.0,"","", 0.0, false, 0, false, "","");
        Boormachine boormachine001=new Boormachine(5.0,"","", 0.0, false, 2, true, "", "");
        Boormachine boormachine010=new Boormachine(5.0,"","", 0.0, true, 50, false, "", "");
        Boormachine boormachine011=new Boormachine(5.0,"","", 0.0, true, 100, true, "", "");
        Boormachine boormachine100=new Boormachine(5.0,"","", 1.0, false, 101, false, "", "");
        Boormachine boormachine101=new Boormachine(5.0,"","", 1.0, false, 200, true, "", "");
        assertEquals(0,boormachine000.verhuren());
        assertEquals(1,boormachine001.verhuren());
        assertEquals(1,boormachine010.verhuren());
        assertEquals(1,boormachine011.verhuren());
        assertEquals(2,boormachine100.verhuren());
        assertEquals(2,boormachine101.verhuren());

    }
}