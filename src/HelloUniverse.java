import java.util.Scanner;

public class HelloUniverse {
    static public void main(String... args){
        String maChaine;
        System.out.println("Hello Universe!!!");
        byte nb_Planete = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une année :");
        int str = sc.nextInt();
        System.out.println("Vous avez saisi l'année : " + str);

        if(str > 2006) {
            maChaine = "En " + str + " le nombre total de planete dans le système solaire était de ";
            System.out.println(maChaine + nb_Planete);
        }
        else {
            nb_Planete++;
            maChaine = "Cependant elles étaient au nombre de ";
            System.out.println(maChaine + nb_Planete + " en " + str);
        }
    }

}
