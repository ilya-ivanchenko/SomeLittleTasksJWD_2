package by.epam.JWD.step2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        /* task4 */
        int x = 0;
        int y = -1;
        boolean check = logic.pointBelong(x, y);
        view.showIsTrue(check);

        /* task2 */
        int a = input.inputRandom();
        int b = input.inputRandom();
        int c = input.inputRandom();
        double result = logic.formula(a, b, c);
        view.showResult(result);

        /* task9 */
        int k = 3;
        int[] array1 = input.inputScannerArray();
        view.showArr(array1);
        int[] array2 = input.inputScannerArray();
        view.showArr(array2);
        int[] array3 = logic.putArray(array1, array2, k);
        view.showArr(array3);

        /* task10*/
        int[][] array = input.inputScanner();
        int[][] arrayNew = logic.sortArray(array);
        view.showArrBig(arrayNew);
    }
}
