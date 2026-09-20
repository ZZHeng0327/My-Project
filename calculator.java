import java.util.Scanner;

public class calculator {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("请输入第一个long整数：");
            long num1 = sc.nextLong();

            System.out.print("请输入运算符(只能输入 + - * / )：");
            char c = sc.next().charAt(0);

            System.out.print("请输入第二个long整数：");
            long num2 = sc.nextLong();
            long result = 0;

            switch(c){
                case '+':
                    result = num1 + num2;
                    System.out.println("运算结果：" + num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("运算结果：" + num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("运算结果：" + num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    if(num2 == 0){
                        System.out.println("错误！除数不能为0，无法执行除法！");
                    }else{
                        result = num1 / num2;
                        System.out.println("运算结果：" + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                default:
                    System.out.println("输入的运算符非法！只能使用 + - * /");
                    break;
            }

            sc.close();
        }
    }
