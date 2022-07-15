package com.effectivejava3rd.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayListTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }

    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(0, al.size());
    }
}