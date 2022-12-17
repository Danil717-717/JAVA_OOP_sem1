public class Coffe extends HotDrink{
    private int temperature = 40;

    public Coffe(String name, int volume,  int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public Coffe(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
