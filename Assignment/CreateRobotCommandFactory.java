import java.util.*;

public class CreateRobotCommandFactory implements CommendFactory{
    
    private Scanner sc;

    public CreateRobotCommandFactory(Scanner sc){
        this.sc = sc;
    }

    public Commend createCommend(){
        return new CreateRobotCommand(sc);
    }


}
