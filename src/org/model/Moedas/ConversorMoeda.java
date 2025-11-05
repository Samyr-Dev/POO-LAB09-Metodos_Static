package org.model.Moedas;

public class ConversorMoeda {
    private static double taxaRealParaDolar = 0.18; // Exemplo: 1 BRL = 0.18 USD
    private static double taxaDolarParaEuro = 0.92; // Exemplo: 1 USD = 0.92 EUR
    private static double taxaRealParaEuro = 0.17;  // Exemplo: 1 BRL = 0.17 EUR

    // Método estático para converter de Real para Dólar
    public static double converterRealParaDolar(double valorEmReais) {
        return valorEmReais * taxaRealParaDolar;
    }

    // Método estático para converter de Dólar para Euro
    public static double converterDolarParaEuro(double valorEmDolares) {
        return valorEmDolares * taxaDolarParaEuro;
    }

    // Método estático para converter de Real para Euro
    public static double converterRealParaEuro(double valorEmReais) {
        return valorEmReais * taxaRealParaEuro;
    }

    // Método estático para atualizar as taxas de câmbio
    public static void atualizarTaxas(double novaTaxaRealParaDolar, double novaTaxaDolarParaEuro, double novaTaxaRealParaEuro) {
        taxaRealParaDolar = novaTaxaRealParaDolar;
        taxaDolarParaEuro = novaTaxaDolarParaEuro;
        taxaRealParaEuro = novaTaxaRealParaEuro;
        System.out.println("Taxas de câmbio atualizadas com sucesso!");
    }

    // Método para exibir as taxas atuais (opcional)
    public static void mostrarTaxasAtuais() {
        System.out.println("=== Taxas de Câmbio Atuais ===");
        System.out.println("1 Real -> " + taxaRealParaDolar + " Dólar");
        System.out.println("1 Dólar -> " + taxaDolarParaEuro + " Euro");
        System.out.println("1 Real -> " + taxaRealParaEuro + " Euro");
    }

}