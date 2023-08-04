package test;

/**
 * 测试类
 *
 * @author: clarity
 * @date: 2023年06月13日 11:32
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(10%3*2); // 2
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int[][] b = new int[2][]; // 分配长度时从 1 开始，定位数组中的某个值是从 0 开始。
        System.out.println(a[1][1]);
    }
}

class Test2 {
    public static void hello() {
        System.out.println("hello");
    }
}
class MyApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 静态方法的使用不依靠对象，只看类型，在编译时就确定了
        Test2 test = null;
        test.hello();
    }
}

class Test3 {

    public static void main(String[] args) {
        int a = 0;
        boolean isOdd = false;
        for(int i=1;i<=2;++i){
            if(i%2==1)isOdd = true;
            else isOdd = false;
            a+=i*(isOdd?1:-1);
        }
        System.out.println(a);
    }

}

class Test4 {

    public static void main(String[] args) {
        int[] x = new int[25];
        System.out.println(x[24]);
        String s = new String("asdf");
        int $1221 = 1;
        // 综上所述，这个语法的含义是创建一个初始容量为10、启用"快速失败"机制的ArrayList实例。 new List(10, ture);
    }
}

class Test5 {

    public static void main(String[] args) {
        String s1 = "runoob";
        String s2 = "runoob";
        System.out.println("s1 == s2 is:" + s1 == s2);
        System.out.println("s1 == s2 is:" + s1.equals(s2));
    }
}