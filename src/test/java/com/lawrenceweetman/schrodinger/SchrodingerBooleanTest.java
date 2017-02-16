package com.lawrenceweetman.schrodinger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchrodingerBooleanTest {

    @Test
    public void createdBooleanEvaluatesToTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.isTrue());
    }

    @Test
    public void createdBooleanEvaluatesToFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToTrueEvaluatesAsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertTrue(schrodingerBoolean.isTrue());
    }

    @Test
    public void setToTrueDoesNotEvaluateAsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertFalse(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToFalseEvaluatesAsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertTrue(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToFalseDoesNotEvaluateAsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertFalse(schrodingerBoolean.isTrue());
    }

    @Test
    public void testSameObjectIsEqual() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.equals(schrodingerBoolean));
    }

    @Test
    public void testUnsetEqualsOtherUnset() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void testUnsetDoesntEqualSetToTrue() throws Exception {
        SchrodingerBoolean unsetSchrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean trueSchrodingerBoolean = new SchrodingerBoolean();
        trueSchrodingerBoolean.set(true);
        assertFalse(unsetSchrodingerBoolean.equals(trueSchrodingerBoolean));
    }

    @Test
    public void testUnsetDoesntEqualSetToFalse() throws Exception {
        SchrodingerBoolean unsetSchrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean falseSchrodingerBoolean = new SchrodingerBoolean();
        falseSchrodingerBoolean.set(false);
        assertFalse(unsetSchrodingerBoolean.equals(falseSchrodingerBoolean));
    }

    @Test
    public void testTrueEqualsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        otherSchrodingerBoolean.set(true);
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void testFalseEqualsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        otherSchrodingerBoolean.set(false);
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void testFalseDoesntEqualTrue() throws Exception {
        SchrodingerBoolean falseSchrodingerBoolean = new SchrodingerBoolean();
        falseSchrodingerBoolean.set(false);
        SchrodingerBoolean trueSchrodingerBoolean = new SchrodingerBoolean();
        trueSchrodingerBoolean.set(true);
        assertFalse(falseSchrodingerBoolean.equals(trueSchrodingerBoolean));
    }

}