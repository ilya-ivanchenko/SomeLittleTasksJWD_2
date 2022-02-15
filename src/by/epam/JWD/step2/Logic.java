package by.epam.JWD.step2;

class Logic {

    /* task4 */
    public boolean pointBelong(int x, int y) {

        /* Разобьем заданную область на две. */
        return ((x >= -4 && x <= 4) && (y >= -3 && y <= 0))
                || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4));
    }

    /* task2 */
    public double formula(int a, int b, int c) {
        double result;
        result = ((Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
        return result;
    }

    /* task9 */
    public int[] putArray(int[] array1, int[] array2, int k) {
        int[] arr3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arr3[i] = array1[i];
        }

        /* копируем элементы из 2-ого массива в 3-ий, вставляя с 4-ого эл. */
        for (int j = 0; j < array2.length; j++) {
            arr3[k++] = array2[j];
        }

        /* копируем элементы из 1-ого массива  в 3-ий, с 4-ого эл. */
        for (int l = k - array2.length; l < array1.length; l++) {
            arr3[k++] = array1[l];
        }
        return arr3;
    }

    /* task10 */
    public int[][] sortArray(int[][] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < arr.length; j++) {
                    arr[i][j] = j + 1;
                }
            } else {
                for (j = 0; j < arr.length; j++) {
                    arr[i][j] = arr.length - j;
                }
            }
        }
        return arr;
    }
}