import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Seleccione el cuerpo geométrico con el que desea trabajar:");
            System.out.println("1. Cilindro");
            System.out.println("2. Cono");
            System.	out.println("3. Esfera");
            System.out.println("4. Cubo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Cilindro
                    System.out.print("Ingrese el radio del cilindro: ");
                    double radioCilindro = scanner.nextDouble();
                    System.out.print("Ingrese la altura del cilindro: ");
                    double alturaCilindro = scanner.nextDouble();

                    double areaLateralCilindro = calcularAreaLateralCilindro(radioCilindro, alturaCilindro);
                    double areaTotalCilindro = calcularAreaTotalCilindro(radioCilindro, alturaCilindro);

                    System.out.println("Área Lateral del Cilindro: " + areaLateralCilindro);
                    System.out.println("Área Total del Cilindro: " + areaTotalCilindro);
                    break;
                case 2:
                    // Cono
                    System.out.print("Ingrese el radio del cono: ");
                    double radioCono = scanner.nextDouble();
                    System.out.print("Ingrese la altura del cono: ");
                    double alturaCono = scanner.nextDouble();

                    double areaLateralCono = calcularAreaLateralCono(radioCono, alturaCono);
                    double areaTotalCono = calcularAreaTotalCono(radioCono, alturaCono);

                    System.out.println("Área Lateral del Cono: " + areaLateralCono);
                    System.out.println("Área Total del Cono: " + areaTotalCono);
                    break;
                case 3:
                    // Esfera
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();

                    double areaSuperficieEsfera = calcularAreaSuperficieEsfera(radioEsfera);

                    System.out.println("Área Superficie de la Esfera: " + areaSuperficieEsfera);
                    break;
                case 4:
                    // Cubo
                    System.out.print("Ingrese la longitud de un lado del cubo: ");
                    double ladoCubo = scanner.nextDouble();

                    double areaLateralCubo = calcularAreaLateralCubo(ladoCubo);
                    double areaTotalCubo = calcularAreaTotalCubo(ladoCubo);

                    System.out.println("Área Lateral del Cubo: " + areaLateralCubo);
                    System.out.println("Área Total del Cubo: " + areaTotalCubo);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            attempts++;
        }

        if (attempts >= 3) {
            System.out.println("Se han superado los 3 intentos. Saliendo del programa.");
        }

        scanner.close();
    }

    public static double calcularAreaLateralCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * altura;
    }

    public static double calcularAreaTotalCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public static double calcularAreaLateralCono(double radio, double altura) {
        double slantHeight = Math.sqrt(radio * radio + altura * altura);
        return Math.PI * radio * slantHeight;
    }

    public static double calcularAreaTotalCono(double radio, double altura) {
        double baseArea = Math.PI * radio * radio;
        double lateralArea = calcularAreaLateralCono(radio, altura);
        return baseArea + lateralArea;
    }

    public static double calcularAreaSuperficieEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    public static double calcularAreaLateralCubo(double lado) {
        return 4 * lado * lado;
    }

    public static double calcularAreaTotalCubo(double lado) {
        return 6 * lado * lado;
    }
}
