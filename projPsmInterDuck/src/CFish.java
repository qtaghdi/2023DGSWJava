public class CFish implements ISwim{
    String mName; // 오브젝트 이름

    public CFish(String mName) {
        this.mName = mName;
    }

    @Override
    public void mSwim() {
        System.out.println(this.mName+ " can " + ISwim.mMove);
    }
}
