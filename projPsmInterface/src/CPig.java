public class CPig implements IAnimal{
    final String mNm = "돼지";
    @Override
    public void mEat() {
        System.out.println(this.mNm+"먹이 : 돼지감자, 지렁이, 도토리");
    }

    @Override
    public void mCry() {
        System.out.println(this.mNm+"소리 : 꿀꿀");
    }
}
