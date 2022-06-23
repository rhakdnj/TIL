package com.effectivejava3rd.item01;

public class Foo {

    String name;

    String address;

    public Foo() {

    }

    private static final Foo FOO_INSTANCE = new Foo();

    public Foo(String name) {
        this.name = name;
    }

    /*
    public Foo(String address) {
        this.address = address;
    }
    */

    // return Type: Interface 실제 리턴은 구현체. User 는 인터페이스만 사용
    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFooInstance() {
        return FOO_INSTANCE;
    }

    // 리턴하는 객체의 클래스가 입력 매개변수에 따라 매번 다를 수 있다.
    // Foo -> 자식을 리턴 해도 되는 것
    public static Foo getInstance(boolean flag) {
        return flag ? new Foo() : new BarFoo();
    }

    public static void main(String[] args) {
        Foo foo = new Foo("jongmin");

        Foo foo1 = Foo.withName("james");

        Foo foo2 = Foo.getFooInstance();
    }

    static class BarFoo extends Foo {
    }
}
