public class Main {
    public static void main(String[] args){
        CSchool objSchool = new CSchool("dgsw", "구지면","PYH",204);

//      objSchool.mShow();

        CClass objGrade = new CClass(objSchool /*학교 정보*/, 1,4,"조현아");

//        objGrade.mShow();

        CStudent objStudent = new CStudent(objSchool,objGrade, "박상민",13,"ESTP");

//        objStudent.mShow();

        CTaban objTaban = new CTaban(objSchool,objGrade,objStudent, "박소진",06,null);

        CTaban objTaban2 = new CTaban(objSchool,objGrade,objStudent, "이진식",16,null);

        CClass obj13 = new CClass(objSchool, 1, 3, "진주쌤");

        CStudent objjinsik = new CStudent(objSchool,obj13,"이진식",16,"나도몰라");

        objjinsik.mShow();

        objTaban.mShow();
    }
}
