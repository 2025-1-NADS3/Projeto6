package teste;

import modelo.ContaBancaria;
import modelo.Transacao;
import modelo.TipoTransacao;

import java.io.FileWriter;
import java.io.IOException;

public class SimulacaoCarga {
    public static void main(String[] args) throws IOException {
        ContaBancaria conta = new ContaBancaria("TesteCarga");
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            conta.adicionarTransacao(new Transacao(10.0, TipoTransacao.RECEITA, "Entrada " + i));
        }

        long fim = System.currentTimeMillis();
        long tempoTotal = fim - inicio;

        FileWriter writer = new FileWriter("relatorios/resultado_carga.txt");
        writer.write("Total de transações: 1000\n");
        writer.write("Tempo total (ms): " + tempoTotal + "\n");
        writer.close();
    }
}