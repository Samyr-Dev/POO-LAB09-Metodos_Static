package org.principal;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.model.Utilitarios.UtilitariosDataHora.*;

public class Main_Utilitarios {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2024, 3, 10);
        LocalDate data2 = LocalDate.of(2025, 11, 4);

        System.out.println("=== TESTES DE FORMATAÇÃO ===");
        System.out.println("Data 1 formatada: " + formatarData(data1, "dd/MM/yyyy"));
        System.out.println("Data e hora atual: " + formatarDataHora(LocalDateTime.now(), "dd/MM/yyyy HH:mm:ss"));
        System.out.println("Data atual (ISO): " + obterDataAtualFormatada("yyyy-MM-dd"));

        System.out.println("\n=== TESTES DE DIFERENÇAS ===");
        System.out.println("Diferença em dias: " + calcularDiferencaEmDias(data1, data2));
        System.out.println("Diferença em meses: " + calcularDiferencaEmMeses(data1, data2));
        System.out.println("Diferença em anos: " + calcularDiferencaEmAnos(data1, data2));

        System.out.println("\n=== TESTES DE PROPRIEDADES ===");
        System.out.println("2024 é bissexto? " + isAnoBissexto(2024));
        System.out.println("2025 é bissexto? " + isAnoBissexto(2025));
    }
}