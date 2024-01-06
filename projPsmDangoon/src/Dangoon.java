public class Dangoon{
    public static void main(String[] args)
    {
        CPeople objHwanwoong = new CPeople(null,null,"환웅",500);

        CPeople objWoonggirl = new CPeople(null, null, "웅녀", 520);

        CPeople objDangoon = new CPeople(objHwanwoong,objWoonggirl,"단군",600);

        CPeople objBiseoGapMother = new CPeople(null,null,"비서갑 어머니", 520);

        CPeople objBiseoGap = new CPeople(null,objBiseoGapMother,"비서갑",620);

        CPeople objBooroo = new CPeople(objDangoon,objBiseoGap,"부루", 700);
        objBooroo.mShow();
        objBooroo.mShowMother();
    }
}