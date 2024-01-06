public class CPeople {
    private String iLoveDangoon; // 이름
    private int myAge; // 나이

    // 생성자 - 제일 처음 실행되는 메서드
    // 생성자 명 = 클래스 명
    public CPeople(String iLoveDangoon, int myAge) {
        this.iLoveDangoon = iLoveDangoon;
        this.myAge = myAge;
    }

    public String getiLoveDangoon() {
        return iLoveDangoon;
    }

    public void setiLoveDangoon(String iLoveDangoon) {
        this.iLoveDangoon = iLoveDangoon;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void mShow(){
        System.out.println(String.format("이름 : %s, 나이 : %d",
                this.iLoveDangoon,
                this.myAge));
    }
}