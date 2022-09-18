package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
    }

    static abstract class Activity {
        abstract public void onCreate();
    }

    static class MainActivity extends Activity implements View.OnClickListener {
        @Override
        public void onCreate() {
            System.out.println("메인 액티비티가 실행되었습니다.");

            // 아래 코드가 실행되도록 해주세요.
            View aButton = new Button(this);
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void clicked() {
                    System.out.println("출력 : 익명내부객체는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
                }
            });

            aButton.fireClickEvent();
        }

        @Override
        public void clicked() {
            System.out.println("MainActivity는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
        }
    }

    abstract static class View {
        private OnClickListener onClickListener;

        interface OnClickListener {
            void clicked();
        }

        void setOnClickListener(OnClickListener onClickListener) {
            this.onClickListener = onClickListener;
        }

        public void fireClickEvent() {
            System.out.println("== 버튼이 클릭되었습니다. ==");
            System.out.println("구독자에게 알람을 합니다.");

            this.onClickListener.clicked();
        }
    }

    static class Button extends View {
        Button(Activity activity) {

        }
    }

    static class 사과 implements View.OnClickListener {

        @Override
        public void clicked() {
            System.out.println("사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
        }
    }
}

