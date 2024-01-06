package com.example.projpsmperform3;

import java.util.ArrayList;
import java.util.List;

public class CServer implements IServer{
    // jobQ 클래스 변수 추가
    public static List<String> mJobQ = new ArrayList<>();
    @Override
    public void mSend(String pJob) {
        // 입려한 작업을 jobQ에 추가
        CServer.mJobQ.add(pJob);
    }

    @Override
    public String mReceive() {
        // 사람에게 일거리 하나 넘겨주기
        if(CServer.mJobQ.size() > 0) {
            return CServer.mJobQ.remove(0);
        }
        else {// 해야할 일 없을땐 공백을 넘겨주기
            return "";
        }
    }
}