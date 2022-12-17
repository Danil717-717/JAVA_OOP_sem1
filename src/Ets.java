public class Ets  extends Product{

    private double wight;

    private double volume;

    public Ets(double wight, double volume){
        this.wight = wight;
        this.volume = volume;
    }

    public Ets(String name, double price, double wight, double volume){
        super(name, price);
        this.wight = wight;
        this.volume = volume;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
