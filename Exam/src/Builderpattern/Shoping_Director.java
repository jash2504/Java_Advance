package Builderpattern;

public class Shoping_Director {

    Shopping[] shopping = new Shopping[100];

    public Shoping_Director() {
        shopping[0] = new Shopping_Builder().with_id("ITEM1024")
                .P_name("Watch")
                .Price("10000rs")
                .No_item("3")
                .Cornfirm(true)
                .build();

        shopping[1] = new Shopping_Builder().with_id("ITEM4512").build();
    }

    public void printShoping() {
        for (int i = 0; i < shopping.length; i++) {
            if (shopping[i] != null) {
                System.out.println(shopping[i]);
            }
        }
    }

}
