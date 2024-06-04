/**
 * Operador	Descripción
 * '=='	Igual a – Comprueba si los valores de dos operandos son iguales o no, en caso afirmativo, la condición se vuelve verdadera.
 * '!='	No es igual a – Comprueba si los valores de dos operandos son iguales o no, si los valores no son iguales, entonces la condición se vuelve verdadera.
 * '>'	Mayor que – Comprueba si el valor del operando izquierdo es mayor que el valor del operando derecho, en caso afirmativo, la condición se vuelve verdadera.
 * '<'	Menos que – Comprueba si el valor del operando izquierdo es menor que el valor del operando derecho, en caso afirmativo, la condición se vuelve verdadera.
 * '>='	Mayor o igual a – Comprueba si el valor del operando izquierdo es mayor o igual al valor del operando derecho, si es así, la condición se vuelve verdadera.
 * '<='	Menos o igual a – Comprueba si el valor del operando izquierdo es menor o igual al valor del operando derecho, si es así, la condición se vuelve verdadera.
 */

/**
 * '!'	(NOT) devuelve verdadero si el operando es falso, y falso si el operando es verdadero.
 * '&&'	(AND) devuelve verdadero si ambos operandos son verdaderos. Si cualquiera de los operandos es falso, devuelve falso.
 * '||'	(OR) devuelve true si cualquiera de los operandos es true. Si ambos operandos son falsos, devuelve falso.
 * '^'	(XOR) devuelve verdadero si uno de los operandos es verdadero, pero no ambos. Si ambos operandos son iguales, devuelve falso.
 */

/**
 * Las compuertas lógicas son componentes básicos de los circuitos digitales,
 * usados en computadoras y otros dispositivos electrónicos para realizar operaciones lógicas en una o más señales binarias de entrada
 * para producir una única salida. Cada tipo de compuerta tiene una función lógica específica, determinada
 * por una tabla de verdad que establece la relación entre las entradas y la salida.
 *
 * 1. Compuerta AND
 * Operación: Devuelve un valor alto (1) solo si todas sus entradas son altas (1).
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A AND B
 * ---|---|--------
 * 0 | 0 |   0
 * 0 | 1 |   0
 * 1 | 0 |   0
 * 1 | 1 |   1
 * 2. Compuerta OR
 * Operación: Devuelve un valor alto (1) si alguna de sus entradas es alta (1).
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A OR B
 * ---|---|-------
 * 0 | 0 |   0
 * 0 | 1 |   1
 * 1 | 0 |   1
 * 1 | 1 |   1
 * 3. Compuerta NOT (Inversor)
 * Operación: Invierte la entrada; si la entrada es alta (1), la salida será baja (0), y viceversa.
 * Tabla de verdad:
 * css
 * Copiar código
 * A | NOT A
 * ---|------
 * 0 |   1
 * 1 |   0
 * 4. Compuerta NAND
 * Operación: Devuelve un valor bajo (0) solo si todas sus entradas son altas (1). Es el inverso de la compuerta AND.
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A NAND B
 * ---|---|---------
 * 0 | 0 |   1
 * 0 | 1 |   1
 * 1 | 0 |   1
 * 1 | 1 |   0
 * 5. Compuerta NOR
 * Operación: Devuelve un valor bajo (0) si alguna de sus entradas es alta (1). Es el inverso de la compuerta OR.
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A NOR B
 * ---|---|--------
 * 0 | 0 |   1
 * 0 | 1 |   0
 * 1 | 0 |   0
 * 1 | 1 |   0
 * 6. Compuerta XOR (OR exclusivo)
 * Operación: Devuelve un valor alto (1) solo si las entradas son diferentes.
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A XOR B
 * ---|---|--------
 * 0 | 0 |   0
 * 0 | 1 |   1
 * 1 | 0 |   1
 * 1 | 1 |   0
 * 7. Compuerta XNOR (NOR exclusivo)
 * Operación: Devuelve un valor alto (1) solo si las entradas son iguales. Es el inverso de la compuerta XOR.
 * Tabla de verdad:
 * css
 * Copiar código
 * A | B | A XNOR B
 * ---|---|---------
 * 0 | 0 |   1
 * 0 | 1 |   0
 * 1 | 0 |   0
 * 1 | 1 |   1
 */

/**
 * 1. Compuerta AND y Operador AND (&&)
 * Compuerta AND: Produce una salida alta (1) sólo si todas sus entradas son altas (1).
 * Operador AND: Devuelve true sólo si todos los operandos son true.
 * 2. Compuerta OR y Operador OR (||)
 * Compuerta OR: Produce una salida alta (1) si al menos una de sus entradas es alta (1).
 * Operador OR: Devuelve true si al menos uno de los operandos es true.
 * 3. Compuerta NOT e Operador NOT (!)
 * Compuerta NOT: Invierte el estado de su entrada; si la entrada es alta (1), la salida será baja (0), y viceversa.
 * Operador NOT: Invierte el valor booleano; si el operando es true, devuelve false, y viceversa.
 * 4. Compuerta XOR y Operador XOR (^)
 * Compuerta XOR: Produce una salida alta (1) sólo si las entradas son diferentes.
 * Operador XOR: En programación, devuelve true si los operandos son diferentes (es decir, uno es true y el otro false).
 * 5. Compuertas NAND, NOR, XNOR y sus equivalentes lógicos
 * Compuerta NAND: Inverso de la AND. No tiene un operador directo en la mayoría de los lenguajes de programación, pero se puede simular con !(A && B).
 * Compuerta NOR: Inverso de la OR. Similarmente, se puede simular con !(A || B).
 * Compuerta XNOR: Inverso de la XOR. Se simula con !(A ^ B) o (A && B) || (!A && !B).
 */
public class OperadoresRelacionales {

    public static void main(String ... args) {
        boolean a = true ^ false;

        System.out.println(a);
    }
}
