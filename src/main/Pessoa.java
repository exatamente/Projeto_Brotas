/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author unifesilva
 */
public class Pessoa {
    Scanner input = new Scanner(System.in);
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    
    Pessoa(){
        System.out.printf("Digite o nome da pessoa:\n");
        this.nome = input.nextLine();
        System.out.printf("Digite a idade da pessoa:\n");
        this.idade = input.nextInt();
        System.out.printf("Digite o peso da pessoa:\n");
        this.peso = input.nextDouble();
        System.out.printf("Digite a altura da pessoa:\n");
        this.peso = input.nextDouble();
        System.out.println(" ");
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

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}