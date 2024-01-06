public class CSchool {
    // 학교명 - 클래스 변수
    private static String mSchoolNm = "sw고";
    // 학교주소 - 클래스 변수
    private static String mAddr = "대구시 달성군 구지면";
    // mShow - 자손들이 접근 가능하게 함
    protected void mShow(){
        // 학교정보 - 학교명:? 주소:?
        System.out.println("학교정보 - 학교명교 : "+CSchool.mSchoolNm + " 주소 : "+CSchool.mAddr);
    }
}
