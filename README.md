# desafio-itau

# Desafio Itaú - API de Estatísticas
## Descrição
Este projeto é uma aplicação Spring Boot que fornece uma API para cálculo de estatísticas. A aplicação é capaz de processar dados e retornar métricas estatísticas como contagem, soma, média, mínimo e máximo.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Maven
## Estrutura do Projeto
```
desafio.itau/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── desafio/
│   │   │       └── itau/
│   │   │           └── springboot/
│   │   │               └── dto/
│   │   │                   └── 
StatisticsResponse.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── desafio/
│               └── itau/
│                   └── springboot/
│                       └── 
SpringbootApplicationTests.java
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── README.md
```
## Configuração
A aplicação está configurada com o nome "springboot" conforme definido no arquivo application.properties :

```
spring.application.name=springboot
```
## Modelo de Dados
A aplicação utiliza o modelo StatisticsResponse para retornar os resultados estatísticos:

- count : número total de transações
- sum : soma total dos valores
- avg : média dos valores
- min : valor mínimo
- max : valor máximo
## Como Executar
1. Clone o repositório
2. Na raiz do projeto, execute:
```
./mvnw spring-boot:run
```
## Testes
Para executar os testes:

```
./mvnw test
```
## Contribuição
Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua feature ( git checkout -b feature/nova-feature )
3. Faça commit das mudanças ( git commit -m 'Adiciona nova feature' )
4. Faça push para a branch ( git push origin feature/nova-feature )
5. Abra um Pull Request
## Licença