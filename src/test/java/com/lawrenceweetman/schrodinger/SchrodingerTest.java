package com.lawrenceweetman.schrodinger;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchrodingerTest {

    @Test
    public void unsetSchrodingerFileOutputStreamIsFortyTwo() {
        Schrodinger<FileOutputStream> schrodinger = new Schrodinger<>();
        assertTrue(schrodinger.isFortyTwo());
    }

    @Test
    public void setSchrodingerFileOutputStreamIsntFortyTwo() throws FileNotFoundException {
        Schrodinger<FileOutputStream> schrodinger = new Schrodinger<>();
        schrodinger.set(new FileOutputStream("name"));
        assertFalse(schrodinger.isFortyTwo());
    }

    @Test
    public void fortyTwoSchrodingerIsFortyTwo() {
        Schrodinger<Integer> schrodinger = new Schrodinger<>();
        schrodinger.set(42);
        assertTrue(schrodinger.isFortyTwo());
    }

    @Test
    public void fortyTwoSchrodingerIsSetFileOutputStreamSchrodinger() {
        Schrodinger<Integer> integerSchrodinger = new Schrodinger<>();
        integerSchrodinger.set(42);
        Schrodinger<FileOutputStream> fileOutputStreamSchrodinger = new Schrodinger<>();
        assertTrue(integerSchrodinger.is(fileOutputStreamSchrodinger));
    }

    @Test
    public void fortyTwoSchrodingerIsntSetFileOutputStreamSchrodinger() throws FileNotFoundException {
        Schrodinger<Integer> integerSchrodinger = new Schrodinger<>();
        integerSchrodinger.set(42);
        Schrodinger<FileOutputStream> fileOutputStreamSchrodinger = new Schrodinger<>();
        fileOutputStreamSchrodinger.set(new FileOutputStream("name"));
        assertFalse(integerSchrodinger.is(fileOutputStreamSchrodinger));
    }

    @Test
    public void unsetIntegerSchrodingerIsUnsetFileOutputStreamSchrodinger() {
        Schrodinger<Integer> integerSchrodinger = new Schrodinger<>();
        Schrodinger<FileOutputStream> fileOutputStreamSchrodinger = new Schrodinger<>();
        assertTrue(integerSchrodinger.is(fileOutputStreamSchrodinger));
    }

}
