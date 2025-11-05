package org.model.Utilitarios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Classe estática UtilitariosDataHora
public class UtilitariosDataHora {

    // ===================== MÉTODOS DE FORMATAÇÃO ====================== //

    // Formata uma data no padrão informado (ex: "dd/MM/yyyy" ou "yyyy-MM-dd")
    public static String formatarData(LocalDate data, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatter);
    }

    // Formata data e hora no padrão informado (ex: "dd/MM/yyyy HH:mm:ss")
    public static String formatarDataHora(LocalDateTime dataHora, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return dataHora.format(formatter);
    }

    // ===================== MÉTODOS DE CÁLCULO ========================= //

    // Calcula a diferença em dias entre duas datas
    public static long calcularDiferencaEmDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }

    // Calcula a diferença em meses entre duas datas
    public static long calcularDiferencaEmMeses(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.MONTHS.between(dataInicial, dataFinal);
    }

    // Calcula a diferença em anos entre duas datas
    public static long calcularDiferencaEmAnos(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.YEARS.between(dataInicial, dataFinal);
    }

    // ===================== MÉTODOS DE PROPRIEDADES ==================== //

    // Verifica se um ano é bissexto
    public static boolean isAnoBissexto(int ano) {
        return LocalDate.of(ano, 1, 1).isLeapYear();
    }

    // Retorna a data atual formatada
    public static String obterDataAtualFormatada(String padrao) {
        return formatarData(LocalDate.now(), padrao);
    }
}
