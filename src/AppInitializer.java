import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppInitializer {

    //==========database area=======(access all around the project)

    static String[][] user = new String[3][2]; //[user][email,password]

    //==========database area=======


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exitState = false;

        //program initialization
        String initializePageQuestion [] = {
                "1) Do you want to login ?",
                "2) Are you new to here ?",
                "3) Dou you want to exit the page ?",
        };

        while (!exitState){
            for (String q: initializePageQuestion) {
                System.out.println(q);
            }

            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    if (login()){
                        openDashboard();
                    }
                    break;
                case 2 :
                    if (register()){
                        openDashboard();
                    }
                    break;
                case 3 :
                    System.out.println("Good Bye !");
                    return;
                default:
                    System.out.println("Wrong input");
                    return;//exist
            }
        }

    }

    //login process
    public static boolean login(){
        Scanner input = new Scanner(System.in);

        printUi("Login");

        System.out.println("Please Enter your Email !");
        String email = input.nextLine();
        System.out.println("Please Enter your password !");
        String password = input.nextLine();

        for (int i = 0; i < user.length; i++) {
            if ( user[i][0] != null && user[i][0].equals(email)){
                if (user[i][1].equals(password)){
                    System.out.println("Welcome again!");
                    return true;
                }else {
                    System.out.println("Wrong Password");
                    return false;
                }
            }
        }
        System.out.println("404 not found ");
        return false;

    };

    //register
    public static boolean register(){
        Scanner input = new Scanner(System.in);

        printUi("Register");

        //check array is empty or not
        if (user[user.length-1][0] != null ){
            System.out.println("User database is full !");
            return false;
        }

        System.out.println("Insert your Email !");
        String email = input.nextLine();

        System.out.println("Insert your password !");
        String password = input.nextLine();

        for (int i = 0; i < user.length ; i++) {
            if (user[i][0] == null){
                user[i][0] = email;
                user[i][1] = password;
                return  true;
            }else {
                if (user[i][0].equalsIgnoreCase(email)){
                    System.out.println("Email is already exists !");
                    return false;
                }
            }
        }
        return false;
    };

    //dashboard process
    public static void openDashboard(){
        System.out.println("inside dashboard ");
    }

    //ui design
    public  static void printUi(String position){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        String simpleDate = dateFormat.format(date);
        String simpleTime = dateFormat.format(date);

        System.out.println("===="+simpleDate+"===="+simpleTime+" "+position);
    }



}
