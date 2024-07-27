# O Metodo especial __init__
# Conhecido como Construtor da class
# Chamado automaticamente pelo interpretador quando os abjetos são criados

class Carro: 
    def __init__(self, modelo, ano, cor):
        self.modelo = modelo
        self.ano = ano
        self.cor = cor

carro_do_meu_avo = Carro("Ferrari", 1980, "Vermelha");


