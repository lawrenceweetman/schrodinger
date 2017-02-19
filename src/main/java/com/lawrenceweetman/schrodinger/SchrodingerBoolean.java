package com.lawrenceweetman.schrodinger;


public class SchrodingerBoolean extends Schrodinger<Boolean> {

    public static final SchrodingerBoolean CLOSED = new SchrodingerBoolean();
    public static final SchrodingerBoolean TRUE = new SchrodingerBoolean();
    static {
        TRUE.set(true);
    }
    public static final SchrodingerBoolean FALSE = new SchrodingerBoolean();
    static {
        FALSE.set(false);
    }

}