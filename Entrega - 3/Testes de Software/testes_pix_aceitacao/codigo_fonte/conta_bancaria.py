class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.titular = titular
        self.saldo = float(saldo)

    def depositar(self, valor):
        if valor <= 0:
            raise ValueError("O valor do depósito deve ser positivo.")
        self.saldo += valor

    def sacar(self, valor):
        if valor <= 0:
            raise ValueError("O valor do saque deve ser positivo.")
        if valor > self.saldo:
            raise ValueError("Saldo insuficiente.")
        self.saldo -= valor

    def transferir_pix(self, valor, conta_destino):
        if not isinstance(conta_destino, ContaBancaria):
            raise TypeError("A conta de destino precisa ser uma instância de ContaBancaria.")
        if valor <= 0:
            raise ValueError("Valor da transferência deve ser positivo.")
        if valor > self.saldo:
            raise ValueError("Saldo insuficiente para transferência.")
        self.sacar(valor)
        conta_destino.depositar(valor)
        return True  # Importante para o assert funcionar no teste!