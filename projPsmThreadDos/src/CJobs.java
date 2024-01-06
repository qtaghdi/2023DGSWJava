public class CJobs {
    static private int mJobNum=0;
//    클래스 변수 <---> 인스턴스(오브젝트) 변수
    static synchronized public int mGetJobNum(){
        mJobNum++;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return mJobNum;
    }
}
