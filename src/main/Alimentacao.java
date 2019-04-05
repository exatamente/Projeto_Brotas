/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Interface Alimentacao irá implementar em usuário sua alimentação e as devidas recomendações, além de .
 * @author RenanMartins2
 * 
 */
public interface Alimentacao {
    public double calculaCarboidratos();
    public void coletaAlimentos();
    public void recomendacoes(double resultados);
    //public void pegaDados(String nome, String senha, String login);
    
}
