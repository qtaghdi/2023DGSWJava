public class CTurtle implements IAnimal {
    String mAnNm = "거북이";
    public void CTurtle() {
        this.mEat();
        this.mCry();
    }
    @Override
    public void mEat() {
        System.out.println(this.mAnNm+"먹이 : 물고기");
    }

    @Override
    public void mCry() {
        System.out.println(this.mAnNm+"소리 : 꾸륵");
    }
}
