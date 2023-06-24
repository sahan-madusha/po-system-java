import java.util.Scanner;

public class AppInitializer {

    //==========database area=======
    static String[][] user = new String[3][2];
    //==========database area=======

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //program initialization
        String initializePageQuestion [] = {
                "1) Do you want to login ?",
                "2) Are you new to here ?",
                "3) Dou you want to exit the page ?",
        };

        for (String q: initializePageQuestion) {
            System.out.println(q);
        }

        int userInput = input.nextInt();

        switch (userInput){
            case 1:
                login(userInput);
                break;
            case 2 :
                register();
                break;
            case 3 :

                break;
            default:return;


        }

    }

    //login process
    public static boolean login(int input){
        if (input == 1){
            return true;
        } else if (input == 2) {
            return true;
        } else if (input == 3) {
            return true;
        }
        return false;
    };

    //register
    public static void register(){
        Scanner input = new Scanner(System.in);

        if (user[user.length-1][0] != null ){

        }

        System.out.println("Insert your Email !");
        String email = input.nextLine();
        System.out.println("Insert your password !");
        String password = input.nextLine();
    };


}

//v7 1.02