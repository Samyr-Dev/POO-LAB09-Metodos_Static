package org.principal;

import static org.model.Gerenciador.GerenciadorLog.*;

public class Main_Gerenciador {
    public static void main(String[] args) {
        logInfo("Aplicação iniciada.");
        logWarn("Uso de memória acima do esperado.");
        logError("Falha ao conectar ao banco de dados.");

        // Alterando destino para arquivo
        setDestino(DestinoLog.ARQUIVO);

        // Teste: logs gravados no arquivo
        logInfo("Log gravado em arquivo com sucesso.");
        logError("Erro simulado gravado no arquivo de log.");
    }
}
