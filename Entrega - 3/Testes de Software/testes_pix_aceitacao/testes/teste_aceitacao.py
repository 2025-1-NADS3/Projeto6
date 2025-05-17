import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from codigo_fonte.conta_bancaria import ContaBancaria

def teste_aceitacao_transferencia_pix():
    # cenário
    conta_usuario = ContaBancaria("João", 90.00)
    conta_destino = ContaBancaria("Maria", 10.00)

    # aqui o João vai transferir 50 reais pra Maria
    conta_usuario.transferir_pix(50.00, conta_destino)

    # nessa parte faz a verificação
    assert conta_usuario.saldo == 40.00
    assert conta_destino.saldo == 60.00
    print("✅ Teste de aceitação concluído com sucesso!")

if __name__ == "__main__":
    teste_aceitacao_transferencia_pix()