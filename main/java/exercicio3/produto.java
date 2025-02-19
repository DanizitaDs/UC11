/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class produto {

    String nome;
    int quantidade;

    public produto(String Nome, int quantidade) {
        this.nome = Nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void adicionarQuantidade(int adicao) {
        this.quantidade += adicao;
    }

    public void removerQuantidade(int sub) {
        this.quantidade -= sub;
    }
}
