/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class Cadastro {

    private String nome;
    private String email;
    private String senha;

    public Cadastro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Valida o nome (n�o pode ser vazio)
    // Primeiro, verifica se o nome n�o � null.
    // Se for null, o resultado j� ser� false.
    //nome.trim() remove os espa�os do in�cio e do fim da string.
    // isEmpty() verifica se a string est� vazia ("").
    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    // Valida o e-mail (deve conter "@" e ".")
    // explica��o:
    // ^[\\w.-]+ ? In�cio da string, permite letras, n�meros, pontos e tra�os antes do @.
    // @[\\w.-]+ ? Obriga o @ seguido por letras, n�meros, pontos ou tra�os.
    // \\.[a-zA-Z]{2,}$ ? Obriga um "." seguido por pelo menos duas letras (como ".com", ".org").
    public static boolean validarEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida a senha (deve ter pelo menos 6 caracteres)
    // Garante que a senha n�o seja null
    // Verifica se a senha tem 6 ou mais caracteres
    // .*[A-Z].* ? Garante que tenha pelo menos uma letra mai�scula (A-Z).
    // .*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].* ? Garante pelo menos um caractere especial.
    public static boolean validarSenha(String senha) {
        // L�gica de valida��o vai aqui
        return senha != null && senha.length() >= 6 && senha.matches(".*[A-Z].*") && senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }
}
