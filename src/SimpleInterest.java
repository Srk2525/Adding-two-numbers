import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Principle:");
        float p = sc.nextFloat();

        System.out.println("enter rate of Interest:");
        float r = sc.nextFloat();

        System.out.println("enter time:");
        float t = sc.nextFloat();

        float s1 = (p*r*t)/100;

        System.out.println("principle :" + p);
        System.out.println("rate : " + r);
        System.out.println("time :" +t);

        System.out.println("Simple interest is :" + s1);

    }
}
