import java.util.Scanner;

public class sprendimas3 {


    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);

        String login = skaitytuvas.nextLine();
        System.out.println("login = " + login);
        String Email = skaitytuvas.nextLine();
        System.out.println("Email = " + Email);
        String Pasword = skaitytuvas.nextLine();
        System.out.println("Pasword = " + Pasword);
        String RePasword = skaitytuvas.nextLine();
        System.out.println("RePasword = " + RePasword);

        boolean arVienodi = arLoginNesutampaSuPasw(login, Pasword);
        System.out.println("Login ir Pasword negali sutapti = " + arVienodi);
        boolean arNesutampa = arNesutampaPaswordai(Pasword, RePasword);
        System.out.println("Slaptazodziai negali nesutapti = " + arNesutampa);
        boolean arYrasimbolis1 = aremaileYraEta(Email);
        System.out.println("Pasto adrese turi buti @ ir . =" + arYrasimbolis1);
        Boolean arYraDaugiauDesimtRaidziuPasw = desimtRaidziu(Pasword);
        System.out.println("Pasworde turi buti daugiau 10 raidziu = " + arYraDaugiauDesimtRaidziuPasw);


        boolean arYraMazosios = mazosiosRaides(Pasword);
        System.out.println("Slaptazodyje turi buti bent viena mazoji raide = " + arYraMazosios);
        boolean arYraDidziosios =didziosiosRaides(Pasword);
        System.out.println("Slpatazodyje turi buti bent viena didzioji raide= " + arYraDidziosios);


    }

    public static boolean arLoginNesutampaSuPasw(String login, String Pasword) {
        if (login.equals(Pasword)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean arNesutampaPaswordai(String Pasword, String RePasword) {
        if (Pasword.equals(RePasword))
        {
            return true;
        }
        else {
         return   false;
        }

    }

    public static boolean aremaileYraEta(String Email) {
        if (Email.contains("@") && Email.contains("."))
        {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean desimtRaidziu(String Pasword) {
        String S = Pasword;
        int lend = S.length();
        if (lend > 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean didziosiosRaides(String Pasword) {
        if (Pasword.equals(Pasword.toUpperCase())) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean mazosiosRaides(String Pasword) {
        if (Pasword.equals(Pasword.toLowerCase())) {
            return false;
        }
        else {
            return true;
        }
    }

}



















