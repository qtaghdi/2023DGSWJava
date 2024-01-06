class CFruit {
    int mCnt; // 과일 개수 값 설정
    String mName; // 과일의 이름을 문자열로 지정하게 해줌

    public CFruit(String mName) { // 생성자
        mCnt = 10; // 과일의 초기값을 10개로 지정 => this로 안한 이유 = this로 하면 Main에서 변수의 값을 설정할 때 번거로움이 있음.
        this.mName = mName; // 과일의 이름을 지정하게 해줌
    }
    public void mBuy(int pCntBuy){ // 구매 값 설정
        mCnt += pCntBuy; // 구매한만큼 과일 총 개수에서 추가하기
        System.out.println("구매:"+mName+" "+pCntBuy+"개"); // 재고 보여주기
    }
    public void mEat(int pCntEat){ // 먹은 값 설정
        mCnt -= pCntEat; // 먹은만큼 과일 총 개수에서 빼기
        System.out.println("먹음:"+mName+" "+pCntEat+"개"); // 재고 보여주기
    }
}
