 import java.util.Scanner;
 
 class d4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine();
        if(RCB.equals("Win"))
        {
            System.out.println("Cup");
        }
        else{
            System.out.println("No Cup");
        }
    }
}
