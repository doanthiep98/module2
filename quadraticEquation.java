package introductionToJava;

public class quadraticEquation {
    double a,b,c;
    public quadraticEquation(){

    }
    public quadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(double a, double b, double c){
        double delta=b*b-4*a*c;
        if (delta<0){
            System.out.println("Phuong trinh vo nghiem!");
            return -1;
        }
        else
        return delta;
    }
    public double getRoot1(double a, double b, double c){
        double delta=getDiscriminant(a,b,c);
        if (delta>=0){
            double r1=((-b+Math.pow(delta,0.5))/2*a);
            return r1;
        }
        else return 0;
    }
    public double getRoot2(double a, double b, double c){
        double delta=getDiscriminant(a,b,c);
        if (delta>=0){
            double r2=((-b-Math.pow(delta,0.5))/2*a);
            return r2;
        }
        else return 0;
    }
}
