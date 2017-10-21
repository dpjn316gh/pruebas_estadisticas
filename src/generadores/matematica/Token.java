package generadores.matematica;

import generadores.matematica.TipoToken;

/**
 *
* @author Veronica Cortes/ Jazmin Patiño
 */
public class Token {

    public TipoToken tipoToken;
    public String valor;

    public Token(TipoToken tipoToken, String valor) {
        this.tipoToken = tipoToken;
        this.valor = valor;
    }

    public Token(TipoToken tipoToken) {
        this.tipoToken = tipoToken;
    }
}
