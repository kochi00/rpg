package rpg.fight;

import rpg.character.Hero;
import rpg.character.Slime;

import java.util.Random;
import java.util.Scanner;

public class SlimeFight {
    public void fight(Hero h, Slime s){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String name="スライム";
        while(true){
            if(h.hp<=0){
                System.out.println(h.name+"は　ぜんめつした！\n");
                break;
            }

            System.out.println(
                    "\n\n　　　　　　　　　　 i⌒i\n" +
                            "　　　　　　　　　　 |　 |\n" +
                            "　　　　　　　　 ,,ｒ'　 　 'ヽ、\n" +
                            "　　　　　　,,r‐''　　　　　　 ヽ､\n" +
                            "　　　　 ／　　　　　　　　　　　   ＼\n" +
                            "　　　 /　　　　（ ･ ）（ ･ ）　　　　ヽ\n" +
                            "　　　 |　　　 ,-､　　　　　,-､　　　 |\n" +
                            "　　　 ヽ　　 ヽ､ ￣￣￣￣￣  ノ　　 /\n" +
                            "　　　　 `-､　　｀￣￣￣￣￣´　　　 ／\n" +
                            "　　　　　　 ￣￣￣￣￣￣￣￣￣￣");
            System.out.println("--------------------------");
            System.out.println(h.name + "  HP:" + h.hp  +"  MP:"+ h.mp);
            System.out.println( "スライム　HP:" + s.hp);
            System.out.println("--------------------------");
            System.out.println("なにをする？");
            System.out.println("1:こうげき");
            System.out.println("2:メラ");
            System.out.println("3:ヒャド");
            System.out.println("4:やくそう");
            System.out.println("--------------------------");
            System.out.println("コマンドをえらんでください");
            int command = scanner.nextInt();
            if(command==1){
                h.attack(s,name);
            }
            else if(command==2){
                h.mera(s,name);
            }
            else if(command==3){
                h.hyado(s,name);
            }
            else if(command==4){
                h.heal();
            }
            if(s.hp<=0){
                System.out.println(
                        "\n\n　　　　　　　　　　 i⌒i\n" +
                                "　　　　　　　　　　 |　 |\n" +
                                "　　　　　　　　 ,,ｒ'　 　 'ヽ、\n" +
                                "　　　　　　,,r‐''　　　　　　 ヽ､\n" +
                                "　　　　 ／　　　　　　　　　　　   ＼\n" +
                                "　　　 /　　　　 　☓ 　　 ☓  　　　ヽ\n" +
                                "　　　 |　　　 ,-､　　　　　,-､　　　 |\n" +
                                "　　　 ヽ　　 ヽ､ ￣￣￣￣￣  ノ　　 /\n" +
                                "　　　　 `-､　　｀￣￣￣￣￣´　　　 ／\n" +
                                "　　　　　　 ￣￣￣￣￣￣￣￣￣￣\n");
                System.out.println("スライムをたおした！");
                break;
            }
            int tcommand = rand.nextInt(3);
            if(tcommand==0){
                s.bodyblow(h);
            }
            else if(tcommand==1){
                s.mera(h);
            }
            else if(tcommand==2){
                s.lookCleary(h);
            }
        }
    }
}

