package rpg.character;

import java.util.Random;

public class Hero {
    public String name;
    public int hp;
    public int mp;
    int da;
    int at=10;
    int he;
    Random rand = new Random();
    public void attack(Slime s,String name){
        if(rand.nextInt(63)==0){
            da = 2*(rand.nextInt(5)+this.at);
            System.out.println(this.name+"の　こうげき！");
            System.out.println("会心の一撃！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
        }
        else{
            da = rand.nextInt(5)+this.at;
            System.out.println(this.name+"の　こうげき！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
        }
        s.hp -= da;

    }
    public void mera(Slime s,String name){
        this.mp -= 2;
        if(mp<0){
            System.out.println("MPがたりない！\n");
        }
        else if(rand.nextInt(63)==0){
            da = 2*(rand.nextInt(5)+15);
            System.out.println(this.name+"は　メラをとなえた！");
            System.out.println("まりょくがぼうそう！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            s.hp -= da;
        }
        else{
            da = rand.nextInt(5)+15;
            System.out.println(this.name+"は　メラをとなえた!");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            s.hp -= da;
        }
    }
    public void hyado(Slime s,String name){
        this.mp -= 3;
        if(mp<0){
            System.out.println("MPがたりない！\n");
        }
        else if(rand.nextInt(63)==0){
            da = 2*(rand.nextInt(5)+17);
            System.out.println(this.name+"は　ヒャドをとなえた！");
            System.out.println("まりょくがぼうそう！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            s.hp -= da;
        }
        else{
            da = rand.nextInt(5)+17;
            System.out.println(this.name+"は　ヒャドをとなえた！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            s.hp -= da;
        }
    }
    public void heal(){
        he = rand.nextInt(5)+10;
        System.out.println(this.name+"は　やくそうをつかった！");
        System.out.println(this.name+"は　HPを"+he+"回復した！\n");
        hp += he;
    }
    public Hero(String name){
        this.hp = 100;
        this.mp = 20;
        this.name = name;
        }

}
