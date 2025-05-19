
from codigo_fonte.conta_bancaria import ContaBancaria

def test_transferencia_pix_valida():
    origem = ContaBancaria("Carlos", 1000)
    destino = ContaBancaria("Bruna", 300)
    origem.transferir_pix(500, destino)
    assert origem.saldo == 500
    assert destino.saldo == 800

def test_transferencia_pix_invalida_saldo_insuficiente():
    origem = ContaBancaria("Tiago", 100)
    destino = ContaBancaria("Lara", 200)
    try:
        origem.transferir_pix(300, destino)
    except ValueError as e:
        assert str(e) == "Saldo insuficiente para transferência."
        assert origem.saldo == 100
        assert destino.saldo == 200