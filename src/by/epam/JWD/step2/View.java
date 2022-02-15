package  by.epam.JWD.step2;

class View {

    public void showIsTrue(boolean check) {
        System.out.println(check + "\n");
    }

    public void showResult(double result) {
        System.out.println(result + "\n");
    }

    public void showArr(int arr[]) {
        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public void showArrBig(int arr[][]) {
        for (int matrix[] : arr) {
            System.out.println();
            for (int element : matrix) {
                System.out.print(element + " ");
            }
        }
    }
}