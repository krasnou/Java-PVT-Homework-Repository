package Assignment3;

/**
 * Задача №3. Создайте число. Определите, является ли его последняя цифра семеркой.
 */
public class Assignment3 {
    public static void main (String args[]){
        int number = 357;
        if(number % 10 == 7){
            System.out.println("Ends with 7");
        }else {
            System.out.println("Not 7");
        }
    }
}
