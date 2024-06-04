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
 *      has esto
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

        boolean a = false;
        a |= false;

        System.out.println(a);
    }
}

