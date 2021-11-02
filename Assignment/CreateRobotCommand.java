import java.util.*;

public class CreateRobotCommand implements Commend{
    private Scanner sc;

    public CreateRobotCommand(Scanner sc){
        this.sc = sc;
    }

    public void execute(){
        ToyProductFactory tpf = new RobotFactory();
        ToyProduct t = tpf.createProduct(sc);
    }

    public void undo(){

    }
   
    public void redo(){

    }

}
