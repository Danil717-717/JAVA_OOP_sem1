public class HotDrink extends HotDrinkVendingMachine{
    private int volume;
    private String name;


    public HotDrink(String name,int volume ) {
        this.volume = volume;
        this.name = name;
    }
    public HotDrink(String name,int volume, int temperatura ) {
        this.volume = volume;
        this.name = name;

    }



    public HotDrink() {
    }

    public int getVolume(int i) {
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName(String cofe) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink - " +
                "Обьем =" + volume +
                ", Имя ='" + name + '\'' +
                '.';
    }
}
