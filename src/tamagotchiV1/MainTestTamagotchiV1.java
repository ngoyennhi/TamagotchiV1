package tamagotchiV1;

public class MainTestTamagotchiV1 {

	public static void main(String[] args) {
	
    Tamagotchi heoTamagotchi = new Tamagotchi();
    
    Boolean vie = heoTamagotchi.getStatus();
    
    String nomTama = heoTamagotchi.getNom();
    
    //le nombre de fois repeter un activité
    int fois;
    
    while(vie) {
    	heoTamagotchi.affiche();
    	System.out.println();
    	System.out.println("Choisissez un activité pour " + nomTama);
        System.out.println("0-jouer   1-dormir   2-manger");
        int activite = Clavier.lireInt();
        switch (activite) {
		case 0:
			System.out.println("Combien fois voulez-vous jouer avec " + nomTama +" ?");
			System.out.println("saissisez un chiffre entier entre 1 et 10, svp ");
			fois = Clavier.lireInt();
			heoTamagotchi.jouer(fois);
			break;
		case 1:
			heoTamagotchi.dormir();
			break;
		case 2:
			System.out.println("Combien fois voulez-vous nourrir " + nomTama +" ?");
			System.out.println("saissisez un chiffre entier entre 1 et 15, svp ");
			fois = Clavier.lireInt();
		    heoTamagotchi.manger(fois);
		break;
		default:
			System.out.println("Veuillez selectionner un chiffre parmi les chiffres proposés, svp");
			break;
		}
        // mettre à jours status de vie de votre Tamagotchi
         vie = heoTamagotchi.getStatus();    
    }
	}

}
