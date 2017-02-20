package com.lawrenceweetman.schrodinger;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchrodingerBasicExample {

    @Test
    public void basicInitialisation() throws Exception {
        Schrodinger<String> schrodingerString = new Schrodinger<String>();
        Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

        assertTrue(schrodingerString.isTrue());
        assertTrue(schrodingerString.isFalse());
        assertTrue(schrodingerString.equals(schrodingerInteger));
    }

    @Test
    public void assignValueToBoth() throws Exception {
        Schrodinger<String> schrodingerString = new Schrodinger<String>();
        Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

        schrodingerString.set("Hello World!");
        schrodingerInteger.set(1);

        assertFalse(schrodingerString.isTrue());
        assertFalse(schrodingerString.isFalse());
        assertFalse(schrodingerString.equals(schrodingerInteger));
    }

    @Test
    public void assignValueToOne() throws Exception {
        Schrodinger<String> schrodingerString = new Schrodinger<String>();
        Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

        schrodingerString.set("Hello World!");

        assertFalse(schrodingerString.isTrue());
        assertFalse(schrodingerString.isFalse());

        assertTrue(schrodingerInteger.isTrue());
        assertTrue(schrodingerInteger.isFalse());
        assertTrue(schrodingerInteger.equals(schrodingerString));
    }

    @Test
    public void schrodingerBooleanInitialised() throws Exception {
        SchrodingerBoolean schrodingerBoolean = SchrodingerBoolean.CLOSED;
        Schrodinger<String> schrodingerString = new Schrodinger<String>();

        assertTrue(schrodingerBoolean.isTrue());
        assertTrue(schrodingerBoolean.isFalse());
        assertTrue(schrodingerBoolean.equals(schrodingerString));
    }

    @Test
    public void schrodingerBooleanSet() throws Exception {
        Schrodinger<String> schrodingerString = new Schrodinger<String>();

        SchrodingerBoolean schrodingerBoolean = SchrodingerBoolean.TRUE;

        assertFalse(schrodingerBoolean.isFalse());
        assertTrue(schrodingerBoolean.isTrue());
        assertTrue(schrodingerBoolean.equals(schrodingerString));

        schrodingerString.set("Hello World!");

        assertFalse(schrodingerBoolean.equals(schrodingerString));
    }
}
