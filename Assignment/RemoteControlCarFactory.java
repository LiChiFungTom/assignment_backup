import java.util.*;

public class RemoteControlCarFactory implements ToyProductFactory{
    
   private Scanner sc;

    public ToyProduct createProduct(Scanner sc){
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Enter id");
            int id = sc.nextInt();
            System.out.println("maximum speed(km/hr)");
            double speed = sc.nextDouble();
            System.out.println(id+","+name+","+speed);
            System.out.println("New toy product record created.");
            return new RemoteControlCar(id, name, speed);
    }

}
