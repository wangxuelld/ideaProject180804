package com.gzjr.control;

public class T {
    public static final int s=1;

    public static void main(String[] args) {
        p();

    }

    private static void p() {
        System.out.println("1111111111");
        StringBuffer sb = new StringBuffer();
        sb.append(1);
        System.out.println(sb.toString());
    }

    public void print(){
        try {
            StringBuffer sbttr = new StringBuffer();
            sbttr.append(1);
            sbttr.append('c');
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
