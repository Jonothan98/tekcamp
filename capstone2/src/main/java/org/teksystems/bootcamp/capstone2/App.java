package org.teksystems.bootcamp.capstone2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SandwichCreator sandwich = new SandwichCreator();
        ItemPointer[] sandwichPointer = sandwich.pickSandwichMeat();

        System.out.println(sandwichPointer[0].getItemName() + ", "+ sandwichPointer[0].getItemPrice());


    }
}
