import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
       /* String email = "ansh56-20000@gmail.com";
        String regex = "[a-zA-Z0-9_.-]+[@][a-z]+[.][a-z]{3}";*/
       String email = "BCSC00150";
        //String regex = "[a-zA-Z0-9._-]+[a-z0-9]{4}[@][a-z]{3}[.][a-z]{2}[.][a-z]{2}";
        String regex = "[A-Z0-9]{8}";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(email);

        System.out.println(match.matches() + "    " + email);

    }
}
