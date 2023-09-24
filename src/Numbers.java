public class Numbers {

    public static boolean isPalindrome(int number){

        int workNumber = number;
        int temp = 0;

        while (workNumber > 0){
            temp *= 10;
            temp += workNumber % 10;
            workNumber /= 10;
        }

        return temp == number;
    }

    public static int reverseNumber(int number){

        int workNumber = number;
        int temp = 0;

        while (workNumber > 0){
            temp *= 10;
            temp += workNumber % 10;
            workNumber /= 10;
        }

        return temp;
    }

    public static  int getPalindrome(int num){

        int reverse = reverseNumber(num);

        while (num != reverse){
            num = reverse + num;
            reverse = reverseNumber(num);
        }

        return reverse;
    }

    public static int getNumberOfDigits(int num){
        int temp = num;
        int counter = 0;
        while (temp > 0){
            temp /= 10;
            counter++;
        }
        return counter;
    }

    public static int[] toArray(int num){
        num = reverseNumber(num); // 54321
        int numberOfDigits = getNumberOfDigits(num); // 5

        int[] res = new int[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {
            res[i] = num % 10;
            num /= 10;
        }
        return res;
    }
}
