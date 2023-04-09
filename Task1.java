/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {

    public static double division(int a, int b) {
        if(b == 0) throw new ArithmeticException("Делить на ноль нельзя!");
        else return a/b;
    }

    public static boolean checkName(Person person) {
        boolean nameIsOk = false;
        if(person.name == null) throw new RuntimeException("Нет имени!");
        else {
            nameIsOk = true;
        }
        return nameIsOk;
    }

    public static boolean checkAge(Person person) {
        boolean ageIsOk = false;
        if (person.age < 0) throw new NumberFormatException("Возраст не может быть отрицательным!");
        else {
            ageIsOk = true;
        }
        return ageIsOk;
    }


    public static void main(String[] args) {
        // System.out.println(division(6, 3));
        // System.out.println(division(6, 0));

        // Person first = new Person("Mick", 26);
        // Person second = new Person(null, -36);
        // System.out.println(checkName(first));
        // System.out.println(checkName(second));
        // System.out.println(checkAge(second));
    }
}


