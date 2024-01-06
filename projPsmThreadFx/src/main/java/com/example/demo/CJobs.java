package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CJobs {
    static private int mJobNum=0;
    static public List<String> mArrJobsQ = new ArrayList<>();
    static synchronized public String mGetJobNum(String pJobNm){
        mJobNum++;
        String lJobNm = pJobNm+mJobNum;
        mArrJobsQ.add(lJobNm);
        return lJobNm;
    }

    public static synchronized String mGetJob(){
        return mArrJobsQ.remove(0);
    }
}
