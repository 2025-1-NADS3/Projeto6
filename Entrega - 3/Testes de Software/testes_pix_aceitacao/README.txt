📌 Nome do Teste: teste_aceitacao.py

📁 Local: testes/teste_aceitacao.py

✅ Objetivo do Teste
O teste de aceitação tem como objetivo verificar se a funcionalidade de transferência Pix entre contas bancárias está funcionando corretamente, de acordo com o comportamento esperado pelo usuário final.

O cenário testado simula um caso real de uso:

- Um usuário chamado João possui R$90,00 em sua conta.
- Ele transfere R$50,00 para Maria.
- Ao final, espera-se que João fique com R$40,00 e Maria com R$60,00.

⚙️ Como Executar o Teste
1. Você precisa estar na raiz do projeto (testes_pix_simulado/).
2. No terminal, execute:
python testes/teste_aceitacao.py

3. Se o teste passar com sucesso, será exibida a mensagem:

✅ Teste de aceitação concluído com sucesso!

📚 Requisitos do Sistema
- Python 3.10 ou superior
- Estrutura de pastas:

testes_pix_simulado/
├── codigo_fonte/
│   └── conta_bancaria.py
├── testes/
│   └── teste_aceitacao.py

🧪 Justificativa
Esse teste garante que a transferência Pix esteja funcionando de forma correta no sistema, conforme os requisitos esperados por um cliente real. Ele valida o comportamento completo de ponta a ponta (transferência de saldo entre contas), garantindo que o sistema esteja pronto para produção.