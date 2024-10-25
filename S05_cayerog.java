import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int puntos = 0;
        int numeroalumno= 0;
        int numerointroducido = 0;
        int numerohermano= 0;
        Scanner scanner = new Scanner(System.in);
        Boolean valorcorrecto= false;
        boolean valorcorrectohermano= false;

        while(!valorcorrecto) {
            System.out.println("Numero de orden de inscripcion: ");
            if (scanner.hasNextInt()) {
                numerointroducido = scanner.nextInt();

                if (numerointroducido > 0 && numerointroducido < 500) {
                    numeroalumno = numerointroducido;
                    valorcorrecto=true;

                } else {
                    System.out.println("el numero "+numerointroducido+" es erroneo introduzca un numero correcto");
                }
            }else {
                System.out.println("Introduzca un numero de entero ");
            }
        }





        System.out.println("¿ tienes algun hermano en el centro? (0: no / 1:si) ");
        if (scanner.nextInt() == 1) {
            while(!valorcorrectohermano) {
                System.out.println("Introduzca numero de orden de inscripcion de su hermano: ");
                if (scanner.hasNextInt()) {
                    numerohermano = scanner.nextInt();

                    if (numerohermano > 0 && numerohermano < 500 && numerohermano!= numeroalumno) {
                        valorcorrectohermano=true;
                    } else {
                        System.out.println("el numero "+numerohermano +" es erroneo introduzca un numero correcto");
                    }
                }else {
                    System.out.println("Introduzca un numero de entero ");
                }
            }
            if(valorcorrectohermano) {
                puntos += 40;
            }
        }

        System.out.println("¿Vives en la misma poblacion? (0: no / 1:si) ");
        if (scanner.nextInt() == 1) {
            puntos += 30;
        }else{ System.out.println("¿tus padres trabajan en la misma poblacion ? (0: no / 1:si) ");
            if (scanner.nextInt() == 1) {
                puntos += 20;
            }

        }

        System.out.println("¿ Dispacidad igual o supeior al 33% o enfermedad cronica ? (0: no / 1:si) ");
        if (scanner.nextInt() == 1) {
            puntos += 10;
        }

        System.out.println("¿familia numerosa o monoparental ? (0: no / 1:si) ");
        if (scanner.nextInt() == 1) {
            puntos += 15;
        }


        System.out.println("¿escolarizado padre, madre o germano? (0: no / 1:si) ");
        if (scanner.nextInt() == 1) {
            puntos += 5;
        }


        System.out.println("el alumno : " +numeroalumno+ " tiene un total de : "+puntos);
        scanner.close();
    }
}
