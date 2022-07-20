package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Duck a청둥오리 = DuckFactory.get("청둥");
        Duck a흰오리 = DuckFactory.get("흰");
        Duck a고무오리 = DuckFactory.get("고무");
        Duck a고무2오리 = DuckFactory.get("고무2");
        Duck a로봇오리 = DuckFactory.get("로봇");

        a청둥오리.fly();
        // 출력 : 청둥오리 : 날개로 날아갑니다.
        a청둥오리.cry();
        // 출력 : 청둥오리 : 꽥꽥!!

        a흰오리.fly();
        // 출력 : 흰오리 : 날개로 날아갑니다.
        a흰오리.cry();
        // 출력 : 흰오리 : 꽥꽥!!

        a고무오리.fly();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무오리.cry();
        // 출력 : 고무오리 : 삑!삑!

        a고무2오리.fly();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무2오리.cry();
        // 출력 : 고무오리 : Peek!Peek!

        a로봇오리.fly();
        // 출력 : 로봇오리 : 로켓파워로 날아갑니다!!
        a로봇오리.cry();
        // 출력 : 로봇오리 : 기계는 울 수 없습니다.

        a고무2오리.setFlyItem(new 로켓날개비행Item());
        a고무2오리.fly();
        // 출력 : 고무오리 : 로켓파워로 날아갑니다!!
    }

    static class DuckFactory {

        public static Duck get(String kind) {
            Duck duck = new Duck(kind);

            switch (kind) {
                case "흰":
                case "청둥":
                    duck.setFlyItem(new 날개비행Item());
                    duck.setCryItem(new 꽥CryItem());
                    break;
                case "고무":
                    duck.setFlyItem(new 못나는비행Item());
                    duck.setCryItem(new 삑CryItem());
                    break;
                case "고무2":
                    duck.setFlyItem(new 못나는비행Item());
                    duck.setCryItem(new 영어삑CryItem());
                    break;
                case "로봇":
                    duck.setFlyItem(new 로켓날개비행Item());
                    duck.setCryItem(new 기계CryItem());
                    break;
            }
            return duck;
        }
    }

    static class Duck {
        private final String kind;
        private FlyItem flyItem;
        private CryItem cryItem;

        public Duck(String kind) {
            this.kind = kind;
        }

        public void setFlyItem(FlyItem flyItem) {
            this.flyItem = flyItem;
        }

        public void setCryItem(CryItem cryItem) {
            this.cryItem = cryItem;
        }

        public void fly() {
            flyItem.use(kind);
        }

        public void cry() {
            cryItem.use(kind);
        }
    }

    interface Item {

        void use(String user);
    }

    interface FlyItem extends Item {

    }

    static class 날개비행Item implements FlyItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "날개로 날아갑니다.");
        }
    }

    static class 못나는비행Item implements FlyItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "저는 날 수 없어요. ㅠㅠ");
        }
    }

    static class 로켓날개비행Item implements FlyItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "로켓 파워로 날아갑니다.");
        }
    }

    interface CryItem extends Item {

    }

    static class 꽥CryItem implements CryItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "꽥꽥!!");
        }
    }

    static class 삑CryItem implements CryItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "삑삑!!");
        }
    }

    static class 영어삑CryItem implements CryItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "Peek!Peek!");
        }
    }

    static class 기계CryItem implements CryItem {
        @Override
        public void use(String user) {
            System.out.println(user + "오리 : " + "기계는 울 수 없습니다.");
        }
    }
}