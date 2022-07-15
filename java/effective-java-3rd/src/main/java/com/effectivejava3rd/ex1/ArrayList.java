package com.effectivejava3rd.ex1;

public class ArrayList {
    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[2];
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        sizeUpWhenFull();

        datum[size] = data;
        size++;
    }

    public int get(int index) {
        return datum[index];
    }

    private void sizeUpWhenFull() {
        if (size == datum.length) {
            int[] newDatum = new int[datum.length * 2];
            System.arraycopy(datum, 0, newDatum, 0, datum.length);
            datum = newDatum;
        }
    }
}
