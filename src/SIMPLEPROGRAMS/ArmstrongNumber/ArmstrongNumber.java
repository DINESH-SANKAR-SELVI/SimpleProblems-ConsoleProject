package SIMPLEPROGRAMS.ArmstrongNumber;

public class ArmstrongNumber {
    public int input;

    public ArmstrongNumber(int ip) {
        this.input = ip;
    }

    public boolean armstrongNumber() {
        int output = this.input;
        int input1 = 0;
        int finalPut = 0;
        while (true) {
            if (output > 9) {
                input1 = output % 10;
                output = output / 10;
                input1 = (int) Math.pow(input1, 3);
                finalPut = finalPut + input1;
            } else {
                input1 = output;
                input1 = (int) Math.pow(input1, 3);
                finalPut = finalPut + input1;
                break;
            }
        }
        if (this.input == finalPut) return true;
        else return false;
    }
}