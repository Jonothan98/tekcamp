package facade;

public class CheckStock {

    public boolean checkStock(int itemNumber){

        switch (itemNumber){
            case 1:
                System.out.println("Toaster is in Stock");
                return true;
            case 2:
                System.out.println("Gum is in Stock");
                return true;
            case 3:
                System.out.println("Tires are Out of Stock");
                return false;
            case 4:
                System.out.println("Graphic Cards are Out of Stock");
                return false;
            default:
                System.out.println("No Item exist with that number");
                return false;
        }

    }
}
