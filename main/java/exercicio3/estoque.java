/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;
import java.util.ArrayList;
/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class estoque {
     ArrayList<produto> mercado = new ArrayList<>();
    
    
    public produto addProd(String nome, int qntd){
        for(produto prod : mercado){
            if(nome.equals(prod.nome)){
                prod.quantidade += qntd;
            }
        }
        mercado.add(new produto(nome,qntd));
        return null;
    }
    public produto rmProd(String nome, int qntd){
        for(produto prod : mercado){
            if(nome == prod.nome){
                prod.quantidade -= qntd;
                if(prod.quantidade == 0){
                    mercado.remove(prod);
                }
            }
        }
        return null;
    }
    public int consQntd(String nome){
        for(produto prod : mercado){
            if(nome == prod.nome){
                return prod.quantidade;
            }
        }
        return 0; 
    }
    public String prodMoreEst(){
        int maior = 0;
        String nomeDoMaior = "";
        for(produto prod : mercado){
            if (prod.quantidade > maior){
                maior = prod.quantidade;
                nomeDoMaior = prod.nome;
            }
        }
       return nomeDoMaior;
    }

    public ArrayList<produto> limparEst(){
            mercado.clear();
            return mercado;
    
    } 
    
    public int rebastEst(int qntd){
        int qntdRebast = qntd;
        for(produto prod : mercado){
           prod.quantidade += qntdRebast;
        }
        return qntdRebast;
    }
    public String listProd(){
        String vazia = "";
        for(produto prod : mercado){
            vazia += prod.nome + " ";
        }  
         return vazia;
    }
}