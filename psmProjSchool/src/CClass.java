public class CClass extends CSchool{
    private int mGrade;
    private int mClass;
    private String mTeacher;

    public CClass(CSchool pSch, int mGrade, int mClass, String mTeacher) {
        super(pSch); // 부모 생성자 호출
//        super(pSch.mNm, 시험에 나옴 => protected = pSch.mNm, private = pSch.getmNm
//                pSch.getmAddr(),
//                pSch.getmBoss(),
//                pSch.getmCnt());
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }

    public CClass(CSchool pSch, CClass pCls){
        super(pSch); // 학교 정보 세팅
        this.mGrade = pCls.mGrade;
        this.mClass = pCls.mClass;
        this.mTeacher = pCls.mTeacher;
    }


    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmClass() {
        return mClass;
    }

    public void setmClass(int mClass) {
        this.mClass = mClass;
    }

    public String getmTeacher() {
        return mTeacher;
    }

    public void setmTeacher(String mTeacher) {
        this.mTeacher = mTeacher;
    }

    public void mShow(){
        // 학교 정보 출력
        super.mShow();
        // 학년,반,담임썜 출력
        System.out.printf("학년 : %d, 반 : %d, 담임 : %s\n",
                this.mGrade,
                this.mClass,
                this.mTeacher);
    }
}
