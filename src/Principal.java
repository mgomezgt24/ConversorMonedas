import java.net.URL;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // https:v6.exchangerate-api.com/v6/cb3821530df6ef4c073c12ec/latest/USD

        int opcion = 0;

        String menu = """
               *************************************************
               Bienvenidos al Conversor de Moneda
                
                1) Dólar            -->     Peso argentino
                2) Peso argentino   -->     Dólar
                3) Dólar            -->     Real brasileño
                4) Real brasileño   -->     Dólar
                5) Dólar            -->     Peso colombiano
                6) Peso colombiano  -->     Dólar
                7) Salir
                Elija una opción válida:
                *************************************************
                """;

        Scanner teclado = new Scanner(System.in);

        double dolarPorPesoArg = 881.77;
        double dolarPorReal = 5.10;
        double dolarPorPesoCol = 3898.20;

        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:         // Dolar --> Peso argentino
                    System.out.println("¿Cuantos Dólares desea convertir a Peso argentino?");
                    double dolar = teclado.nextDouble();
                    double pesoArgentino = dolar * dolarPorPesoArg;
                    System.out.println("El valor " + dolar + " [USD] corresponde al valor final de --> " + pesoArgentino + " [ARS]");
                    break;
                case 2:         // Peso argentino a Dolar
                    System.out.println("¿Cuantos Pesos argentinos desea convertir a Dolar?");
                    pesoArgentino = teclado.nextDouble();
                    dolar = pesoArgentino / dolarPorPesoArg;
                    System.out.println("El valor " + pesoArgentino + " [ARS] corresponde al valor final de --> " + dolar + " [USD]");
                    break;
                case 3:         // Dolar --> Real brasileño
                    System.out.println("¿Cuantos dolares desea convertir a Real brasileño?");
                    dolar = teclado.nextDouble();
                    double realBrasil = dolar * dolarPorReal;
                    System.out.println("El valor " + dolar + " [USD] corresponde al valor final de --> " + realBrasil + " [BRL]");
                    break;
                case 4:         // Real brasileño --> Dolar
                    System.out.println("¿Cuantos Reales brasileños desea convertir a Dolar?");
                    realBrasil = teclado.nextDouble();
                    dolar = realBrasil / dolarPorReal;
                    System.out.println("El valor " + realBrasil + " [BRL] corresponde al valor final de --> " + dolar + " [USD]");
                    break;
                case 5:         // Dolar --> Peso colombiano
                    System.out.println("¿Cuantos dolares desea convertir a Peso colombiano?");
                    dolar = teclado.nextDouble();
                    double pesoColombia = dolar * dolarPorPesoCol;
                    System.out.println("El valor " + dolar + " [USD] corresponde al valor final de --> " + pesoColombia + " [COP]");
                    break;
                case 6:         // Peso colombiano --> Dolar
                    System.out.println("¿Cuantos Pesos colombianos desea convertir a Dolar?");
                    pesoColombia = teclado.nextDouble();
                    dolar = pesoColombia / dolarPorPesoCol;
                    System.out.println("El valor " + pesoColombia + " [COP] corresponde al valor final de --> " + dolar + " [USD]");
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }




    }
}
