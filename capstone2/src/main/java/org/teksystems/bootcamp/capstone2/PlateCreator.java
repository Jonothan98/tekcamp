package org.teksystems.bootcamp.capstone2;

public class PlateCreator {

    public ItemPointer[] pickPlateMeat(){

        ItemPointer[] plateMeat = new ItemPointer[5];

        plateMeat[0] = new ItemPointer("Sliced or Chopped Sausage", 5);
        plateMeat[1] = new ItemPointer("Rib", 6);
        plateMeat[2] = new ItemPointer("Brisket and Sausage Mix", 6);
        plateMeat[3] = new ItemPointer("Sausage Wrap", 4);
        plateMeat[4] = new ItemPointer("Boudin", 5);

        return plateMeat;
    }

    public ItemPointer[] plateRibCombo(){

        ItemPointer[] ribCombo = new ItemPointer[3];

        ribCombo[0] = new ItemPointer("Sausage", 3);
        ribCombo[1] = new ItemPointer("Beans", .50);
        ribCombo[2] = new ItemPointer("Potato Salad", .50);

        return ribCombo;
    }

    public ItemPointer[] plateBrisketCombo(){

        ItemPointer[] brisketCombo = new ItemPointer[3];

        brisketCombo[0] = new ItemPointer("Sausage", 3);
        brisketCombo[1] = new ItemPointer("Beans", .50);
        brisketCombo[2] = new ItemPointer("Potato Salad", .50);

        return brisketCombo;
    }

    public ItemPointer[] plateBoudinCombo(){

        ItemPointer[] boudinCombo = new ItemPointer[3];

        boudinCombo[0] = new ItemPointer("Sausage", 3);
        boudinCombo[1] = new ItemPointer("Beans", .50);
        boudinCombo[2] = new ItemPointer("Potato Salad", .50);

        return boudinCombo;
    }

}
