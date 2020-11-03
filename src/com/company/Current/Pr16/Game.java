package com.company.Current.Pr16;

import java.util.Scanner;

public class Game {
    private int turn;
    private Player one;
    private Player two;

    Game(int[] numbers1, int[] numbers2)
    {
        one = new Player("Первый", numbers1);
        two = new Player("Второй", numbers2);
        turn = 0;
    }

    private boolean turn(Player first, Player second)
    {
        Card one = first.showCard();
        Card two = second.showCard();
        System.out.println("Ход номер " + turn + ".");
        if (one == null || two == null) {
            System.out.println("У одного из игроков закончились карты!");
            return false;
        }
        System.out.println(first.name + " вскрывает карту первым, и это " + one.getValue() + ".");
        System.out.println(second.name + " вскрывает карту вторым, и это " + two.getValue() + ".");
        if (one.greater(two)) {
            System.out.println("Карта игрока " + first.name + " выиграла, он забирает обе карты себе.");
            first.addCards(one, two);
        }
        else {
            System.out.println("Карта игрока " + second.name + " выиграла, он забирает обе карты себе.");
            second.addCards(one, two);
        }
        System.out.println("-----------------------------");
        return true;
    }

    private void play()
    {
        boolean notWin = true;
        while (notWin)
        {
            if (turn == 106) break;
            if (turn % 2 == 0)
                notWin = turn (one, two);
            else
                notWin = turn (two, one);
            turn++;
        }

        if (one.empty())
            System.out.println(two.name + " выиграл на " + (turn-1) + " ходу!");
        else if (two.empty())
            System.out.println(one.name + " выиграл на " + (turn-1) + " ходу!");
        else
            System.out.println("И это ничья, дамы и господа!");
    }

    //1 3 5 7 9 2 4 6 8 0
    //второй - 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cards1 = new int[5];
        for (int i = 0; i < cards1.length; i++)
            cards1[i] = sc.nextInt();
        int[] cards2 = new int[5];
        for (int i = 0; i < cards2.length; i++)
            cards2[i] = sc.nextInt();
        Game g = new Game(cards1, cards2);
        g.play();
    }
}
