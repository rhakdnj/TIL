package com.effectivejava3rd.ex1;


import org.springframework.format.annotation.DateTimeFormat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDateTime;

@Main.TestInfo(testedBy = "james", testTools = {"JUnit", "JUnit5"}, testDate = @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME))
public class Main {
    public static void main(String[] args) {
        Class<Main> cls = Main.class;
        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());
        System.out.println("anno.testDate() = " + anno.testDate());

        for (String testTool : anno.testTools()) {
            System.out.println("testTool = " + testTool);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface TestInfo {
        int count() default 1;
        String testedBy();
        String[] testTools() default "JUnit";
        TestType testType() default TestType.FIRST;
        DateTimeFormat testDate();
    }

    enum TestType {FIRST, FINAL}
}
