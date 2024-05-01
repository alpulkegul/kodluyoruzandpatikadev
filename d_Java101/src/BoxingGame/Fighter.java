package BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health,int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge <= 100 && dodge >= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe){
        System.out.println(this.name + " hit " + foe.name + " for " + " " + this.damage + " damage");
        if (foe.isDodge()){
            System.out.println(foe.name + " blocked incoming damage.");
            return foe.health;

        }
        if (foe.health - foe.damage < 0) {
            return 0;
        }
        return foe.health - foe.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
