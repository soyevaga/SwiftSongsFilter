import java.util.Scanner;

public class ProcessLyrics {
    //Given lyrics, creates a String without intros and [...] info
    //Paste lyrics as given in genius and add END
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String res= "\"";
        int cont=0;
        while(!line.equals("END")){
            if(!line.equals("")) {
                if (line.charAt(0) != '[') {
                    res += line;
                    cont+=line.length();
                    if(cont>=90){
                        cont=0;
                        res+="\" +\n\"";
                    }else res+=" ";
                }
            }
            line = sc.nextLine();
        }
        res+="\"";
        System.out.println(res);
    }
}
