public class Main {
    static CFruit mBanana;
    static CFruit mApple;
    static CFruit mMango;

    public static void main(String[] args) {
        mBanana = new CFruit("바나나");
        mApple = new CFruit("사과");
        mMango = new CFruit("망고");
        mInventory();

        mBanana.mBuy(3);
        mInventory();

        mApple.mEat(3);
        mInventory();

        mMango.mBuy(2);
        mInventory();

        mMango.mEat(4);
        mInventory();

        mApple.mBuy(5);
        mInventory();
    }

    public static void mInventory() {
        System.out.println("바나나:" + mBanana.mCnt + " 사과:" + mApple.mCnt + " 망고:" + mMango.mCnt);
    }
}
