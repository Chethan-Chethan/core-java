class MultiplicationTable {
    public static void main(String[] args) {
        for (int number = 3; number <= 9; number += 3) { // 3, 6, 9
            System.out.println("Multiplication Table of " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println(); // blank line between tables
        }
    }
}

