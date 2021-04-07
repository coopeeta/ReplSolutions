package repl141;

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22
    }

    public static int maxValue(int[] myArr) {
        int max = Integer.MIN_VALUE;
        for (int i : myArr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

