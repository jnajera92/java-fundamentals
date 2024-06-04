/**
 * 1. Estructuras Secuenciales
 * Son las más básicas y simplemente
 * siguen el flujo de ejecución desde el principio hasta el final del programa,
 * ejecutando cada sentencia en el orden en que aparecen en el código.
 *
 * int a = 5;  // Asignación
 * int b = a + 10;  // Operación
 * System.out.println(b);  // Impresión en consola
 *------------------------------------------------------------
 * 2. Estructuras de Selección (Decisiones)
 * Permiten tomar decisiones en el código,
 * ejecutando diferentes bloques de código dependiendo de una o más condiciones.
 *
 * If-Else
 *
 * La estructura más común para realizar decisiones.
 * Ejecuta un bloque de código si una condición es verdadera y opcionalmente
 * otro bloque si la condición es falsa.
 *
 * para verificar si la suposición es correcta.
 *
 * seudo codigo:
 *  si (esto se cumple) {
 *      entonces has esto
 *  } de lo contrario {
 *      has esto otro
 *  }
 *
 *  Switch-Case
 *
 * Útil para cuando se tienen múltiples condiciones basadas en el mismo valor de una variable.
 * Funciona bien para menús de opciones y estados predefinidos.
 *
 * swith (variable) {
 *     case valor1:
 *          //accion a realizar
 *          break;
 *     case valor:
 *          //accion a realizar
 *          break;
 * }
 *
 * 3. Estructuras de Repetición (Bucles)
 * Estas estructuras permiten repetir un bloque de código múltiples veces.
 *
 * For
 *
 * Ideal cuando el número de iteraciones es conocido de antemano.
 * Cada iteración aumenta o disminuye un contador y lo compara contra una condición final.
 *
 * for (int i = 0; i < 10; i++) {
 *     System.out.println("Iteración " + i);
 * }
 *
 * seudo codigo
 *
 * para (esta condicion) {
 *     //has esto
 * }
 *
 * While
 *
 * Util cuando el número de iteraciones no es conocido antes del bucle.
 * Continúa mientras la condición sea verdadera.
 *
 * while (condicion) {
 *     // accion
 * }
 *
 * Do-While
 *
 * Similar al bucle while, pero garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa al final.
 *
 * do {
 *     //accion
 * } while (condicion);
 *
 */
public class EstructurasControl {

    public static void main (String ... args) {


        double monina = 80000;
        int tope = 60000;
        if (!( monina <= tope && monina > 0)) {
            System.out.println("cinco es iguasl a 5 ");
        } else if( monina < 0) {
            System.out.println("juan le debes al banco");
        } else {
            System.out.println("tu dinero supera al tope del banco");
        }
        String mes = "febrero";

        //Switch
        switch (mes){
            case "Enero":
            case "febrero":
                System.out.println("este otro mes: "+mes);
                break;
            default:
                System.out.println("no tengo caso para ese mes: "+mes);
        }

        String[] meses = {"Enero", "Febrero", "Marzo"};

        for(int c = 0; c < meses.length; c++) {
            System.out.println(meses[c]);

        }

        int contador = 7;

        while (contador < 9) {
            System.out.println("el contador actual es " + contador);
            contador ++;
        }

        do {
            System.out.println("el contador actual" + contador);
        } while (contador < 9);

        boolean a = false;
        System.out.println(a);
    }
}

