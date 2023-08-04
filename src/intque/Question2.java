package intque;

/**
 * 懒汉式单例面试
 *
 * @author: clarity
 * @date: 2023年08月03日 11:17
 */
public class Question2 {

    // 构造器私用化，防止被外部进行实例化
    private Question2() {}

    public static Question2 singleton;

    public static Question2 singletonMethod() {
        if (singleton == null) {
            singleton = new Question2();
        }
        return singleton;
    }
}

class Main {

    public static void main(String[] args) {
        Question2 question2 = Question2.singletonMethod();
        Question2 question3 = Question2.singletonMethod();
        System.out.println(question2 == question3);
        System.out.println(question2);
        System.out.println(question3);
    }
}
