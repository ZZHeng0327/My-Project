public class calculator3 {public static void main(String[] args) {
    float r1 = 0.01F * 100F;
    System.out.println("0.01F * 100F = " + r1);

    float r2 = 0F;
    for(int i=0;i<100;i++){
        r2 += 0.01F;
    }
    System.out.println("0.01F累加100次 = " + r2);
}
}
