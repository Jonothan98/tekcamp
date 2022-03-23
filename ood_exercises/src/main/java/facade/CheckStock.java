package facade;

public class CheckStock {

    private String itemName;
    private int cost;

    public boolean checkStock(){

        UserInput userInput = new UserInput();

        int userItem = userInput.userChoice();

        switch (userItem){
            case 1:
                System.out.println("Toaster is in Stock");
                this.cost = 20;
                this.itemName = "Toaster";
                return true;
            case 2:
                System.out.println("Gum is in Stock");
                this.cost = 1;
                this.itemName = "Gum";
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

    public int getCost() {
        return cost;
    }

    public String getItemName() {
        return itemName;
    }
}
