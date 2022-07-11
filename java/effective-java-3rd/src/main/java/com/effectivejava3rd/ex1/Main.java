package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Repo.save(new 사과());
        Repo.save(new 사람());
        Repo.save("안녕"); // "안녕" 은 String 클래스의 객체이다.
        Repo.save(new String("안녕"));

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        // int 형 변수 i의 값 `3`을 객체화 하는 방법
        Integer iObj = i;
        // iObj 리모콘에 연결된 객체에는 3이라는 값이 있습니다.
        // 객체 안에 3이있다고 생각하시면 됩니다.

        Repo.save(b);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(s);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(c);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(i);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(l);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(f);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(d);
        System.out.println("Repo.get() = " + Repo.get());
        Repo.save(bl);
        System.out.println("Repo.get() = " + Repo.get());
    }
}

class Repo {
    static Object object;

    static void save(Object v) {
        System.out.println("Object 값 : " + v);
        object = v;
    }

    static public Object get() {
        return object;
    }
}

class 사람 extends 동물 {
}

class 동물 extends 생물 {
}

class 식물 extends 생물 {
}

class 사과 extends 식물 {
}

// `extends Object` 는 생략가능하다.
class 생물 extends Object {
}

// 이 세상에 있는 모든 클래스는 Object 클래스의 하위 클래스 이다.
// 다시말하면 Object 클래스는 모든 클래스의 최초조상이다.