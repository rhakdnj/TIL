package com.effectivejava3rd.ex1;


import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 1, 140),
                new Student("소자바", 2, 190),
                new Student("정자바", 1, 280),
                new Student("김자바", 3, 110)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)  // 반별 정렬
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }

    static class Student implements Comparable<Student> {
        String name;
        int ban;
        int totalScore;

        public Student(String name, int ban, int totalScore) {
            this.name = name;
            this.ban = ban;
            this.totalScore = totalScore;
        }

        @Override
        public String toString() {
            return """
                    [%s, %d, %d]""".formatted(name, ban, totalScore);
        }

        @Override  // 내림차순으로 정렬
        public int compareTo(Student s) {
            return s.totalScore - this.totalScore;
        }

        public int getBan() {
            return ban;
        }
    }
}