public class CClass extends CSchool{
    // 학년
    int mGrade;
    // 반
    private int mClass;
    // 담임
    private String mTeacher;
    // 생성자 1 (학년, 반, 담임)
    public CClass(int mGrade, int mClass, String mTeacher) {
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }
    // 생성자 2
    public CClass(CClass pCls) {
        // this( : 생성자
        this(pCls.mGrade, pCls.mClass, pCls.mTeacher);
    }
    // mShow
    protected void mShow(){
        // 부모의 mShow 호출
        super.mShow();
        // 학급 정보 출력
        System.out.println("학급정보 - " + this.mGrade + "학년" + this.mClass + "반" + " 담임 : " + this.mTeacher);
    }
}
