class CFruit {
    int mCnt;
    String mName;

    public CFruit(String pName) {
        mCnt = 10;
        mName = pName;
    }

    public void mBuy(int pCntBuy) {
        mCnt += pCntBuy;
        System.out.println("구매: " + mName + " " + pCntBuy + "개");
    }

    public void mEat(int pCntEat) {
        mCnt -= pCntEat;
        System.out.println("먹음: " + mName + " " + pCntEat + "개");
    }
}
