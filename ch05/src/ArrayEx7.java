public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0]; // numArr[0]의 값을 변수 tmp에 저장
            numArr[0] = numArr[n]; // numArr[n]의 값을 numArr[0]에 저장
            numArr[n] = tmp; // tmp의 값을 numArr[n]에 저장
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
