package Chapter5.prac4;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요 >> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        sc.close();
    }
}

class Km2Mile extends Converter {

    private double mile;
    public Km2Mile(double mile) {
        this.mile = mile;
    }

    @Override
    protected double convert(double src) {
        return (src / mile);
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }

}

public class prac4 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
