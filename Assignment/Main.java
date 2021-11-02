import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pname="";                            // if id == name return product name
        Vector product = new Vector();              // store product
        Stack commands = new Stack();               // store command


        System.out.println("Toy Inventory Management System (TIMS)");
        System.out.println("Please enter command: [c | d | p | s | u | r | l | x]");
        System.out.println("c = create toy, d = display toy, p = purchase toy, s = sell toy, ");
        System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
        System.out.println();

        String commend= sc.nextLine(); //reads string.

        // input part + loop
        // commend => c
        if(commend.equals("c" ) ){
        System.out.println("Enter toy type (ro=Robot/rc=Remote Control Car): ");
        String toytype = sc.nextLine();
        
            if(toytype.equals("rc")){
                Commend c = new CreateRemoteControlCarCommandFactory(sc);
                c.execute();
            }else{
                Commend c = new CreateRobotCommandFactory(sc);
                c.execute();
            }
            

            // if(toytype.equals("ro")){
            //     System.out.println(toytype);
            //     System.out.println("Enter name");
            //     String name = sc.nextLine();
            //     System.out.println("Enter id");
            //     int id = sc.nextInt();
            //     System.out.println("Enter height(cm)");
            //     double height = sc.nextDouble();
            //     System.out.println(id+","+name+","+height);
            //     System.out.println("New toy product record created.");

            // }else{
            //     System.out.println("Enter name");
            //     String name = sc.nextLine();
            //     System.out.println("Enter id");
            //     int id = sc.nextInt();
            //     System.out.println("maximum speed(km/hr)");
            //     double speed = sc.nextDouble();
            //     System.out.println(id+","+name+","+speed);
            //     System.out.println("New toy product record created.");
            // }
        }else if(commend.equals("d")){
            System.out.println("Enter ID(* to display all)");
            String id = sc.nextLine();
            System.out.println("Toy product information");
            if(id.equals("*") ){
                System.out.println("ID    "+"name    "+"Quantity    "+"other Info   "+"Cost    "+"Price    ");      // all detail
                //information
            }else{
                System.out.println("ID: " ); // id
                System.out.println("Name: " ); // name
                System.out.println("Quantity: " );  //qty
                System.out.println("Height(cm): " );  // height
                System.out.println("Cost($): " );    // cost
                System.out.println("Price($): " );  // price
            }
            
        }else if(commend.equals("p")){
            System.out.println("Enter code:");
            int code = sc.nextInt();
            System.out.println("Quantity to purchased:");
            int qty =sc.nextInt();
            System.out.println("Purchasing cost:");
            int cost = sc.nextInt();
            System.out.println("Purchased"+qty+"Box of "+pname+".Current quantity is $"+cost+".Price is $"); // + ToyProduct.price
        }else if(commend.equals("s") ){
           System.out.println("Enter code:");
           int code = sc.nextInt();
           System.out.println("Quantity to be sold:");
           int qty =sc.nextInt();
           System.out.println("Selling price:");
           int price =sc.nextInt();
           System.out.println("Sold "+ qty+"boxes of "+pname+".Current quantity is "+qty+" Selling price is $"+price);
        }else if(commend.equals("l")){
           System.out.println("Undo List:");
           // list of undo list
           
           System.out.println("Redo List:");
           // list of redo list
        }else if(commend.equals("u")){
          System.out.println("Undo completed.");
          //undo execute 
        }else if(commend.equals("r")){
          System.out.println("Redo completed");
          //redo execite
        }else if(commend.equals("x" ) ){
          System.exit(0);
        }

    }
}
