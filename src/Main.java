import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String arge[]){



        int[][] array = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };
        /*
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j!=0){
                    byte []temp = new byte[4];
                    int shift = j % 4;
                    int[] tmp = new int[shift];
                    for (int k = 0; k < shift; k++) {
                        tmp[k] = array[j][i];
                    }
                }

            }
        }
        */
        /*for (int[] row : array) {
            for (int col : row) {
                System.out.print(" " + col);
            }
            System.out.println();
        }*/









        AES3 aes = new AES3();
        try {
            aes.encrypt("C:\\Users\\yinon\\IdeaProjects\\aes\\src\\key_long","C:\\Users\\yinon\\IdeaProjects\\aes\\src\\message_long", "C:\\Users\\yinon\\IdeaProjects\\aes\\src\\cipher.txt");
        } catch (IOException e) {
            System.out.println("encryption failed");
        }
        try {
            aes.decrypt("/key_long","/cipher_long", "/plain.txt");
        } catch (IOException e) {
            System.out.println("plain failed");
        }
        Scanner in = new Scanner(System.in);
        String []arrManu = new String[]{"-e", "-d", "-b"};
        for (int i = 0; i <arrManu.length; i++)
            System.out.println(arrManu[i]);

        boolean quit = false;
        String menuItem;

        do {
            menuItem = in.nextLine();

            switch (menuItem) {

                case "-e":

                    System.out.println("You've chosen item #1");
                    choose();
                    break;

                case "-d":

                    System.out.println("You've chosen item #2");
                    choose();
                break;

                case "-b":

                    System.out.println("You've chosen item #3");

                    String []subMenuE = new String[]{"-m", "-c", "-o"};
                    for (int i = 0; i <subMenuE.length; i++)
                        System.out.println(subMenuE[i]);

                    boolean quitSub = false;
                    String SubmenuItem;
                    String m = null;
                    String c = null;
                    String o = null;
                    do {
                        Scanner inSub = new Scanner(System.in);
                        SubmenuItem = inSub.nextLine();

                        switch (SubmenuItem) {
                            case "-m":
                                break;
                            case "-c":
                                break;
                            case "-o":
                                break;
                            default:

                                System.out.println("Invalid choice.");

                        }
                    }while (!quitSub);

                    System.out.println("Bye-bye!");

                    break;


                default:

                    System.out.println("Invalid choice.");

            }

        } while (!quit);

        System.out.println("Bye-bye!");

      }

      public static void choose(){
          String []subMenuE = new String[]{"-k", "-i", "-o"};
          for (int i = 0; i <subMenuE.length; i++)
              System.out.println(subMenuE[i]);

          boolean quitSub = false;
          String SubmenuItem;
          String k = null;
          String i = null;
          String o = null;
          boolean flag=false;
          do {
              System.out.println("subtext");
              Scanner in = new Scanner(System.in);
              SubmenuItem = in.nextLine();


              switch (SubmenuItem) {
                  case "-k":
                      k = in.nextLine();
                      break;
                  case "-i":
                      i = in.nextLine();
                      break;
                  case "-o":
                      o = in.nextLine();
                      break;
                  default:
                      System.out.println("Invalid choice.");
              }
              if(k!=null && i !=null && o !=null){
                  flag =true;
              }
          }while (!flag);
            ///do the code
          System.out.println("Bye-bye!");
      }
}
