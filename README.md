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

<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
src/
 ├── main/
 │   ├── java/com/devtech/postcombustivel   # Código-fonte Java
 │   ├── resources/                         # Configurações e templates
 │   │   ├── application.properties
 │   │   └── static / templates
 └── test/                                  # Testes automatizados
</pre>
</div>

---

## 🔧 Como Executar

**1. Pré-requisitos:**
- Java 21 instalado
- Maven configurado

**2. Clonar o repositório:**
<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
git clone https://github.com/seuusuario/post-combustivel.git
cd post-combustivel
</pre>
</div>

**3. Rodar a aplicação:**
<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
mvn spring-boot:run
</pre>
</div>

**4. Acessar no navegador:**
<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
http://localhost:8080
</pre>
</div>

**5. Acessar Console H2:**
<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: *(vazia)*
</pre>
</div>

---

## 📌 Funcionalidades

- ✅ Cadastro e consulta de dados relacionados a combustíveis
- ✅ Banco de dados em memória para testes rápidos
- ✅ API REST pronta para consumo
- ✅ Uso de Lombok para reduzir código repetitivo

---

## 🧪 Testes

Para executar os testes automatizados:
<div style="background-color:#000000; color:#ffffff; padding:10px; border-radius:5px;">
<pre>
mvn test
</pre>
</div>

---

## 📜 Licença

Este projeto está sob a licença [MIT](LICENSE).

---

## 👨‍💻 Autor
Desenvolvido por Fernando Simões.
📧 Email: fernandoalvessimoes@gmail.com
🌐 LinkedIn: <a href="linkedin.com/in/fernando-simões-2446ab25">linkedin.com/in/fernando-simões-2446ab25</a>



