package study0610.PokerSimulatorProject;

import java.util.*;

/**
 * 在上一个过程的基础上加上看牌前先排好序
 *
 * A:创建一个HashMap集合
 * B:创建一个ArrayList集合
 * C:创建花色和点数数组
 * D:从0开始往HashMap里存入编号，并存储对应的牌(包括花色和点数)；同时往ArrayList里存储前面的编号
 * E:洗牌(对编号操作)
 * F:发牌(对编号操作，为了保证编号是排序的，就创建TreeSet集合接收)
 * G:看牌(遍历TreeSet，获取编号，再通过编号到HashMap集合对应的牌)
 */

public class PokerCollectionDemo {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int i = 0;
        for (String color : colors) {
            for (String number : numbers) {
                hm.put(i, color.concat(number));
                arr.add(i);
                i++;
            }
        }
        hm.put(i, "大王");
        arr.add(i);
        hm.put(i+1, "小王");
        arr.add(i+1);

        Collections.shuffle(arr);

        TreeMap<Integer, String> player1 = new TreeMap<Integer, String>();
        TreeMap<Integer, String> player2 = new TreeMap<Integer, String>();
        TreeMap<Integer, String> player3 = new TreeMap<Integer, String>();
        TreeMap<Integer, String> lastThreeCard = new TreeMap<Integer, String>();

        int num;
        for (int j = 0; j < arr.size(); j++){
            if (j >= arr.size() - 3) {
                num = arr.get(j);
                lastThreeCard.put(num, hm.get(num));
            }
            else if (j % 3 == 0) {
                num = arr.get(j);
                player1.put(num, hm.get(num));
            }
            else if (j % 3 == 1) {
                num = arr.get(j);
                player2.put(num, hm.get(num));
            }
            else if (j % 3 == 2) {
                num = arr.get(j);
                player3.put(num, hm.get(num));
            }

        }
        pokerLooker(player1, "Player One");
        pokerLooker(player2, "Player Two");
        pokerLooker(player3, "Player Three");
        pokerLooker(lastThreeCard, "底牌");


    }

    public static void pokerLooker (TreeMap<Integer, String> player, String name) {
        System.out.print(name + ": ");

        Set<Integer> set = player.keySet();
        for (int i : set) {
            String value = player.get(i);
            System.out.print(value + "  ");
        }
        System.out.println();
    }

}
