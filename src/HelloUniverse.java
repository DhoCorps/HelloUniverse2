import java.util.Scanner;

public class HelloUniverse {
    static public void main(String... args){

        System.out.println("Hello Universe!!!");
        byte nb_Planete;
        String maChaine = "En %d le nombre de planète dans le système solaire était de %d ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une année :");
        short annee = sc.nextShort();
        System.out.println("Vous avez saisi l'année : " + annee);


        if(annee <= 1600) {
            System.out.printf("Notre système informatique ne dispose pas de données suffisantes pour affirmer avec certitude le nombre de planète reconnu par la communauté scientifique de l'époque en %d :( .",annee);
        }
        else if (annee<=1700) {
            nb_Planete = 7;
            System.out.printf(maChaine, annee, nb_Planete);
        }
        else if(annee<=1800){
            nb_Planete = 8;
            System.out.printf(maChaine,annee,nb_Planete);
        }
        else if (annee< 2006){
            nb_Planete=9;
            System.out.printf(maChaine,annee,nb_Planete);
        }
        else if (annee <= 2022){
            nb_Planete = 8;
            System.out.printf(maChaine,annee,nb_Planete);
        }
        else{
            System.out.printf("Nous ne savons pas à l'avance combien de planètes seront dénombrées en %d",annee);
        }

    }

}
