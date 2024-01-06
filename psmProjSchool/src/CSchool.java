public class CSchool {
    protected String mNm; // 학교명
    private String mAddr; // 학교주소
    private String mBoss; // 교장 이름
    private int mCnt; // 학생 수

    public CSchool(String mNm, String mAddr, String mBoss, int mCnt) { // 생성자는 클래스명과 같음, void X
        this.mNm = mNm;
        this.mAddr = mAddr;
        this.mBoss = mBoss;
        this.mCnt = mCnt;
    }
    public CSchool(CSchool pSch){
        this.mNm = pSch.mNm;
        this.mAddr = pSch.mAddr;
        this.mBoss = pSch.mBoss;
        this.mCnt = pSch.mCnt;
    }
    public String getmNm() {
        return mNm;
    }

    public void setmNm(String mNm) {
        this.mNm = mNm;
    }

    public String getmAddr() {
        return mAddr;
    }

    public void setmAddr(String mAddr) {
        this.mAddr = mAddr;
    }

    public String getmBoss() {
        return mBoss;
    }

    public void setmBoss(String mBoss) {
        this.mBoss = mBoss;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }

    public void mShow(){
        System.out.printf("학교명 : %s, 주소 : %s, 교장선생님 : %s, 학생수 : %d\n",
                this.mNm,
                this.mAddr,
                this.mBoss,
                this.mCnt);
    }
}
