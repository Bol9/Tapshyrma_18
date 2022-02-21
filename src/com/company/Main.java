package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractAnimasl cow1 = new Cow(205.34,(byte) 23,"male","ui-1");
        AbstractAnimasl cow2 = new Cow(235.34,(byte) 13,"female","ui-2");
        AbstractAnimasl cow3 = new Cow(235.34,(byte) 3,"female","ui-3");
        AbstractAnimasl cow4 = new Cow(350.34,(byte) 33,"male","ui-4");
        AbstractAnimasl cow5 = new Cow(232.34,(byte) 19,"female","ui-5");


        AbstractAnimasl sheep1 = new Sheep(56.34, (byte) 39,"male","Sheep-1");
        AbstractAnimasl sheep2 = new Sheep(62.34, (byte) 36,"female","Sheep-2");
        AbstractAnimasl sheep3 = new Sheep(54.34, (byte) 24,"male","Sheep-3");

        AbstractAnimasl horse1 = new Horse(123.4,(byte) 12,"male","Horse-1","ak");
        AbstractAnimasl horse2 = new Horse(183.4,(byte) 32,"female","Horse-2","kara");


        Farm farm1 = new Farm("Tokmok",new Cow[]{(Cow) cow1,(Cow) cow2,
                (Cow) cow3, (Cow) cow4, (Cow) cow5},
                new Sheep[]{(Sheep) sheep1,(Sheep) sheep2,(Sheep) sheep3},new Horse[]{(Horse) horse1,
                (Horse) horse2},"KalysBekmenbetov");



        AbstractAnimasl cow = new Cow(215.94,(byte) 21,"male","ui");
        AbstractAnimasl sheep = new Sheep(56.14, (byte) 39,"female","Sheep");
        AbstractAnimasl horse = new Horse(13.4,(byte) 32,"male","Horse","ak");



        Farm farm2 = new Farm("Bishkek",new Cow[]{(Cow) cow},
                new Sheep[]{(Sheep) sheep},new Horse[]{(Horse) horse
                },"SamatBeksultanov");


        System.out.println(farm1);
        System.out.println(farm2);







    }
}
