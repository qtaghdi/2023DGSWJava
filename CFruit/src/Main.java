public class Main {
    static CFruit mBanana; // 클래스
    static CFruit mApple; // 클래스
    static CFruit mMango; // 클래스

    public static void main(String[] args) {
        mBanana = new CFruit("바나나"); // 오브젝트 생성
        mApple = new CFruit("사과"); // 오브젝트 생성
        mMango = new CFruit("망고"); // 오브젝트 생성
        mInventory(); // 재고 보여주기

        mBanana.mEat(2); // 바나나 -2
        mInventory(); // 재고 보여주기

        mApple.mEat(3); // 사과 -3
        mInventory(); // 재고 보여주기

        mMango.mBuy(2); // 망고 +2
        mInventory(); // 재고 보여주기

        mMango.mEat(4); // 망고 -4
        mInventory(); // 재고 보여주기

        mApple.mBuy(5); // 사과 +5
        mInventory(); // 재고 보여주기
    }

    public static void mInventory(){ // 재고 설정
        System.out.println("바나나 : "+mBanana.mCnt+" 사과 : "+mApple.mCnt+" 망고 : "+mMango.mCnt);

        // 재고 보여주기
    }
}