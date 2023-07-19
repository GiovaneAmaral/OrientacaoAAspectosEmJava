/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;


public aspect SaldoInsuficienteAspect {

    pointcut saqueOperation() : execution(void ContaBancaria.sacar(double));

    before(double valor) : saqueOperation() {

        if (valor > thisJoinPoint.getThis().getSaldo()) {
            System.out.println("Saldo insuficiente para o saque de " + valor);
        }
    }
}
