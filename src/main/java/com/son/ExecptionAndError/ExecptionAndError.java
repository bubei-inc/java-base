package com.son.ExecptionAndError;

public class ExecptionAndError {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
