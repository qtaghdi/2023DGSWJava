public class CStudent extends CClass{
    // 이름
    private String mName;
    // 번호
    private int mNm;
    // 생성자
    public CStudent(CClass pCls, String mName, int mNm) {
        super(pCls); // 부모의 생성자
        this.mName = mName;
        this.mNm = mNm;
        // 생성시 자신의 정보 출력
        this.mShow();
    }

    // 객체에서 접근 가능하도록 함. mShow
    public void mShow() {
        super.mShow();
        System.out.println("학생정보 - 이름 : "+this.mName + " " + this.mNm + "번");
    }
}
