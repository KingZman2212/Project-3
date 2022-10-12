package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    ArrayList<T> array = new ArrayList<T>();

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public void add(T item) {
        array.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return array.iterator();
    }

}
