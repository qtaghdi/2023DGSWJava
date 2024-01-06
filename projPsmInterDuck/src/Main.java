public class Main {
    public static void main(String[] args) {
        CBird objEagle = new CBird("독수리");
        objEagle.mFly();

        CBird objkiwi = new CBird("키위");
        objkiwi.mFly();

        CFish objGodeungae = new CFish("고등어");
        objGodeungae.mSwim();

        CFish objGaeBokChi = new CFish("개복치");
        objGaeBokChi.mSwim();

        CDuck objGorapaduck = new CDuck("고라파덕");
        objGorapaduck.mFly();
        objGorapaduck.mSwim();
    }
}