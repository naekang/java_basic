class Tv {
    // Tv 속성(멤버 변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t; // 메모리에 참조변수 t를 위한 공간이 마련
        t = new Tv(); // Tv클래스의 인스턴스가 메모리의 빈 공간에 생성, 기본값으로 초기화
        t.channel = 7; // 참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7 저장
        t.channelDown(); // 참조변수 t가 참조하는 Tv인스턴스의 channelDown메서드 호출
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
