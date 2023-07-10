package rpg.fight;

import rpg.character.MagicalHero;
import rpg.character.Ryuuou;

import java.util.Random;
import java.util.Scanner;

public class FinalFight {
    public void fight(MagicalHero h, Ryuuou r){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String name="りゅうおう";
        while(true){
            if(h.hp<=0){
                System.out.println(h.name+"は　ぜんめつした！\n");
                break;
            }

            System.out.println("(\"\"￣``-,　　　　 __／|\n" +
                    "ヽ;（￣ヽ `､　　　/ヾヽ|　 ＿\n" +
                    "　ヽ`'-､_ゝヽ..　　(\"＼ヽ＜。>-.,--､､___\n" +
                    "　　\"~ヾ-~``-`'-　＼.＼　,,\",,ヽ,)___,,..,,__＼\n" +
                    "　　　　　　　　　⊂二　／　,.-)|　／＼　`'-ゝ\n" +
                    "　　　┐┐__ 　　　（_／,,..-''\"-``/￣￣\n" +
                    "　／\"二\"＼i┐,,..,　　　　/.i ￣.i.|　　　／⌒ヽ\n" +
                    "　￣　＼ ＼-''\")＼　__./ .i\"￣`iヽ　／／\"i\".＼\n" +
                    "　　　,,..-''\"　.／　＼ヽ　 /----i　＼/　　　i　　＼\n" +
                    ",,..-''\"　　 ／ι］___/ .., /-─--i　 　）　rゝ　i　　　＼\n" +
                    "＼　　 ／⊂ゝ__　ヽヽ |i　　　　 i|　\"⌒丿ヽ　 i　　　 ＼\n" +
                    "　　|／　　＿　ヾ⊃--i\"\"￣￣\"＼__,.⊂-ヾ⊃　i　　／\n" +
                    "　　　￣￣i-　＼ ／　i\"-__＿___-\"ヽ＼_,.----.,,_i/\n" +
                    "　　　　　　i／　/　　 i_　　　　　　　i　| ヽ\n" +
                    "　　　　　　＼i i　　　 i `-──--`\"i .|　 |\n" +
                    "　　　　　　　ヽ|　　 i i_-__＿＿＿,-i /　　|\n" +
                    "　　　　　　　　＼　 ＼i-__　　　__／/　　/\n" +
                    "　　　　　　　　　＼＿,ゝ.二二--／　　 /\n" +
                    "　　　　　　　　　　/　　i　　　　<　　 ／\n" +
                    "　　　　　　　∠二_/ ./ ＼　　　.＼　＼\n" +
                    "　　　　　　　　　 ./／　ヽ...ゝ　　 ノ　　`'-､,_\n" +
                    "　　　　　　　　　　　　　　　　＜__,,.--,　＼--ゝ\n" +
                    "　　　　　　　　　　　　　　　　　　　　　 ＼|");
            System.out.println("--------------------------");
            System.out.println(h.name + "  HP:" + h.hp  +"  MP:"+ h.mp);
            System.out.println( "りゅうおう　HP:" + r.hp);
            System.out.println("--------------------------");
            System.out.println("なにをする？");
            System.out.println("1:こうげき");
            System.out.println("2:メラ");
            System.out.println("3:ヒャド");
            System.out.println("4:やくそう");
            System.out.println("5:メラゾーマ");
            System.out.println("6:マヒャド");
            System.out.println("7:ベホイミ");
            System.out.println("8:マダンテ");
            System.out.println("--------------------------");
            System.out.println("コマンドをえらんでください");
            int command = scanner.nextInt();
            if(command==1){
                h.attack(r,name);
            }
            else if(command==2){
                h.mera(r,name);
            }
            else if(command==3){
                h.hyado(r,name);
            }
            else if(command==4){
                h.heal();
            }
            else if(command==5){
                h.melazoma(r,name);
            }
            else if(command==6){
                h.mahado(r,name);
            }
            else if(command==7){
                h.behoimi();
            }
            else if(command==8){
                h.madante(r,name);
            }
            if(r.hp<=0){
                System.out.println("(\"\"￣``-,　　　　 __／|\n" +
                        "ヽ;（￣ヽ `､　　　/ヾヽ|　 ＿\n" +
                        "　ヽ`'-､_ゝヽ..　　(\"＼ヽ ☓ -.,--､､___\n" +
                        "　　\"~ヾ-~``-`'-　＼.＼　,,\",,ヽ,)___,,..,,__＼\n" +
                        "　　　　　　　　　⊂二　／　,.-)|　／＼　`'-ゝ\n" +
                        "　　　┐┐__ 　　　（_／,,..-''\"-``/￣￣\n" +
                        "　／\"二\"＼i┐,,..,　　　　/.i ￣.i.|　　　／⌒ヽ\n" +
                        "　￣　＼ ＼-''\")＼　__./ .i\"￣`iヽ　／／\"i\".＼\n" +
                        "　　　,,..-''\"　.／　＼ヽ　 /----i　＼/　　　i　　＼\n" +
                        ",,..-''\"　　 ／ι］___/ .., /-─--i　 　）　rゝ　i　　　＼\n" +
                        "＼　　 ／⊂ゝ__　ヽヽ |i　　　　 i|　\"⌒丿ヽ　 i　　　 ＼\n" +
                        "　　|／　　＿　ヾ⊃--i\"\"￣￣\"＼__,.⊂-ヾ⊃　i　　／\n" +
                        "　　　￣￣i-　＼ ／　i\"-__＿___-\"ヽ＼_,.----.,,_i/\n" +
                        "　　　　　　i／　/　　 i_　　　　　　　i　| ヽ\n" +
                        "　　　　　　＼i i　　　 i `-──--`\"i .|　 |\n" +
                        "　　　　　　　ヽ|　　 i i_-__＿＿＿,-i /　　|\n" +
                        "　　　　　　　　＼　 ＼i-__　　　__／/　　/\n" +
                        "　　　　　　　　　＼＿,ゝ.二二--／　　 /\n" +
                        "　　　　　　　　　　/　　i　　　　<　　 ／\n" +
                        "　　　　　　　∠二_/ ./ ＼　　　.＼　＼\n" +
                        "　　　　　　　　　 ./／　ヽ...ゝ　　 ノ　　`'-､,_\n" +
                        "　　　　　　　　　　　　　　　　＜__,,.--,　＼--ゝ\n" +
                        "　　　　　　　　　　　　　　　　　　　　　 ＼|");
                System.out.println("りゅうおうをたおした！");
                break;
            }
            int tcommand = rand.nextInt(4);
            if(tcommand==0){
                r.bodyblow(h);
            }
            else if(tcommand==1){
                r.breathOfFire(h);
            }
            else if(tcommand==2){
                r.fierceFlame(h);
            }
            else if(tcommand==3){
                r.begirama(h);
            }
        }
    }
}
