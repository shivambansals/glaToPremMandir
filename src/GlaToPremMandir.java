import java.util.Scanner;
public class GlaToPremMandir {
    double mileage;
    double autoKaPaisa;
    public void fairOfCarVrsAuto(){
        double carFair = 12/mileage*80 + 12*1;
        System.out.println("Fair of car from gla to prem mandir is" + carFair);
        double autoFair = autoKaPaisa ;
        if (carFair>autoFair){
            System.out.println("I will take the auto because it is cheaper than car by " + (carFair-autoFair) + "rupees");
        }
        else
            System.out.println("I will take my car because it is cheaper than auto by " + (autoFair-carFair) + "rupees");
    }
    public GlaToPremMandir(double mileage,double autoKaPaisa){
        this.mileage=mileage;
        this.autoKaPaisa=autoKaPaisa;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mileage of car is ");
        double m = scanner.nextDouble();
        System.out.println("fair of auto from gla to prem mandir is");
        double a = scanner.nextDouble();
        GlaToPremMandir glaToPremMandir = new GlaToPremMandir(m,a);
        glaToPremMandir.fairOfCarVrsAuto();

    }
}
