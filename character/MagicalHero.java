package rpg.character;

public class MagicalHero extends Hero{

    public MagicalHero(String name) {
        super(name);
        this.at = 30;
        this.hp = 200;
        this.mp = 100;
    }
    public void melazoma(Ryuuou r,String name){
        this.mp -= 12;
        if(mp<0){
            System.out.println("MPがたりない！\n");
        }
        else if(rand.nextInt(63)==0){
            da = 2*(rand.nextInt(10)+50);
            System.out.println(this.name+"は　メラゾーマをとなえた！");
            System.out.println("まりょくがぼうそう！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            r.hp -= da;
        }
        else{
            da = rand.nextInt(10)+50;
            System.out.println(this.name+"は　メラゾーマをとなえた!");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            r.hp -= da;
        }
    }
    public void mahado(Ryuuou r,String name){
        this.mp -= 12;
        if(mp<0){
            System.out.println("MPがたりない！\n");
        }
        else if(rand.nextInt(63)==0){
            da = 2*(rand.nextInt(10)+40);
            System.out.println(this.name+"は　マヒャドをとなえた！");
            System.out.println("まりょくがぼうそう！");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            r.hp -= da;
        }
        else{
            da = rand.nextInt(10)+40;
            System.out.println(this.name+"は　マヒャドをとなえた!");
            System.out.println(name+"に　"+da+"のダメージ！\n");
            r.hp -= da;
        }
    }
    public void behoimi(){
        this.mp -= 10;
        if(mp<0){
            System.out.println("MPがたりない！\n");
        }
        this.he = rand.nextInt(10)+50;
        System.out.println(this.name+"は　ベホイミをとなえた！");
        System.out.println(this.name+"は　HPを"+he+"回復した！\n");
        this.hp += this.he;
        if(this.hp>200){
            this.hp=200;
        }

    }
    public void madante(Ryuuou r,String name){
        this.da = this.mp*3;
        this.mp = 0;
        System.out.println(this.name+"は　マダンテをとなえた!");
        System.out.println(name+"に　"+da+"のダメージ！\n");
        r.hp -= da;

    }


}
