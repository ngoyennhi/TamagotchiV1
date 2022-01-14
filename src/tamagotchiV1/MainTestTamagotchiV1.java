package tamagotchiV1;

public class MainTestTamagotchiV1 {

	public static void main(String[] args) {
    Tamagotchi heoTamagotchi = new Tamagotchi("Heo", 10, 5, true);
    heoTamagotchi.jouer(6);
    heoTamagotchi.dormir();
    heoTamagotchi.affiche();
    heoTamagotchi.manger(10);
	}

}
