package rpg.character;
import java.util.Random;
public class Slime {
    public int hp = 50;
    int da;
    Random rand = new Random();
    public void bodyblow(Hero h){
        da = rand.nextInt(5)+5;
        h.hp -= da;
        System.out.println("スライムの　こうげき！");
        System.out.print(h.name+"は "+da+"のダメージをうけた！");
    }
    public void mera(Hero h){
        da = rand.nextInt(5)+10;
        h.hp -= da;
        System.out.println("スライムは　メラを　となえた！");
        System.out.print(h.name+"は"+da+"ダメージをうけた！\n");
    }
    public void lookCleary(Hero h){
        System.out.println("スライムはこちらをじっと見ている");
    }
}
