package com.chtuqu.hfdp.ch7_adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

    // remove() is covered by a default method in Interator (JDK 8+)

    private Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
