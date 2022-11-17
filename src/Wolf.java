public class Wolf extends Beast{
    public Wolf(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void speed(int speed) {
        System.out.println(getName()+"  can run with the speed of: "+speed);
    }

}
