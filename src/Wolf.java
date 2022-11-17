public class Wolf extends Beast{
    public Wolf(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void attack() {
        System.out.println(getName()+"  is attacking!");
    }

    @Override
    public void speed(int speed) {
        System.out.println(getName()+"  can run with the speed of: "+speed);
    }

}