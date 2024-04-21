import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // В задании было сказано про строку вида: "Вася, возраст 25 лет", где "Вася" - значение переменной name, а 25 - значение переменной age.
        // Не понял - это всего лишь шаблон или нужна такая строка. На всякий случай сделал объект с такой строкой, хотя он далее и не используется.
        // На печать не вывожу, потому что в задании про печать этой стоки не сказано.
        User object = new User();

        Scanner inText = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        System.out.println("Введите имя первого пользователя");
        String nameFirst = inText.nextLine();
        System.out.println("Введите возраст первого пользователя");
        Integer ageFirst = inInt.nextInt();
        System.out.println("Введите имя второго пользователя");
        String nameSecond = inText.nextLine();
        System.out.println("Введите возраст второго пользователя");
        Integer ageSecond = inInt.nextInt();

        User object1 = new User(nameFirst,ageFirst);
        object1.setName(nameFirst);
        object1.setAge(ageFirst);


        User object2 = new User(nameSecond,ageSecond);
        object2.setName(nameSecond);
        object2.setAge(ageSecond);

        if (ageFirst > ageSecond){
            System.out.println(object2.toString());
        } else if (ageFirst < ageSecond) {
            System.out.println(object1.toString());
        // В задании нет оговорки про ситуацию, кода возрасты равны, но без этой ситуации решение имеет не законченный вид.
        } else{
            System.out.println("Ошибка! Возрасты равны");
        }
    }
}
class User{
    private String name;
    private Integer age;

    void setName(String name){
        this.name=name;
    }
    void setAge(Integer age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    Integer getAge(){
        return age;
    }
    public String toString(){
        return String.format(name + ", возраст " + age + " лет");
    }
    User(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    User(){
        name = "Вася";
        age = 25;
    }
}