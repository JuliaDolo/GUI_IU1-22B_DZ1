package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Загадайте число от 1 до 2147483647");
        int start=1;
        int finish=2147483647;
        int x= finish/2+1;
        int numb=0;
        boolean isFind=false;
        int schet=0;
        Scanner in = new Scanner(System.in);
        while(!isFind){
            System.out.println("Ваше число "+x);
            System.out.print("Введите знак: ");
            String com = in.next();

            if (Objects.equals(com, "<")){
                finish=x;
                numb=finish-start;
                x=numb/2+start;
                if (x==1){
                    System.out.println("Ваше число "+x);
                    isFind=true;
                }
            }
            else if(Objects.equals(com, ">")){
                start=x;
                numb=finish-start;
                x=finish-numb/2;
                if (x==2147483647){
                    System.out.println("Ваше число "+x);
                    isFind=true;
                }
            }
            else if(Objects.equals(com, "=")){
                System.out.println("Ваше число "+x);
                isFind=true;
            }
            else{
                System.out.println("Ошибка");
            }
            schet++;
        }
        in.close();
        System.out.println(schet+"попыток");
    }
}
