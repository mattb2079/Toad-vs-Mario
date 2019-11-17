public class Character{

    private String name;
    private int energy;
    private int lifes;
    private int attackPoints;

    // constructor
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lifes=3;
    }

    // getters
    public String getName(){
        return this.name;
    }

    public int getLifePoints(){
        return this.energy;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }

    // methods

    public void display(){
        System.out.println(" ------------------------ ");
        System.out.println("Name: " + this.name);
        System.out.println("Lifes: " + this.lifes);
        System.out.println("Energy: " + this.getLifePoints());
        System.out.println("Attack Points: " + this.getAttackPoints());
    }

    public void attack (Character opponent){
        if (this.lifes > 0){     //prevents an attack from a character that has already lost
            
            System.out.println(this.name + " is attacking ... " + opponent.getName());

            opponent.energy = opponent.getLifePoints() - this.getAttackPoints();
            opponent.display();

            if ( opponent.energy <= 0){
                opponent.lifes = opponent.lifes - 1;
                opponent.display();
                opponent.energy = 100;
            }

            if (opponent.lifes <= 0){
                System.out.println("GAME OVER!!!");            
            }
        }
    }

    
}