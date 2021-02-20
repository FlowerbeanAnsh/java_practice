import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public void EmailValidate(String email){
        String email_regex = "^(.+)@(.+)$";


        Pattern pattern = Pattern.compile(email_regex);
        if(pattern.matcher(email).matches()){
            System.out.println("Valid Email");
        }
        else if( email.isEmpty()){
            System.out.println("Enter Email!!");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}
class EmailValidate1{
    public static void main(String[] args) {
        EmailValidation obj = new EmailValidation();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of Emails :");
        int n = kb.nextInt();
        System.out.println("Enter the Emails: ");
        for (int i = 0; i < n; i++) {
            String email = kb.next();
            obj.EmailValidate(email);
        }

    }
}