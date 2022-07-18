package com.effectivejava3rd.ex1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        for (String name : ages.keySet()) {
            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
        HashMap<String, Object> everyone = new HashMap<>();
        everyone.put("사람", new 사람());
        everyone.put("원숭이", new 원숭이());
        ((사람) everyone.get("사람")).말하다();
        // 출력 => 사람이 말합니다.
        ((원숭이) everyone.get("원숭이")).묘기를_부리다();
        // 출력 => 원숭이가 묘기를 부립니다.
    }

    static class HashMap<K, V> {
        Object[] keys;
        Object[] values;
        int lastIndex;

        public HashMap() {
            keys = new Object[1];
            values = new Object[1];
            lastIndex = 0;
        }

        private boolean isFull() {
            return lastIndex >= keys.length;
        }

        private void extendsArraySizeIfFull() {
            if (!(isFull())) {
                return;
            }

            Object[] newKeys = new Object[keys.length * 2];
            Object[] newValues = new Object[values.length * 2];

            for (int i = 0; i < keys.length; i++) {
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }

            keys = newKeys;
            values = newValues;
        }

        public void put(K key, V value) {
            int keyIndex = getIndexOfKey(key);

            if (keyIndex >= 0) {
                values[keyIndex] = value;
            } else {
                extendsArraySizeIfFull();
                keys[lastIndex] = key;
                values[lastIndex] = value;
                lastIndex++;
            }
        }

        public void remove(K key) {
            int keyIndex = getIndexOfKey(key);
            if (keyIndex >= 0) {
                remove(keyIndex);
            }
        }

        public void remove(int index) {
            for (int i = index; i < lastIndex; i++) {
                keys[i] = keys[i + 1];
                values[i] = values[i + 1];
            }
            lastIndex--;
        }

        private int getIndexOfKey(K key) {
            for (int i = 0; i < lastIndex; i++) {
                if (keys[i].equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public Set<K> keySet() {
            Set<K> keySet = new HashSet<>();

            for (int i = 0; i < lastIndex; i++) {
                keySet.add((K) keys[i]);
            }
            return keySet;
        }

        public V get(K key) {
            int keyIndex = getIndexOfKey(key);
            if (keyIndex >= 0) {
                return (V) values[keyIndex];
            }
            return null;
        }
    }

    static class 사람 {
        void 말하다() {
            System.out.println("사람이 말합니다.");
        }
    }

    static class 원숭이 {
        void 묘기를_부리다() {
            System.out.println("원숭이가 묘기를 부립니다.");
        }
    }
}
