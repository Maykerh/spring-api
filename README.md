<div align="center" style="display: flex; flex-direction: column; align-items: center; justify-content: center">
    <h1 align="center">Nosso Banco</h1>
</div>

## :computer: Descrição

<h4 align="center">
   Api simulando a criação de conta em um banco, desenvolvido com Spring Boot para o bootcamp da Zup.
</h4>

## :floppy_disk: Execução

Primeiramente clonar o repositório

```bash
git clone https://github.com/Maykerh/spring-api
```

Renomear o arquivo src/main/resources/application.porperies.example para application.properties.

Editar o arquivo e adicionar as configurações de email. 

Na raiz do projeto, executar o comando abaixo para subir o Spring

```bash
./mvnw org.springframework.boot:spring-boot-maven-plugin:run
```

## :heavy_check_mark: Teste

A documentação da api pode ser consultada no Swagger

```bash
http://localhost:8080/swagger-ui.html
```

Para o banco de dados foi utilizado o H2. O login e senha podem ser consultados no arquivo application.properties

```bash
http://localhost:8080/h2-console/login.jsp
```
