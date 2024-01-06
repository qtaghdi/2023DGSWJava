public class CPeople {
    private CPeople mFather;

    private CPeople mMother;

    private String mMyname;

    private int mLiftSpan;

    public CPeople(CPeople mFather, CPeople mMother, String mMyname, int mLiftSpan) {
        this.mFather = mFather;
        this.mMother = mMother;
        this.mMyname = mMyname;
        this.mLiftSpan = mLiftSpan;
    }

    public void mShow() {

        if (this.mFather != null)
            this.mFather.mShow();

        System.out.printf("아빠 : %s, 엄마 : %s, 내이름 : %s, 수명 : %d\n",
                (this.mFather == null) ? "" : this.mFather.mMyname, // 시험 문제
                (this.mMother == null) ? "" : this.mMother.mMyname,
                this.mMyname,
                this.mLiftSpan);
    }
    public void mShowMother() {

        System.out.printf("아빠 : %s, 엄마 : %s, 내이름 : %s, 수명 : %d\n", // 현재 칸
                (this.mFather == null) ? "" : this.mFather.mMyname, // 시험 문제
                (this.mMother == null) ? "" : this.mMother.mMyname,
                this.mMyname,
                this.mLiftSpan
        );

        if(this.mMother != null) // 조상 칸
        {
            this.mMother.mShowMother();
        }
    }
}

