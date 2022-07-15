package com.effectivejava3rd.ex1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

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

    @Test
    void removeAt() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.removeAt(1);

        assertThat(al.get(1)).isEqualTo(300);
    }

    @Test
    void removeAt을_실행하면_size가_1_줄어든다() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertThat(al.size()).isEqualTo(3);

        al.removeAt(1);

        assertThat(al.size()).isEqualTo(2);
    }

    @Test
    void removeAt을_실행하면_뒷좌석에_있는_데이터들이_전부_한칸씩_앞으로_이동() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertThat(al.get(1)).isEqualTo(200);

        al.removeAt(1);

        assertThat(al.get(1)).isEqualTo(300);
    }

    @Test
    void 최초에_배열의_크기는_2_이다() {
        ArrayList al = new ArrayList();

        assertThat(al.getArrayLength()).isEqualTo(2);
    }

    @Test
    void 배열이_꽉_차면_2배_크기로_증가해야_한다() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        assertThat(al.getArrayLength()).isEqualTo(2);

        al.add(300);
        assertThat(al.getArrayLength()).isEqualTo(4);
    }

    @Test
    void showAllValues() {
        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(200);
        al.add(30);

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        al.showAllValues();

        String rs = output.toString();

        TestUtil.clearSetOutToByteArray(output);

        assertThat(rs).contains("== 전체 데이터 출력 ==");
        assertThat(rs).contains("0 : 1000");
        assertThat(rs).contains("1 : 200");
        assertThat(rs).contains("2 : 30");
    }
}