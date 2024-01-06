public class CStudent extends CClass{
    private String mStdnt; // 학생 이름
    private int mNum; // 학생 번호
    private String mMBTI; // 학생 mbti

    public CStudent(CSchool pSch, CClass pCls, String mStdnt, int mNum, String mMBTI) {
        super(pSch, pCls);
        this.mStdnt = mStdnt;
        this.mNum = mNum;
        this.mMBTI = mMBTI;
    }
    public CStudent(CSchool pSch, CClass pCls, CStudent pStdt){
        super(pSch,pCls);
        this.mStdnt = pStdt.mStdnt;
        this.mNum = pStdt.mNum;
        this.mMBTI = pStdt.mMBTI;
    }

    public String getmStdnt() {
        return mStdnt;
    }

    public void setmStdnt(String mStdnt) {
        this.mStdnt = mStdnt;
    }

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }

    public String getmMBTI() {
        return mMBTI;
    }

    public void setmMBTI(String mMBTI) {
        this.mMBTI = mMBTI;
    }
    public void mShow(){
        super.mShow();
        System.out.printf("이름 : %s, 번호 : %d, mbti : %s\n",
                this.mStdnt,
                this.mNum,
                this.mMBTI);
    }
}
