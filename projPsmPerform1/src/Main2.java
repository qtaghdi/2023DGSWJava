public class Main2 {
    public static void main(String[] args) {
        try {
            CClass2 objCls2 = new CClass2(1,1,"박상민");
            CStudent2 objCls5 = new CStudent2(objCls2,"ㅂ",13);
        } catch (Exception e) {
            e.printStackTrace(); // 어디서 오류나는지 알려줌
        }
    }
}