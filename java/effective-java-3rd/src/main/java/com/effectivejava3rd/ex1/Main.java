package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        // button.?? // 이 1줄을 완성해주세요.(메인 클래스는 여기만 수정 가능)
        button.setListener(new 사람());
        button.click();
    }

    static class 사람 {
        public void 안녕() {
            System.out.println("Main::안녕!");
        }
    }
    static class Button {
        private Object listener;

        public void setListener(Object listener) {
            this.listener = listener;
        }
        public void click() {
            ((사람) listener).안녕();
        }
    }
}

