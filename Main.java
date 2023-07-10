package rpg;

import rpg.character.*;
import rpg.fight.*;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int tcommand;
        String hai="はい";
        String iie="いいえ";
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("名前を入力してください");
        String name = scanner.next();
        Hero h = new Hero(name);
        System.out.println("勇者"+h.name+"を生み出しました！");

        Slime s = new Slime();
        System.out.println("スライムがあらわれた！");

        SlimeFight sf = new SlimeFight();
        sf.fight(h,s);

        System.out.println("１０００００の経験値をかくとく！");

        MagicalHero mh = new MagicalHero(name);
        System.out.println(h.name+"は　魔法戦士になった！");

        System.out.println("この先からいやな気配がする・・・\n本当に進みますか？\nはい\nいいえ\n");
        String c = scanner.next();

        if(Objects.equals(c, hai)){
            Ryuuou r = new Ryuuou();
            System.out.println("りゅうおうがあらわれた！");
            FinalFight ff = new FinalFight();
            ff.fight(mh,r);
            System.out.println("おわり");
        }
        else if(Objects.equals(c, iie)){
            System.out.println("おわり");
        }
    }

}
