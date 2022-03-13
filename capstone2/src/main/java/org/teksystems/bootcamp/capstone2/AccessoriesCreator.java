package org.teksystems.bootcamp.capstone2;

public class AccessoriesCreator {


    public ItemPointer[] createAccessories(){

        ItemPointer[] accessories = new ItemPointer[8];

        accessories[0] = new ItemPointer("Soft Drink", 1);
        accessories[1] = new ItemPointer("Chips", 1);
        accessories[2] = new ItemPointer("Beans", 1);
        accessories[3] = new ItemPointer("Breads", 1);
        accessories[4] = new ItemPointer("Potato Salad", 1);
        accessories[5] = new ItemPointer("Jalapeno", .25);
        accessories[6] = new ItemPointer("Stuffed Jalapenos", 1);
        accessories[7] = new ItemPointer("Extra Meat", 1);

        return accessories;
    }

}
