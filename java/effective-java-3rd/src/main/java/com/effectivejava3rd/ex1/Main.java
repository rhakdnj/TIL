package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        System.out.println("== 사람객체 생성시작 ==");
        new 사람();
        System.out.println("== 사람객체 생성끝 ==");

        System.out.println("== 청둥오리객체 생성시작 ==");
        new 청둥오리();
        System.out.println("== 청둥오리객체 생성끝 ==");
		/* 출력
		== 청둥오리객체 생성시작 ==
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		== 청둥오리객체 생성끝 ==
		*/
    }
}

class 생물 {
    생물() {
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        System.out.println("생물이 생성되었습니다.");
    }
}
class 동물 extends 생물 {
    동물() {
        // super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("동물이 생성되었습니다.");
    }

}
class 사람 extends 동물 {

    사람() {
        super(); // 부모 클래스의 생성자를 호출합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("사람이 생성되었습니다.");
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        System.out.println("청둥오리가 생성되었습니다.");
    }
}

class 오리 extends 동물 {
    오리() {
        System.out.println("오리가 생성되었습니다.");
    }
}


//    String line = "Test 15 lqlq 35 bad 99999 guess 34";
//
//        String[] arr = line.split(" ");
//        int sum1 = 0;
//        for (String s : arr) {
//            if (s.matches("\\d+")) {
//                sum1 += Integer.parseInt(s);
//            }
//        }
//        System.out.println("sum1 = " + sum1);
//
//        int sum = Arrays
//                .stream(line.split(" "))
//                .filter((s) -> s.matches("\\d+"))  // 10 진수 정수
//                .mapToInt(Integer::parseInt)
//                .sum();
//
//        String s = "30 + 40 + 20 + 40 + 20 + 50 + 11 +  -6 + -100";
//
//        int sum2 = Arrays
//                .stream(s.split("\\+"))
//                .map(String::trim)
//                .filter((c) -> c.matches("\\d+") || c.matches("-\\d+"))  // 10 진수 정수
//                .mapToInt(Integer::parseInt)
//                .sum();
//
//        System.out.println("sum2 = " + sum2);