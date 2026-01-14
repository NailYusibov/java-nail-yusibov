package org.example.chapter01.task01;

public class PrimeNumber {
    public boolean PrimeNum(int number) {
        if (number == 2) {
            return true;
        }
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        int stopnum = (int) Math.sqrt(number);
        for(int divide = 3;divide <= stopnum;divide += 2){
            if(number % divide == 0){
                return false;
            }
        }
        return true;
    }
}
