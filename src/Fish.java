public class Fish  extends Product{

    private int weight;
    @Override
    public void doSmth() {
        System.out.println("Это класс рыба");
        weight += 100;
    }
}
