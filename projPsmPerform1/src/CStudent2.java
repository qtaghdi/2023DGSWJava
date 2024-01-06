public class CStudent2 extends CClass2{
    private String mName2;
    private int mNum2;

    public CStudent2(CClass2 pCls2, String mName2, int mNum2) {
        super(pCls2);
        this.mName2 = mName2;
        this.mNum2 = mNum2;
        this.mShow();
    }

    protected void mShow() {
        super.mShow();
        System.out.println("학생 정보 -"+this.mName2+"번호:"+this.mNum2);
    }
}
