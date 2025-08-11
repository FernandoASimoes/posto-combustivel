# ⛽ Post Combustível

Sistema web desenvolvido em **Java 21** com **Spring Boot** para gerenciar informações relacionadas a postos de combustíveis.  
O projeto utiliza banco de dados em memória (**H2**) para facilitar testes e desenvolvimento.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database**
- **Lombok**
- **JUnit** (testes)

---

## 📂 Estrutura do Projeto

```plaintext
src/
 ├── main/
 │   ├── java/com/devtech/postcombustivel   # Código-fonte Java
 │   ├── resources/                         # Configurações e templates
 │   │   ├── application.properties
 │   │   └── static / templates
 └── test/                                  # Testes automatizados

🔧 Como Executar
Pré-requisitos:

Java 21 instalado

Maven configurado

Clonar o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/post-combustivel.git
cd post-combustivel
Rodar a aplicação:

bash
Copiar
Editar
mvn spring-boot:run
Acessar no navegador:

arduino
Copiar
Editar
http://localhost:8080
Acessar Console H2:

bash
Copiar
Editar
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

Usuário: sa

Senha: (vazia)

📌 Funcionalidades
✅ Cadastro e consulta de dados relacionados a combustíveis
✅ Banco de dados em memória para testes rápidos
✅ API REST pronta para consumo
✅ Uso de Lombok para reduzir código boilerplate

🧪 Testes
Para executar os testes automatizados:

bash
Copiar
Editar
mvn test
📜 Licença
Este projeto está sob a licença MIT.

👨‍💻 Autor
Desenvolvido por Fernando Simões.
📧 Email: fernandoalvessimoes@gmail.com
🌐 LinkedIn: linkedin.com/in/fernando-simões-2446ab25
