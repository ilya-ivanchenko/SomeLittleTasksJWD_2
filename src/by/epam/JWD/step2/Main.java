package by.epam.JWD.step2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        /* task4 */
        int x = 0;
        int y = -1;
        view.showIsTrue(logic.pointBelong(x, y));

        /* task2 */
        int a = input.inputRandom();
        int b = input.inputRandom();
        int c = input.inputRandom();
        view.showResult(logic.formula(a, b, c));

        /* task9 */
        int k = 3;
        int[] array1 = input.inputScannerArray();
        view.showArr(array1);
        int[] array2 = input.inputScannerArray();
        view.showArr(array2);
        view.showArr(logic.putArray(array1, array2, k));

        /* task10 */
        view.showArrBig(logic.sortArray(input.inputScanner()));
    }
}
