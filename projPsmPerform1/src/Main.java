public class Main {
    public static void main(String[] args) {
        try {
            // 학급 정보 오브젝트 생성
            CClass obj14 = new CClass(1,4,"조현아");
            // 학생 1 정보 오브젝트 생성
            CStudent objtruefalse = new CStudent(obj14,"박상민",13);
            // 학생 2 정보 오브젝트 생성
            CStudent objFriend = new CStudent(obj14, null, 14);
        } catch (Exception e) {
            e.printStackTrace(); // 어디서 오류나는지 알려줌
        }
    }
}