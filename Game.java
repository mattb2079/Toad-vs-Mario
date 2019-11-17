public class Game{

    public static void main (String args[]){

        Character toad = new Character("Toad", 100, 50);
        Character mario = new Character("Mario", 100, 20);

        toad.display();
        mario.display();

        toad.attack(mario);
        mario.attack(toad);
        toad.attack(mario);
        mario.attack(toad);
        toad.attack(mario);
        mario.attack(toad);
        toad.attack(mario);
        mario.attack(toad);
        toad.attack(mario);
        mario.attack(toad);
        toad.attack(mario);
        mario.attack(toad);
    }
}