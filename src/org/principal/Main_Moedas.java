package org.principal;


import static org.model.Moedas.ConversorMoeda.*;

public class Main_Moedas {
    public static void main(String[] args) {
        mostrarTaxasAtuais();

        double valorReais = 1000.0;
        double valorDolares = converterRealParaDolar(valorReais);
        double valorEuros = converterRealParaEuro(valorReais);

        System.out.println("\nConvertendo R$" + valorReais + ":");
        System.out.println("Em Dólares: $" + valorDolares);
        System.out.println("Em Euros: €" + valorEuros);

        // Atualizando as taxas de câmbio
        atualizarTaxas(0.20, 0.95, 0.19);

        mostrarTaxasAtuais();

        // Nova conversão com as taxas atualizadas
        valorDolares = converterRealParaDolar(valorReais);
        valorEuros = converterRealParaEuro(valorReais);

        System.out.println("\nApós atualização das taxas:");
        System.out.println("R$" + valorReais + " = $" + valorDolares + " = €" + valorEuros);
    }
}
