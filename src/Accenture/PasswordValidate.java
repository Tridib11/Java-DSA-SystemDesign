package Accenture;

public class PasswordValidate {
    public static void main(String[] args) {
        System.out.println(validate("acd34 4rf"));

    }

    private static int validate(String password){
        if(password.length()<4){
            return 0;
        }
        if(Character.isDigit(password.charAt(0))){
            return 0;
        }

        boolean hasNumeric=false;
        boolean hasUpperCase=false;

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);

            if(Character.isDigit(ch)){
                hasNumeric=true;
            }
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }

            if(ch==' '|| ch=='/'){
                return 0;
            }
        }

        if(!hasNumeric || !hasUpperCase){
            return 0;
        }
        return 1;
    }
}
