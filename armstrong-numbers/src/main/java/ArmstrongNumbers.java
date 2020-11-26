class ArmstrongNumbers {
    int temp, digit, length, armstrongNumber = 0;

    boolean isArmstrongNumber(int numberToCheck) {
        length = String.valueOf(numberToCheck).length();
        temp = numberToCheck;
        while (temp > 0) {
            digit = temp % 10;
            temp = temp / 10;
            armstrongNumber = armstrongNumber + (int)Math.pow(digit, length);
        }
        if (armstrongNumber == numberToCheck)return true;
        return false;
    }
}
