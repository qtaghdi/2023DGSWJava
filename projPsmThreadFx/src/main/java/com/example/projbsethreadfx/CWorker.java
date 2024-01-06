package com.example.projbsethreadfx;

import com.example.demo.CJobs;

import java.util.ArrayList;
import java.util.List;

public class CWorker {
    String mWorkerNm;

    //CWorker 상수 추가 : MAXJOBCNT = 10
    public final int MAXJOBCNT = 10;
    List<String> mJobHistory = new ArrayList<>();

    public CWorker(String mWorkerNm) {
        this.mWorkerNm = mWorkerNm;
    }
    public void mWork() {
        String lJob = CJobs.mGetJob();
        this.mJobHistory.add(lJob);
    };
}