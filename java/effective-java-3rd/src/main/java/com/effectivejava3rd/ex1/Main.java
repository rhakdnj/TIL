package com.effectivejava3rd.ex1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View aButton = new Button();

        aButton.addOnClickListener(new 홍길동());
        aButton.fireClickEvent();

        aButton.addOnClickListener(new 홍길순());
        aButton.fireClickEvent();
    }

    static class View {
        private final List<OnClickListener> OnClickListenerList = new ArrayList<>();

        public void addOnClickListener(OnClickListener a구독자) {
            OnClickListenerList.add(a구독자);
        }

        public void fireClickEvent() {
            System.out.println("뷰가 클릭되었습니다.");

            for (OnClickListener a구독자 : OnClickListenerList) {
                a구독자.소식받기("뷰가 클릭됨");
            }
        }
    }

    static class Button extends View {

    }

    interface OnClickListener {
        public void 소식받기(String msg);
    }

    static class 홍길동 implements OnClickListener {
        @Override
        public void 소식받기(String msg) {
            System.out.println("홍길동이 받은 메세지 : " + msg);
        }
    }

    static class 홍길순 implements OnClickListener {
        @Override
        public void 소식받기(String msg) {
            System.out.println("홍길순이 받은 메세지 : " + msg);
        }
    }

}


