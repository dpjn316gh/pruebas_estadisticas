package generadores.matematica;

import java.util.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 *
* @author Veronica Cortes/ Jazmin Patiño
 */
public class ExpresionMatematicaUnaVariable {

    // Cola de tokens
    private Queue<Token> colaDeTokens;
    
    // Expresión matemática en cadena
    private final String expresionMatematica;
    
    // Valor de la varialbe independiente
    private double valorVariableIndependiente;

    // Expresión regular para extraer un número. Ver http://regexr.com/ y poner (\d+(\.\d+)?)
    private static final Pattern EXPRESION_REGULAR_ENCONTRAR_NUMEROS = Pattern.compile("\\d+(\\.\\d+)?");
    // Expresión regular para extraer un número. Ver http://regexr.com/ y poner (\-?\d+(\.\d+)?)
    private static final Pattern EXPRESION_REGULAR_ENCONTRAR_CARACTE = Pattern.compile("\\p{Alpha}\\w+");

    /**
     * Constructor que acepta una cadena que contiene una expresión matemática
     *
     * @param expresionMatematica
     * @throws Exception
     */
    public ExpresionMatematicaUnaVariable(String expresionMatematica) throws Exception {
        this.expresionMatematica = expresionMatematica;
    }

    /**
     * Evalua un valor x en la expresión matemática
     * @param x
     * @return
     * @throws Exception 
     */
    public double evaluar(double x) throws Exception {
        
        convertirExpresionMatimaticaEnTokens();
        valorVariableIndependiente = x;
        // Se empieza por procesar los elementos con más baja prioridad
        return procesarOperadoresSecundarios();
    }

    /**
     * Procesa las diferentes partes de una expresión matemática
     *
     * @throws Exception
     */
    private void convertirExpresionMatimaticaEnTokens() throws Exception {

        // Crea una cola de tokens
        colaDeTokens = new LinkedList<Token>();

        // Almacena la expresión matemática en un buffer
        StringBuffer bufferExpresionMatematica = new StringBuffer(expresionMatematica);

        // Mientras existan elementos en el buffer, se van extrayendo elementos de la cola
        while (bufferExpresionMatematica.length() > 0) {

            // Se compara la expresión matemática con la expresión regular para encontrar números
            Matcher m = EXPRESION_REGULAR_ENCONTRAR_NUMEROS.matcher(bufferExpresionMatematica);

            // Si encuentra numeros, los almacena en la cola
            if (m.lookingAt()) {
                colaDeTokens.add(new Token(TipoToken.NUMERO, m.group()));
                bufferExpresionMatematica.delete(0, m.end());
                continue;
            }

            // Si encuentra la varialbe independiente, se almacena en la cola
            if (bufferExpresionMatematica.charAt(0) == 'x' || bufferExpresionMatematica.charAt(0) == 'X') {
                colaDeTokens.add(new Token(TipoToken.VARIABLE_INDEPENDIENTE, "x"));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '*') {
                colaDeTokens.add(new Token(TipoToken.MULTIPLICACION));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '/') {
                colaDeTokens.add(new Token(TipoToken.DIVISION));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '+') {
                colaDeTokens.add(new Token(TipoToken.SUMA));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '-') {
                colaDeTokens.add(new Token(TipoToken.RESTA));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '(') {
                colaDeTokens.add(new Token(TipoToken.PARENTESIS_IZQUIERDO));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == ')') {
                colaDeTokens.add(new Token(TipoToken.PARENTESIS_DERECHO));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            if (bufferExpresionMatematica.charAt(0) == '^') {
                colaDeTokens.add(new Token(TipoToken.EXPONENTE));
                bufferExpresionMatematica.deleteCharAt(0);
                continue;
            }

            // Se compara la expresión matemática con la expresión regular para encontrar caracteres. Esto es para encontrar las funciones que existan.
            m = EXPRESION_REGULAR_ENCONTRAR_CARACTE.matcher(bufferExpresionMatematica);

            // Si encuentra caracteres, los almacena en la cola
            if (m.lookingAt()) {
                colaDeTokens.add(new Token(TipoToken.FUNCION_MATEMATICA, m.group()));
                bufferExpresionMatematica.delete(0, m.end());
                continue;
            }

            // Se lanza error al no reconocerse al expresión matemática
            throw new Exception("Elemento no reconocido en la entrada: "
                    + bufferExpresionMatematica.charAt(0));
        }
    }

    /**
     * (Segunda prioridad)
     * Procesa el operador exponente
     *
     * @return
     */
    private double procesarOperadorExponente() throws Exception {
        double resultado = procesarCoeficientesFuncionesParentesis();
        while (!colaDeTokens.isEmpty()) {
            switch (colaDeTokens.element().tipoToken) {
                case EXPONENTE:
                    
                    colaDeTokens.remove();
                    resultado = Math.pow(resultado, procesarCoeficientesFuncionesParentesis());
                    continue;
            }
            break;
        }
        return resultado;
    }
    
    /**
     * (Tercera prioridad)
     * Procesa los operadores con más prioridad. (Multiplicación y División)
     *
     * @return
     */
    private double procesarOperadoresPrimarios() throws Exception {
        double resultado = procesarOperadorExponente();
        while (!colaDeTokens.isEmpty()) {
            switch (colaDeTokens.element().tipoToken) {
                case MULTIPLICACION:
                    
                    colaDeTokens.remove();
                    resultado *= procesarOperadorExponente();
                    continue;
                case DIVISION:
                    
                    colaDeTokens.remove();
                    resultado /= procesarOperadorExponente();
                    continue;
                default:
            }
            break;
        }
        return resultado;
    } 
    
    /**
     * (Cuarta prioridad)
     * Procesa los operadores con prioridad después de la Multiplicación y
     * División. (Suma y Resta)
     *
     * @return
     */
    private double procesarOperadoresSecundarios() throws Exception {
        double resultado = procesarOperadoresPrimarios();
        while (!colaDeTokens.isEmpty()) {
            switch (colaDeTokens.element().tipoToken) {
                case SUMA:
                    
                    colaDeTokens.remove();
                    resultado += procesarOperadoresPrimarios();
                    continue;
                case RESTA:
                    
                    colaDeTokens.remove();
                    resultado -= procesarOperadoresPrimarios();
                    continue;
            }
            break;
        }
        return resultado;
    }

    /**
     * (Primera prioridad)
     * Procesa los coeficientes, las funciones, los parentesis y la variable independiente
     * @return 
     */
    private double procesarCoeficientesFuncionesParentesis() throws Exception {
        Token token;
        try {
            double resultado = 0;
            token = colaDeTokens.poll();
            switch (token.tipoToken) {
                case PARENTESIS_IZQUIERDO:
                    
                    resultado = procesarOperadoresSecundarios();
                    tokenValido(TipoToken.PARENTESIS_DERECHO);
                    return resultado;
                case NUMERO:
                    
                    return Double.parseDouble(token.valor);
                case VARIABLE_INDEPENDIENTE:
                    
                    return valorVariableIndependiente;
                case FUNCION_MATEMATICA:
                    
                    tokenValido(TipoToken.PARENTESIS_IZQUIERDO);
                    double argumento = procesarOperadoresSecundarios();
                    tokenValido(TipoToken.PARENTESIS_DERECHO);
                    Method m = java.lang.Math.class.
                            getMethod(token.valor, Double.TYPE);
                    return (Double) m.invoke(null, argumento);
            }
            return resultado;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            System.out.println("Error: " + ex.getMessage());
            throw new Exception(ex);
        }
        //return 0;
    }

    /**
     * Valida si es el token esperado
     * @param tipoToken
     * @return 
     */
    private boolean tokenValido(TipoToken tipoToken) {
        Token token = colaDeTokens.poll();
        if (token.tipoToken.equals(tipoToken)) {
            return true;
        } else {
            System.out.println("Error: token no válido " + token.valor);
            return false;
        }
    }
}
