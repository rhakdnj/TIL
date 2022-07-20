package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[7];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();
        사람들[5] = 사람.get사람();
        사람들[6] = 사람.get사람();

        for (Main.사람 사람 : 사람들) {
            사람.자기소개();
        }

		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		*/
    }

    static class 사람 {
        private static int index;
        private static int max;

        private int order;
        private static 사람 temp;

        private 사람(int order) {
            this.order = order;
        }

        static {
            index = 0;
            max = 3;
            temp = null;
        }

        public static 사람 get사람() {
            if (index < max) {
                index++;
                temp = new 사람(index);
            }
            return temp;
        }


        public void 자기소개() {
            System.out.println("저는 %d번째 사람입니다.".formatted(order));
        }
    }
}