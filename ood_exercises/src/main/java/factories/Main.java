package factories;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> naughtyOrNice = new ArrayList<>();
        naughtyOrNice.add("Naughty Kevin");
        naughtyOrNice.add("Nice Peter");
        naughtyOrNice.add("Nice Jake");
        naughtyOrNice.add("Naughty Daxter");
        naughtyOrNice.add("Naughty Dexter");
        naughtyOrNice.add("Nice Nathan");

        for (String s : naughtyOrNice) {
            Elf elf = ElfFactory.createElf(s);
            System.out.print(s + " deserves: ");
            elf.gift();
        }
     }
}
