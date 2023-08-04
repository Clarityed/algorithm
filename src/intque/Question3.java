package intque;

/**
 * 有 n 个人围成一圈，顺序排号。从第一个人开始报数（从 1 到 3 报数），凡是报到 3 的人退出圈子
 * 问最后留下的是原来第几号的那位？请定义一个方法名为 demo，参数为整数的方法完成。
 *
 * @author: clarity
 * @date: 2023年08月03日 11:33
 */
public class Question3 {

    // 9: 123456789 未去掉报数 3 的人
    // 9: 124578
    // 9: 1257
    // 9: 127
    // 9: 1
    public static void main(String[] args) {
        int n = 10; // 假设有10个人围成一圈
        int lastPerson = demo(n);
        System.out.println("最后留下的是原来第 " + lastPerson + " 号的那位");
    }

    public static int demo(int n) {
        // 创建一个数组表示围成一圈的人
        boolean[] people = new boolean[n];
        for (int i = 0; i < n; i++) {
            people[i] = true; // 初始化所有人都在圈子中
        }

        int count = 0; // 报数计数器
        int index = 0; // 当前报数的人的索引

        while (true) {
            if (people[index]) {
                count++;
                if (count == 3) {
                    people[index] = false; // 报到3的人退出圈子
                    count = 0; // 重置计数器
                }
            }

            // 查找下一个报数的人的索引
            index++;
            if (index == n) {
                index = 0; // 如果到达数组末尾，回到数组开头
            }

            // 判断是否只剩下一个人在圈子中
            int remaining = 0;
            for (boolean person : people) {
                if (person) {
                    remaining++;
                }
            }
            if (remaining == 1) {
                break; // 只剩下一个人，结束循环
            }
        }

        // 找到最后留下的人的索引
        int lastPersonIndex = 0;
        for (int i = 0; i < n; i++) {
            if (people[i]) {
                lastPersonIndex = i;
                break;
            }
        }

        // 计算最后留下的人的原始编号
        int lastPersonNumber = lastPersonIndex + 1;
        return lastPersonNumber;
    }
}
