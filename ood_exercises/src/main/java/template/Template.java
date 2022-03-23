package template;

public abstract class Template {

    public void tellStory(){
        System.out.print("Every time I leave the " + getLocation());
        System.out.println(" there are " + getQuantity() + " birds looking at me, and lately it has been freaking me out.");
    }

    public abstract String getLocation();

    public abstract String getQuantity();
}
