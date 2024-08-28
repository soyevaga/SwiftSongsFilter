import java.util.Scanner;

public class Main {
    //IDEA NUEVA FUNCIONALIDAD: que checkee todas las palabras de todas las canciones
    public static Debut debut;
    public static Fearless fearless;
    public static SpeakNow speaknow;
    public static Red red;
    public static Nineteen nineteen;
    public static Reputation reputation;
    public static Lover lover;
    public static Folklore folklore;
    public static Evermore evermore;
    public static Midnights midnights;
    public static TTPD ttpd;

    public static String[] solution;

    public static void search(String str){
        debut.search(str, solution);
        fearless.search(str, solution);
        speaknow.search(str, solution);
        red.search(str, solution);
        nineteen.search(str, solution);
        reputation.search(str, solution);
        lover.search(str, solution);
        folklore.search(str, solution);
        evermore.search(str, solution);
        midnights.search(str, solution);
        ttpd.search(str, solution);
    }

    public static void main(String[] args) {
        //Every album begins in index 1 except for debut that begins in 0
        Scanner sc = new Scanner(System.in);
        //Return: track+album [0] & titles [1]
        solution = new String[2];
        solution[0]= "";
        solution[1]= "";

        //Initialize albums
        debut = new Debut();
        fearless = new Fearless();
        speaknow = new SpeakNow();
        red = new Red();
        nineteen = new Nineteen();
        reputation = new Reputation();
        lover = new Lover();
        folklore = new Folklore();
        evermore = new Evermore();
        midnights = new Midnights();
        ttpd = new TTPD();

        //Example: search("love");
        System.out.println("Enter word to search: ");
        //Word to search must always be in lowercase
        String input = sc.next().toLowerCase();
        search(input);
        System.out.println("The word "+input+" appears in:");
        System.out.println(solution[0]);
        System.out.println(solution[1]);
    }
}