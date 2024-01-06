public class CPeople {
    public CPeople mFather; // 아버지 정보
    public CPeople mMother; // 어머니 정보
    protected String mName; // 본인 이름
    private int mLifeSpan; // 본인 수명
    // 생성
    public CPeople(CPeople mFather, CPeople mMother, String mName, int mLifeSpan) {
        this.mFather = mFather;
        this.mMother = mMother;
        this.mName = mName;
        this.mLifeSpan = mLifeSpan;
    }
    public void mHistory(CPeople pCurrent){
        if(pCurrent.mFather!=null) // 아버지 정보가 존재하면
            mHistory(pCurrent.mFather); // 아버지 정보 출력
        // 현 세대 정보 출력
        System.out.print(String.format("부:%s 모:%s, 이름:%s, 수명:%02d\n",
                (pCurrent.mFather==null) ? "":pCurrent.mFather.getmName(), // 아빠 이름 출력
                (pCurrent.mMother==null) ? "":pCurrent.mMother.getmName(), // 엄마 이름 출력
                pCurrent.getmName(), // 자기 이름 출력
                pCurrent.getmLifeSpan())); // 자기 나이 출력
    }
    // getter and setter로 설정
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmLifeSpan() {
        return mLifeSpan;
    }

    public void setmLifeSpan(int mLifeSpan) {
        this.mLifeSpan = mLifeSpan;
    }
}