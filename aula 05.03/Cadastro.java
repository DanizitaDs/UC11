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

    // Valida o nome (não pode ser vazio)
    // Primeiro, verifica se o nome não é null.
    // Se for null, o resultado já será false.
    //nome.trim() remove os espaços do início e do fim da string.
    // isEmpty() verifica se a string está vazia ("").
    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    // Valida o e-mail (deve conter "@" e ".")
    // explicação:
    // ^[\\w.-]+ ? Início da string, permite letras, números, pontos e traços antes do @.
    // @[\\w.-]+ ? Obriga o @ seguido por letras, números, pontos ou traços.
    // \\.[a-zA-Z]{2,}$ ? Obriga um "." seguido por pelo menos duas letras (como ".com", ".org").
    public static boolean validarEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida a senha (deve ter pelo menos 6 caracteres)
    // Garante que a senha não seja null
    // Verifica se a senha tem 6 ou mais caracteres
    // .*[A-Z].* ? Garante que tenha pelo menos uma letra maiúscula (A-Z).
    // .*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].* ? Garante pelo menos um caractere especial.
    public static boolean validarSenha(String senha) {
        // Lógica de validação vai aqui
        return senha != null && senha.length() >= 6 && senha.matches(".*[A-Z].*") && senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }
}
