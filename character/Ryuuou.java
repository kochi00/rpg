package rpg.character;

import java.util.Random;

public class Ryuuou extends Slime{
    public Ryuuou() {
        this.hp = 300;
    }
    Random rand = new Random();
    public void bodyblow(MagicalHero h){
        da = rand.nextInt(5)+20;
        h.hp -= da;
        System.out.println("りゅうおうの　こうげき！");
        System.out.print(h.name+"は "+da+"のダメージをうけた！\n");
    }
    public void begirama(MagicalHero h){
        da = rand.nextInt(5)+25;
        h.hp -= da;
        System.out.println("りゅうおうは　ベギラマをとなえた！");
        System.out.print(h.name+"は "+da+"のダメージをうけた！\n");
    }
    public void breathOfFire(MagicalHero h){
        da = rand.nextInt(5)+25;
        h.hp -= da;
        System.out.println("りゅうおうの　ひのいき！");
        System.out.print(h.name+"は "+da+"のダメージをうけた！\n");
    }
    public void fierceFlame(MagicalHero h){
        da = rand.nextInt(5)+30;
        h.hp -= da;
        System.out.println("りゅうおうの　はげしいほのお！");
        System.out.print(h.name+"は "+da+"のダメージをうけた！\n");
    }
}
