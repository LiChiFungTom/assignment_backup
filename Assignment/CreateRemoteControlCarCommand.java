import java.util.*;

public class CreateRemoteControlCarCommand implements Commend{
    
    private Scanner sc;
    private Vector product;

    public CreateRemoteControlCarCommand(Scanner sc){
        this.sc = sc;
    }

    public void execute(){

        ToyProductFactory tpf = new RemoteControlCarFactory();
        ToyProduct t = tpf.createProduct(sc);
        //product.add(sc);

    }
    
    public void undo(){

    }
    
    
    public void redo(){

    }

}
