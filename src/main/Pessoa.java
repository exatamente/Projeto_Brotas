/*
 * 
 */
package main;
import java.util.Scanner;
/**
 *
 * Classe onde será criado Pessoa, que será o futuro Usuário do programa.
 * @author unifesilva
 * 
 */
public abstract class Pessoa {
    Scanner input = new Scanner(System.in);
    
    private String nome;
    private String sobrenome;
    private int idade;
    private double peso;
    private double altura;
    
    
    Pessoa(){
        
    }
    
    Pessoa(String nome, int idade){    
        setNome(nome);
        setIdade(idade);
    }
    
    Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    
    
}
