package problemone;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-2);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        if (number >0 ){
            System.out.println("Number is postive");
        }else if (number < 0){
            System.out.println("Number is negatice");
        }else if (number == 0){
            System.out.println("Nuumber is equal to zero");

        }

    }


}
