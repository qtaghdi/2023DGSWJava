public class CTaban extends CStudent{
    private String mStName; // 타반 학생 이름
    private int mStNum; // 타반 학생 번호
    private String mStMbti; // 타반 학생 mbti

    public CTaban(CSchool pSch, CClass pCls, CStudent pStdt,String mStName, int mStNum, String mStMbti) {
        super(pSch, pCls, pStdt);
        this.mStName = mStName;
        this.mStNum = mStNum;
        this.mStMbti = mStMbti;
    }

    public String getmStName() {
        return mStName;
    }

    public void setmStName(String mStName) {
        this.mStName = mStName;
    }

    public int getmStNum() {
        return mStNum;
    }

    public void setmStNum(int mStNum) {
        this.mStNum = mStNum;
    }

    public String getmStMbti() {
        return mStMbti;
    }

    public void setmStMbti(String mStMbti) {
        this.mStMbti = mStMbti;
    }

    public void mShow(){
        super.mShow();
        System.out.printf("타반 학생 이름 : %s, 타반 학생 번호 : %d, 타반 학생 mbti : %s\n",
                this.mStName,
                this.mStNum,
                this.mStMbti);
    }
}
