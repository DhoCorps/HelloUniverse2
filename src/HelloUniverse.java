import java.util.Scanner;

public class HelloUniverse {
    static public void main(String... args){
        String maChaine = "En %d le nombre de planète dans le système solaire était de %d ";
        System.out.println("Hello Universe!!!");
        byte nb_Planete;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une année :");
        short annee = sc.nextShort();
        System.out.println("Vous avez saisi l'année : " + annee);

        if(annee >= 2006) {
            nb_Planete=9;
        }
        else {
            nb_Planete = 8;
        }
        System.out.printf(maChaine,annee,nb_Planete);
    }

}
