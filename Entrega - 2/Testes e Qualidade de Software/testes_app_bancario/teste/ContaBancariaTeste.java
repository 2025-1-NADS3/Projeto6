package teste;

import modelo.ContaBancaria;
import modelo.Transacao;
import modelo.TipoTransacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaTeste {

    @Test
    public void testAdicionarTransacao() {
        ContaBancaria conta = new ContaBancaria("Maria");
        Transacao t = new Transacao(100.0, TipoTransacao.RECEITA, "Salário");
        conta.adicionarTransacao(t);
        assertEquals(1, conta.getTransacoes().size());
    }

    @Test
    public void testCalcularSaldoPositivo() {
        ContaBancaria conta = new ContaBancaria("Maria");
        conta.adicionarTransacao(new Transacao(500.0, TipoTransacao.RECEITA, "Bolsa"));
        conta.adicionarTransacao(new Transacao(200.0, TipoTransacao.DESPESA, "Aluguel"));
        assertEquals(300.0, conta.calcularSaldo(), 0.001);
    }

    @Test
    public void testSaldoNegativo() {
        ContaBancaria conta = new ContaBancaria("Maria");
        conta.adicionarTransacao(new Transacao(100.0, TipoTransacao.DESPESA, "Livro"));
        assertEquals(-100.0, conta.calcularSaldo(), 0.001);
    }

    @Test
    public void testSaldoZerado() {
        ContaBancaria conta = new ContaBancaria("Maria");
        assertEquals(0.0, conta.calcularSaldo(), 0.001);
    }
}