public class Test2 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        double[] arr = {7.0, -3.5, -10.02, 50.9};

        int rem = num1 % num2;
        double arrAvg = (arr[0] + arr[1] + arr[2] + arr[3]) / 4;
        if (arrAvg > 0 && rem == 5)
            arrAvg *= 100;
        else
            arrAvg /= 100;

        if (num1 == num2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        int avg = (num1 + num2) / 2;
        arr[arr.length - 1] = num1 % 2 == 0 ? num1 : num2;
    }
}
