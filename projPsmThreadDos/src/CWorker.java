import java.util.ArrayList;
import java.util.List;

public class CWorker {
    String mWorkNm;
    final int MAXJOBCNT=10;
    List<String> mArrJobs = new ArrayList<>();

    public CWorker(String mWorkNm) {
        this.mWorkNm = mWorkNm;
    }
    public void mWork() {
        mArrJobs.add(String.format("job%d",CJobs.mGetJobNum()));
    }

    public void mShow(){
        System.out.println(mWorkNm + ":" + mArrJobs.toString());
    }

}