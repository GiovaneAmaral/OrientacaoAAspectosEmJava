/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;


public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000);
        ContaBancaria contaSalario = new ContaSalario(500);
        ContaBancaria contaPoupanca = new ContaPoupanca(2000);
        ContaBancaria contaInvestimento = new ContaInvestimento(3000);

        contaCorrente.sacar(500);       // Saque realizado com sucesso. Saldo atual: 500.0
        contaSalario.sacar(800);        // Saldo insuficiente para o saque de 800.0
        contaPoupanca.sacar(1500);      // Saque realizado com sucesso. Saldo atual: 500.0
        contaInvestimento.sacar(5000);  // Saldo insuficiente para o saque de 5000.0
    }
}
