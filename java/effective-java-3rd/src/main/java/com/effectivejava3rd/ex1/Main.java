package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {

        System.out.printf("str_part_equals(\"abcd\", 0, 2, \"ab\") : %d\n", str_part_equals("abcd", 0, 2, "ab"));
        // 출력 => str_equals("abcd", 0, 2, "ab") : 1

        System.out.printf("str_part_equals(\"abcd\", 1, 2, \"b\") : %d\n", str_part_equals("abcd", 1, 2, "b"));
        // 출력 => str_equals("abcd", 1, 2, "b") : 1

        System.out.printf("str_part_equals(\"abcd\", 2, 2, \"\") : %d\n", str_part_equals("abcd", 2, 2, ""));
        // 출력 => str_equals("abcd", 2, 2, "") : 1

        System.out.printf("str_part_equals(\"abcd\", 2, 4, \"cb\") : %d\n", str_part_equals("abcd", 2, 4, "cb"));
        // 출력 => str_equals("abcd", 2, 4, "cb") : 0

        System.out.printf("str_part_equals(\"abcd\", 2, 4, \"cd\") : %d\n", str_part_equals("abcd", 2, 4, "cd"));
        // 출력 => str_equals("abcd", 2, 4, "cb") : 1
    }

    private static int str_part_equals(String str, int start, int end, String target) {
        String substring = str.substring(start, end);
        return substring.equals(target) ? 1 : 0;
    }
}

