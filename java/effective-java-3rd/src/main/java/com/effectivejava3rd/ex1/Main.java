package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Main aMain = new Main();

        실행자 a실행자 = new 실행자();
        a실행자.set리모콘(aMain);
        a실행자.리모콘_작동();
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }

    static class 실행자 {
        private Object a리모콘;

        public void set리모콘(Object a리모콘) {
            this.a리모콘 = a리모콘;
        }

        public void 리모콘_작동() {
            // 너무 구체적 Main 만 가능하다.
            if (a리모콘 instanceof Main) {
                ((Main) a리모콘).안녕();
            }
            // 수정가능지역 끝
        }
    }
}
