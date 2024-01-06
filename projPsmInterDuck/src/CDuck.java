public class CDuck implements IFly, ISwim{
    String mName;
    public CDuck(String mName) {
        this.mName = mName;
    }
    @Override
    public void mFly() {
        System.out.println(this.mName+" can "+ IFly.mMove);
    }
    @Override
    public void mSwim() {
        System.out.println(this.mName+" can "+ ISwim.mMove);
    }
}
