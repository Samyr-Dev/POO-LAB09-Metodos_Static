package org.model.Calculadora;

public class CalculadoraImpostos {
    public static final double ALIQUOTA_IRRF = 0.15; // 15%
    public static final double ALIQUOTA_ICMS = 0.18; // 18%
    public static final double ALIQUOTA_ISS = 0.05;  // 5%

    // Método estático para calcular IRRF
    public static double calcularIRRF(double valorBase) {
        return valorBase * ALIQUOTA_IRRF;
    }

    // Método estático para calcular ICMS
    public static double calcularICMS(double valorBase) {
        return valorBase * ALIQUOTA_ICMS;
    }

    // Método estático para calcular ISS
    public static double calcularISS(double valorBase) {
        return valorBase * ALIQUOTA_ISS;
    }

    // Método para exibir um resumo dos cálculos
    public static void mostrarResumo(double valorBase) {
        System.out.println("=== Cálculo de Impostos ===");
        System.out.println("Valor base: R$" + valorBase);
        System.out.println("IRRF (15%): R$" + calcularIRRF(valorBase));
        System.out.println("ICMS (18%): R$" + calcularICMS(valorBase));
        System.out.println("ISS (5%): R$" + calcularISS(valorBase));
        System.out.println("Total de impostos: R$" +
                (calcularIRRF(valorBase) + calcularICMS(valorBase) + calcularISS(valorBase)));
    }

}
