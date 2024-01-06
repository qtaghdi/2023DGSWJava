public interface IShape {
    double mArea(); // 넓이를 계산
    // public abstract가 생략되어 있음.
    static double mDiffer(IShape pObj1, IShape pObj2){
        // static 메서드는 실력 좋은 사람
        // 인터페이스 이름. static 메서드는 오브젝트 없이 바로 쓸 수 있음
        // 인터페이스 이름.메서드() 방식으로 사용.
        return pObj1.mArea() - pObj2.mArea();
    };
    // 두 도형의 차이를 return 한다.
}
