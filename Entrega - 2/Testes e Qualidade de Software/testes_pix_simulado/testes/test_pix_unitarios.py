
import pytest
from codigo_fonte.conta_bancaria import ContaBancaria

def test_deposito_valido():
    conta = ContaBancaria("João", 100)
    conta.depositar(200)
    assert conta.saldo == 300

def test_deposito_invalido():
    conta = ContaBancaria("Maria", 100)
    with pytest.raises(ValueError):
        conta.depositar(-150)

def test_saque_valido():
    conta = ContaBancaria("Lucas", 500)
    conta.sacar(200)
    assert conta.saldo == 300

def test_saque_invalido():
    conta = ContaBancaria("Ana", 100)
    with pytest.raises(ValueError):
        conta.sacar(150)
