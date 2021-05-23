package com.example.reader;

public class Zakaz {

    private int count[] = new int[5];

    public Zakaz(){
        for(int i = 0; i < 5; i++) count[i] = 0;

    }

    public void setPosAdd(int pos) {
        count[pos]++;
    }

    public void setPosRem(int pos) {
        count[pos]--;
    }

    public int getPos(int pos){
        return count[pos];
    }

    public String code(){
        String result = "";
        for(int i = 0; i < 5 ; i++){
            result += Integer.toString(count[i]);
            result += " ";
        }
        return result;
    }
}
