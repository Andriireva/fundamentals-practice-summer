package oop.enumeations;

public class EnumExampls {
    public static void main(String[] args) {
//        Color red = new Color(); // it not possible to call contructor
        Color red = Color.RED;
//        Color yellow = "yellow";
        Chair oldChair = new Chair("oldone", 1d, Color.GREEN);
        Chair newChair = new Chair("coolone", 100d, Color.BLUE);
        Chair childChair = new Chair("smally", 20d, Color.ORANGE);
        System.out.println(childChair.getColor()); // when ever enum stinglify it shows the name of that value
        Color newChairColor = newChair.getColor();
        String newChairColorHex = newChairColor.getHex();
        System.out.println("hex color is " + newChairColorHex);
        newChairColor.doSomethd();
//        newChairColor.setHex("ANOTHER HEX__"); if it exist
        System.out.println("hex color is " + newChairColor.getHex());
        Color colorByString = Color.getColorByString("YelloW");
        System.out.println("Static method return Color: " + colorByString);


    }
}
