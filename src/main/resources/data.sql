insert into MARCA(id_marca, nome)
values (1, 'Chevrolet'), (2, 'Fiat'), (3, 'Toyota'), (4, 'Volkswagen'), (5, 'Honda'), (6, 'Volvo'), (7, 'Cherry'), (8, 'BMW');

insert into MODELO(ID_MODELO, NOME, ID_MARCA)
values (1, 'Celta', 1), (2, 'S10', 1), (3, 'Onix', 1), (4, 'Blazer', 1),
       (5, 'Palio', 2), (6, 'Punto', 2), (7, 'Toro', 2), (8, 'Siena', 2),
       (9, 'Hylux', 3), (10, 'Corola', 3), (11, 'Yaris', 3), (12, 'RAV4', 3),
       (13, 'Polo', 4), (14, 'Jetta', 4), (15, 'Nivus', 4), (16, 'Gol', 4),
       (17, 'Civic', 5), (18, 'CR-V', 5), (19, 'HR-V', 5), (20, 'Fit', 5),
       (21, 'XC60', 6), (22, 'XC40', 6), (23, 'XC90', 6), (24, 'S60', 6),
       (25, 'Tiggo 8', 7), (26, 'Arrizo 5', 7), (27, 'Tiggo 2', 7), (28, 'Tiggo 3X', 7),
       (29, 'X5', 8), (30, 'X7', 8), (31, 'X4', 8), (32, 'X6', 8);

insert into CATEGORIA(ID_CATEGORIA, DESCRICAO, SIGLA)
values (1, 'Hatch', 'HC'), (2, 'Sedan', 'SD'), (3, 'Picape', 'PP'), (4, 'SUV', 'SUV');

insert into GARAGEM(ID_GARAGEM)
values (1), (2), (3);

insert into VEICULO(ID_VEICULO, PLACA, ID_CATEGORIA, ID_MODELO, ID_GARAGEM)
values (1, 'HRH4963', 1, 1, 1), (2, 'HPB6924', 1, 5, 1), (3, 'LWR8493', 1, 6, 1), (4, 'MDA1343', 1, 16, 1),
       (5, 'MUE7109', 2, 17, 2), (6, 'MMP1931', 2, 8, 2), (7, 'LVS2832', 2, 14, 2), (8, 'LWO3127', 2, 27, 2),
       (9, 'MUE7109', 3, 2, 3), (10, 'MMP1931', 3, 7, 3), (11, 'LVS2832', 3, 9, 3), (12, 'LWO3127', 3, 4, 3);

insert into ENDERECO(ID_ENDERECO, BAIRRO_SETOR, CEP, LOTE, NUMERO, QUADRA, RUA)
values (1, 'Setor Universitario', '11111111', 'Lote 1', 111, 'Qd 01', 'Rua 1'),
       (2, 'Setor Bueno', '22222222', 'Lote 2', 222, 'Qd 02', 'Rua 2'),
       (3, 'Aguas Claras Norte', '33333333', 'Lote 3', 333, 'Qd 03', 'Rua 3');

insert into FILIAL(ID_FILIAL, ID_ENDERECO, ID_GARAGEM)
values (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3);

insert into PESSOA(ID_PESSOA, CPF, NOME, ID_ENDERECO)
values (1, '11111111111', 'Lucas Melo', 1),
       (2, '22222222222', 'Rafael Jardim', 3),
       (3, '33333333333', 'Ronaldo', 2);

insert into CLIENTE(ID_CLIENTE, PONTUACAO, ID_PESSOA)
values (1, 200, 1),
       (2, 150, 2),
       (3, 542, 3);

insert into CONTRATO_LOCACAO(ID_CONTRATO, ATIVO, DATA_DEVOLUCAO, DATA_RETIRADA, VALOR_DIARIA, VALOR_SEGURO, ID_CLIENTE, ID_FILIAL_DEVOLUCAO, ID_FILIAL_RETIRADA, ID_VEICULO)
values (1, true, '2021-12-02 12:00:01 UTC', '2021-12-01 12:00:01 UTC', 112.30, 52.47, 1, 1, 1, 11),
       (2, true, '2021-11-15 12:00:01 UTC', '2021-11-14 12:00:01 UTC', 117.30, 77.58, 2, 2, 1, 7),
       (3, true, '2021-10-11 12:00:01 UTC', '2021-10-10 12:00:01 UTC', 128.30, 44.21, 3, 3, 2, 1);