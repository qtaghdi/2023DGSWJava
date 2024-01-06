public class CFruit {
    private String mName; // 과일 이름
    private int mCnt; // 괴일 개수

    // 생성자 - 제일 처음 실행되는 메서드
    // 생성자 명 = 클래스 명
    public CFruit(String mName, int mCnt) {
        this.mName = mName;
        this.mCnt = mCnt;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }

    public void mShow(){
        System.out.println(String.format("과일이름 : %s, 과일개수 : %d",
                this.mName,
                this.mCnt));
    }
    public void mBuy(int pCnt){
        this.mCnt = this.mCnt + pCnt;
        this.mShow();
    }
    public void mEat(int pCnt){
        this.mCnt = this.mCnt - pCnt;
        this.mShow();
    }
}