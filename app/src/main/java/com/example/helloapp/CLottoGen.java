package com.example.helloapp;

import java.util.ArrayList;

public class CLottoGen {
    public String GetLotto(){

        ArrayList<Integer> list = new ArrayList<>();

        //把1~49加進去list裡面
        for(int i =1 ; i<50 ; i++){
            list.add(Integer.valueOf(i));
        }


        //取六個號碼
        int[] nums = new int[6];
        for(int i = 0 ; i <6 ;i++){
            int index =(int)(Math.random()*list.size());
            nums[i] = Integer.valueOf(list.get(index));
            list.remove(index);
        }
        String s = "";
        for(int i  : nums ){
          s += String.valueOf(i)+" ";
        }
        return s;
    }

}
