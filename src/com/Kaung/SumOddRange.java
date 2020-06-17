package com.Kaung;

public class SumOddRange {
    public static boolean isOdd (int number){
        if (number > 0){
            if (number % 2 != 0){
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOddNum = 0;
        if (start > 0 && end > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    //System.out.println(i); //print statement သည် test လုပ်ရန်အတွက်သာ
                    sumOddNum += i;
                } else {
                    //ဒီနေရာမှာ return ထည့်ရင် code ကဆက်မသွားတော့ဘူး
                }
            }
            return sumOddNum;
        } else {
            return -1;
        }
    }
}
