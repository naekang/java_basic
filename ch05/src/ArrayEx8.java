public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열의 각 요소에 1 ~ 45의 값을 저장
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0; // 두 값을 바꾸기 위해 사용할 임시 변수
        int j = 0; // 임의의 값을 얻어서 저장할 변수

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
