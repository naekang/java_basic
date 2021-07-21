public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data data) {
        Data tmp = new Data(); // 새로운 객체 tmp 생성
        tmp.x = data.x; // d.x의 값을 tmp.x에 복사

        return tmp; // 복사한 객체의 주소 반환
    }
}
