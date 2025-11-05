package org.model.Gerenciador;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Classe estática GerenciadorLog
public class GerenciadorLog {

    // Destinos possíveis de log
    public enum DestinoLog {
        CONSOLE,
        ARQUIVO
    }

    // Atributo estático que define o destino atual do log (padrão: console)
    private static DestinoLog destinoAtual = DestinoLog.CONSOLE;

    // Caminho padrão do arquivo de log
    private static final String CAMINHO_ARQUIVO_LOG = "aplicacao.log";

    // Formato de data/hora para os logs
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // ========================= MÉTODOS DE LOG ============================= //

    public static void logInfo(String mensagem) {
        registrarLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        registrarLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        registrarLog("ERROR", mensagem);
    }

    // ========================= MÉTODOS INTERNOS =========================== //

    // Define o destino do log
    public static void setDestino(DestinoLog destino) {
        destinoAtual = destino;
        System.out.println("Destino de log alterado para: " + destino);
    }

    // Método central para registrar uma mensagem de log
    private static void registrarLog(String nivel, String mensagem) {
        String dataHora = LocalDateTime.now().format(FORMATADOR);
        String logCompleto = String.format("[%s] [%s] %s", dataHora, nivel, mensagem);

        if (destinoAtual == DestinoLog.CONSOLE) {
            System.out.println(logCompleto);
        } else {
            escreverNoArquivo(logCompleto);
        }
    }

    // Método para escrever no arquivo de log
    private static void escreverNoArquivo(String mensagem) {
        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO_LOG, true)) {
            writer.write(mensagem + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}