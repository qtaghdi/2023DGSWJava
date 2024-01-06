public class CClass2 extends CSchool{
    private int mGrade2;
    private int mClass2;
    private String mTeacher2;

    public CClass2(int mGrade2, int mClass2, String mTeacher2) {
        this.mGrade2 = mGrade2;
        this.mClass2 = mClass2;
        this.mTeacher2 = mTeacher2;
    }
    public CClass2(CClass2 pCls2) {
        this(pCls2.mGrade2, pCls2.mClass2, pCls2.mTeacher2);
    }

    protected void mShow() {
        super.mShow();
        System.out.println("학급정보 - 학년 : "+this.mGrade2 + "반:"+this.mClass2 + "담임:"+this.mTeacher2);
    }
}
