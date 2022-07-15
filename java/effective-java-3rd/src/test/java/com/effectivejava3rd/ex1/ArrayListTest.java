package com.effectivejava3rd.ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ArrayListTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }

    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertThat(al.size()).isEqualTo(0);
    }

    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);

        assertThat(al.size()).isEqualTo(1);
    }

    @Test
    void get() {
        ArrayList al = new ArrayList();
        al.add(100);
        int rs = al.get(0);

        assertThat(rs).isEqualTo(100);
    }

    @Test
    void add를_한번_할_때_마다_size가_증가() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertThat(al.size()).isEqualTo(3);
    }

    @Test
    void get_1_equals_200() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        int rs = al.get(1);

        assertThat(rs).isEqualTo(200);
    }
}