package teste;

import modelo.ContaBancaria;
import modelo.Transacao;
import modelo.TipoTransacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransacaoIntegracaoTeste {

    @Test
    public void testTransacaoAtualizaSaldo() {
        ContaBancaria conta = new ContaBancaria("João");
        conta.adicionarTransacao(new Transacao(300.0, TipoTransacao.RECEITA, "Trabalho"));
        assertEquals(300.0, conta.calcularSaldo(), 0.001);
    }

    @Test
    public void testMultiplasTransacoes() {
        ContaBancaria conta = new ContaBancaria("João");
        conta.adicionarTransacao(new Transacao(500.0, TipoTransacao.RECEITA, "Freelancer"));
        conta.adicionarTransacao(new Transacao(100.0, TipoTransacao.DESPESA, "Comida"));
        conta.adicionarTransacao(new Transacao(150.0, TipoTransacao.DESPESA, "Transporte"));
        assertEquals(250.0, conta.calcularSaldo(), 0.001);
    }
}