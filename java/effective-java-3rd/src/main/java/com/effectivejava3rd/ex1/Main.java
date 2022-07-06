package com.effectivejava3rd.ex1;


import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1234567L);
        Person p2 = new Person(1234567L);

        if (p1.equals(p2)) System.out.println("p1, p2 는 같은 사람");
        else System.out.println("p1, p2 는 다른 사람");
    }

    static class Person {
        long id;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Person)) {
                return false;
            }
            return id == ((Person) obj).id;
        }

        public Person(long id) {
            this.id = id;
        }
    }
}
