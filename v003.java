package com.company.Works;

import java.util.Scanner;

public class v003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        for (int i = 0; i < 1; i++) {
            System.out.println("次の質問にあてはまる数値を0～100の間で入力せよ (全5門)");
            System.out.println("0 (全くあてはまらない)～100 (すごくあてはまる) ");
            System.out.print("\n");
        }

        System.out.println("どちらかと言えば仕事よりプライベートを優先する方だ");
        System.out.print("あてはまり具合 0～100の数値を入力 : ");
        int A = scn.nextInt();
        System.out.print("\n");

        System.out.println("外に出て運動するより家にいて読書やゲームをする方が好きだ");
        System.out.print("あてはまり具合 0～100の数値を入力 : ");
        int B = scn.nextInt();
        System.out.print("\n");

        System.out.println("物を買うときには しっかり下調べをしてから買う方だ");
        System.out.print("あてはまり具合 0～100の数値を入力: ");
        int C = scn.nextInt();
        System.out.print("\n");

        System.out.println("山より海が好きだ");
        System.out.print("あてはまり具合 0～100の数値を入力 : ");
        int D = scn.nextInt();
        System.out.print("\n");

        System.out.println("海より川が好きだ");
        System.out.print("あてはまり具合 0～100の数値を入力 : ");
        int E = scn.nextInt();
        System.out.print("\n");

        int sum = A + B + C + D + E;

        System.out.print("\n");
        System.out.println("合計は → " + sum);
        System.out.print("\n");
        System.out.println("数値が500に近いほど");
        System.out.println("僕と考え方が似ているでしょう");


    }
}
