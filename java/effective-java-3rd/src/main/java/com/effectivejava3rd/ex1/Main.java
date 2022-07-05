package com.effectivejava3rd.ex1;



public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("예외 발생"); // 예외를 발생 시킴
        } catch (Exception e) {
            System.out.println("에러 메시지 = " + e.getMessage());
            e.printStackTrace();
        }
    }
}

