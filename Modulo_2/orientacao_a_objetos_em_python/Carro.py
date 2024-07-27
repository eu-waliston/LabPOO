class Carro:
    pass

meu_carro = Carro()

meu_carro.ano = 1968
meu_carro.modelo = "Fusca"
meu_carro.cor = "Preto"

novo_carro = meu_carro;
novo_carro.modelo = "Brasilia"
novo_carro.ano = 2050

print("\n")
print("Ano: " + str(meu_carro.ano) + ", Modelo: " + meu_carro.modelo + " Cor: " + meu_carro.cor)
print("\n")

