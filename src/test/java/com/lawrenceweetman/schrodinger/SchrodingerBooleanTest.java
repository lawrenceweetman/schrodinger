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
    public void unsetIsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.is(true));
    }

    @Test
    public void unsetIsFrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.is(false));
    }

    @Test
    public void trueIsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertTrue(schrodingerBoolean.is(true));
    }

    @Test
    public void trueIsntFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertFalse(schrodingerBoolean.is(false));
    }

    @Test
    public void falseIsntTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertFalse(schrodingerBoolean.is(true));
    }

    @Test
    public void falseIsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertTrue(schrodingerBoolean.is(false));
    }

    @Test
    public void sameObjectIsEqual() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.equals(schrodingerBoolean));
    }

    @Test
    public void unsetEqualsOtherUnset() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void unsetEqualsSetToTrue() throws Exception {
        SchrodingerBoolean unsetSchrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean trueSchrodingerBoolean = new SchrodingerBoolean();
        trueSchrodingerBoolean.set(true);
        assertTrue(unsetSchrodingerBoolean.equals(trueSchrodingerBoolean));
    }

    @Test
    public void unsetEqualsSetToFalse() throws Exception {
        SchrodingerBoolean unsetSchrodingerBoolean = new SchrodingerBoolean();
        SchrodingerBoolean falseSchrodingerBoolean = new SchrodingerBoolean();
        falseSchrodingerBoolean.set(false);
        assertTrue(unsetSchrodingerBoolean.equals(falseSchrodingerBoolean));
    }

    @Test
    public void trueEqualsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        otherSchrodingerBoolean.set(true);
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void falseEqualsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        SchrodingerBoolean otherSchrodingerBoolean = new SchrodingerBoolean();
        otherSchrodingerBoolean.set(false);
        assertTrue(schrodingerBoolean.equals(otherSchrodingerBoolean));
    }

    @Test
    public void falseDoesntEqualTrue() throws Exception {
        SchrodingerBoolean falseSchrodingerBoolean = new SchrodingerBoolean();
        falseSchrodingerBoolean.set(false);
        SchrodingerBoolean trueSchrodingerBoolean = new SchrodingerBoolean();
        trueSchrodingerBoolean.set(true);
        assertFalse(falseSchrodingerBoolean.equals(trueSchrodingerBoolean));
    }

    @Test
    public void unsetEqualsArbitraryObject() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.equals(new UnsupportedClassVersionError()));
    }

    @Test
    public void trueDoesntEqualArbitraryObject() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertFalse(schrodingerBoolean.equals(new UnsupportedClassVersionError()));
    }


    @Test
    public void falseDoesntEqualArbitraryObject() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertFalse(schrodingerBoolean.equals(new UnsupportedClassVersionError()));
    }

    @Test
    public void staticClosedEqualsStaticTrue() throws Exception {
        assertTrue(SchrodingerBoolean.CLOSED.equals(SchrodingerBoolean.TRUE));
    }

    @Test
    public void staticClosedEqualsStaticFalse() throws Exception {
        assertTrue(SchrodingerBoolean.CLOSED.equals(SchrodingerBoolean.FALSE));
    }

    @Test
    public void staticTrueDoesntEqualStaticFalse() throws Exception {
        assertFalse(SchrodingerBoolean.TRUE.equals(SchrodingerBoolean.FALSE));
    }

    @Test
    public void staticClosedEqualsCreatedUnset() throws Exception {
        assertTrue(SchrodingerBoolean.CLOSED.equals(new SchrodingerBoolean()));
    }

    @Test
    public void staticClosedEqualsCreatedTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertTrue(SchrodingerBoolean.CLOSED.equals(schrodingerBoolean));
    }

    @Test
    public void staticClosedEqualsCreatedFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertTrue(SchrodingerBoolean.CLOSED.equals(schrodingerBoolean));
    }

    @Test
    public void staticTrueEqualsCreatedUnset() throws Exception {
        assertTrue(SchrodingerBoolean.TRUE.equals(new SchrodingerBoolean()));
    }

    @Test
    public void staticTrueEqualsCreatedTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertTrue(SchrodingerBoolean.TRUE.equals(schrodingerBoolean));
    }

    @Test
    public void staticTrueDoesntEqualCreatedFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertFalse(SchrodingerBoolean.TRUE.equals(schrodingerBoolean));
    }

    @Test
    public void staticFalseEqualsCreatedUnset() throws Exception {
        assertTrue(SchrodingerBoolean.FALSE.equals(new SchrodingerBoolean()));
    }

    @Test
    public void staticFalseDoesntEqualCreatedTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertFalse(SchrodingerBoolean.FALSE.equals(schrodingerBoolean));
    }

    @Test
    public void staticFalseEqualsCreatedFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertTrue(SchrodingerBoolean.FALSE.equals(schrodingerBoolean));
    }

    @Test
    public void iWant100PercentCoverage() throws Exception {
        new SchrodingerBoolean().hashCode();
    }

}