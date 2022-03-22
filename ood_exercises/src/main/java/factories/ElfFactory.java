package factories;

abstract class ElfFactory {

    public static Elf createElf(String name){
        Elf elf = null;

        if(name.contains("Naughty")){
            elf = new CoalElf();
        } else if(name.contains("Nice")){
            elf = new ToyElf();
        }

        return elf;
    }
}
