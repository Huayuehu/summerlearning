package study0610.PokerSimulatorProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 模拟斗地主洗牌和发牌-version1.0
 *
 * 扑克牌：54
 * 小王
 * 大王
 * 黑桃A,黑桃2,黑桃3,黑桃4,黑桃...,黑桃10,黑桃J,黑桃Q,黑桃K
 * 红桃...
 * 梅花...
 * 方块...
 *
 * 分析：
 * 		A:造一个牌盒(集合)
 * 		B:造每一张牌，然后存储到牌盒里面去: 定义一个花色数组，一个点数数组
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */

public class PokerDemo {
    public static void main(String args[]) {
        //A:造一个牌盒(集合)
        ArrayList<String> arr = new ArrayList<String>();

        //B:造每一张牌，然后存储到牌盒里面去: 定义一个花色数组，一个点数数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //将花色和数字拼接起来加入arr
        for (String color : colors) {
            for (String number : numbers) {
                arr.add(color.concat(number));
            }
        }

        arr.add("大王");
        arr.add("小王");

        //C:洗牌
        Collections.shuffle(arr);

        //D:发牌，发给3个玩家，最后三张作为底牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> lastThreeCard = new ArrayList<String>();

        for (int i = 0;i < arr.size(); i++){
            if (i >= arr.size() - 3) {
                lastThreeCard.add(arr.get(i));
            }
            else if (i % 3 == 0) {
                player1.add(arr.get(i));
            }
            else if (i % 3 == 1) {
                player2.add(arr.get(i));
            }
            else if (i % 3 == 2) {
                player3.add(arr.get(i));
            }

        }

        //E:看牌
        System.out.println("Player1: " + player1);
        System.out.println("Player1: " + player2);
        System.out.println("Player1: " + player3);
        System.out.println("底牌: " + lastThreeCard);
    }
}
