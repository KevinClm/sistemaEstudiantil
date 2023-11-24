import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Trabajo en clase sistema de estudiantes");
        //Scanner
        Scanner input = new Scanner(System.in);
        Estudiantes estudiante1 = new Estudiantes("Kevin", "Coloma", "POO");
        System.out.println("Ingrese la nota del primer bimestre: ");
        estudiante1.setNota1(input.nextDouble());
        System.out.println("Ingrese la nota del segundo bimestre: ");
    }
}