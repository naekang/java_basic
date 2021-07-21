public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        // 배열의 길이가 n일 때, 첫 번째부터 n-1까지의 요소에 대해 근접한 값과 크기를 비교하여
        // 자리 바꿈을 반복
        for (int i = 0; i < numArr.length; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }

            if (!changed)
                break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
