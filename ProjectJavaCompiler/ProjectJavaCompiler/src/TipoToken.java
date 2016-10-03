/* Cont�m uma matriz usada para identifica��o dos token
 * sendo que esta matriz foi criada baseada no n�mero de identifica��o
 * do token (vide AnalisadorLexicoConstants.java)
 */
public interface TipoToken {
	String[] nomeToken = { "<EOF>", "\" \"", "\"\\r\"", "\"\\t\"", "\"\\n\"",
			"\"INICIO_PROG\"", "\"INTEIRO\"", "\"FLUTUANTE\"", "\"STRING\"",
			"\"IF\"", "\"THEN\"", "\"ELSE\"", "\"FOR\"", "\"TO\"", "<NUMERO>",
			"<DIGITO>", "\"DELIMITADOR_ESQ\"", "\"DELIMITADOR_DIR\"",
			"\"SOMA\"", "\"SUBTRACAO\"", "\"MULTIPLICACAO\"", "\"DIVISAO\"",
			"\"ATRIBUICAO\"", "\"MAIOR\"", "\"MENOR\"", "\"MENOR_IGUAL\"",
			"\"MAIOR_IGUAL\"", "\"DIFERENTE\"", "\"IGUAL\"", "<ID>",
			"\"\\DILIMITAR_VARCHAR\"", "\"PONTO_VIRG", "\"(\"", "\")\"", };

}
