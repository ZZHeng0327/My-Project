public class calculator2 {
    public static void main(String[] args) {
        double res1 = 0.01 * 100;
        System.out.println("0.01 * 100 = " + res1);

        double res2 = 0;
        for(int i = 0; i < 100; i++){
            res2 += 0.01;
        }
        System.out.println("0.01累加100次 = " + res2);
    }
}

