public class HelloUniverse {
    static public void main(String... args){
        System.out.println("Hello Universe!!!");
        byte nb_Planete = 8;
        String maChaine = "Aux dernières nouvelles, le nombre ttotal de planete dans le système solaire était de ";
        System.out.println(maChaine + nb_Planete );
        nb_Planete +=1;
        maChaine = "Il y a quelques années cependant elles étaient au nombre de ";
        System.out.println( maChaine + nb_Planete);
    }

}
