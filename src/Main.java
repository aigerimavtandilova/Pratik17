import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Beast[]beasts={new Tiger("Tiger",80),
        new Gepard("Gepard",50),
        new Wolf("Wolf",50)};
        for (Beast beast:beasts) {
            System.out.println(beast);
            beast.attack();
            if (beast.getClass().equals(Tiger.class)){
                beast.speed(50);
            } else if (beast.getClass().equals(Gepard.class)) {
                beast.speed(60);
            }else {
                beast.speed(70);
            }
        }
    }
}