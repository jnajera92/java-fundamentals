/**
 * operadores de bit
 *
 * '&'	Binario Y Operador copia un poco al resultado si existe en ambos operandos.
 * '|'	Operador Binario O copia un poco si existe en cualquiera de los operandos.
 * '^'	Operador Binario XOR copia el bit si se establece en un operando pero no en ambos.
 * '~'	Operador de Complementos Binarios es unario y tiene el efecto de ‘flipping’ bits.
 * <<	Operador Binario de Cambio Izquierdo. El valor de los operandos izquierdos se mueve a la izquierda por el número de bits especificado por el operando derecho.
 * >>	Operador de Cambio de Derecha Binaria. El valor de los operandos izquierdos se mueve a la derecha por el número de bits especificado por el operando derecho.
 * >>>	Cambiar el operador de llenado cero derecho. El valor de los operandos izquierdos se mueve a la derecha por el número de bits especificado por el operando derecho y los valores desplazados se llenan con ceros.
 *
 */
public class OperadoresBit {

    public static void main (String ... args) {

//        8 | 4 | 2 |1
//                    0 = 0
//                    1 = 1
//                1  0  = 2
//                1  1 = 3
//            1   0  0  = 4
//            1   0  1  = 5
//        1   1   0  0 =  12
//        1   1   1  0 = 14
//        1   1   0  0 = 12

        int a = 12 | 14;
        System.out.println(a);
    }
}