package com.lawrenceweetman.schrodinger;

import java.util.Optional;

public class Schrodinger<T> {

    Optional<T> value = Optional.empty();

    public void set(T t) {
        value = Optional.ofNullable(t);
    }

    public boolean is(Object that) {
        if(that instanceof Schrodinger) {
            return is((Schrodinger) that);
        } else {
            return !value.isPresent() || value.get().equals(that);
        }
    }

    public boolean is(Schrodinger<Object> that) {
        return !that.value.isPresent() || is(that.value.get());
    }

    public boolean isTrue() {
        return is(Boolean.TRUE);
    }

    public boolean isFalse() {
        return is(Boolean.FALSE);
    }

    public boolean isFortyTwo() {
        return is(42);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Schrodinger) {
            return is((Schrodinger) o);
        }
        return is(o);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
