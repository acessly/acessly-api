![Imagem](https://drive.google.com/uc?export=view&id=1_mfj4ich8mrC-_zU7Beb_NP0gbfR_QUi)

![API Rest](https://img.shields.io/badge/API%20Rest-000000?style=flat&logo=fastapi&logoColor=009688)
![Render](https://img.shields.io/badge/Render-000000?style=flat&logo=render&logoColor=46E3B7)
![Java](https://img.shields.io/badge/Java-000000?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-000000?style=flat&logo=springboot&logoColor=6DB33F)
![Spring Security](https://img.shields.io/badge/Spring%20Security-000000?style=flat&logo=springsecurity&logoColor=6DB33F)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-000000?style=flat&logo=spring&logoColor=6DB33F)
![Bean Validation](https://img.shields.io/badge/Bean%20Validation-000000?style=flat&logo=hibernate&logoColor=5A8624)
![Swagger](https://img.shields.io/badge/Swagger-000000?style=flat&logo=swagger&logoColor=85EA2D)
![Oracle Database](https://img.shields.io/badge/Oracle%20Database-000000?style=flat&logo=oracle&logoColor=F80000)
![Autenticação JWT](https://img.shields.io/badge/Autenticação%20JWT-000000?style=flat&logo=jsonwebtokens&logoColor=FFFFFF)
![Paginação, ordenação e filtros](https://img.shields.io/badge/Paginação,%20ordenação%20e%20filtros-000000?style=flat)

## 🚨 Problemática

### O Desafio da Inclusão no Mercado de Trabalho

O Brasil possui **17,2 milhões de pessoas com algum tipo de deficiência**, representando **8,4% da população**. Apesar da **Lei de Cotas (Lei nº 8.213/91)** exigir que empresas com mais de 100 funcionários reservem de 2% a 5% de suas vagas para PCDs, os números mostram uma realidade preocupante.

### 📊 Barreiras atuais identificadas

- ❌ Apenas **28,3%** das pessoas com deficiência em idade produtiva participam do mercado de trabalho, comparado a **66,3%** das pessoas sem deficiência
- ❌ Das PCDs empregadas, somente **34,3%** possuem carteira assinada, contra **50,9%** das pessoas sem deficiência
- ❌ O salário médio das PCDs é de **R$ 1.639**, representando apenas **62%** do rendimento médio das pessoas sem deficiência (R$ 2.619)
- ❌ **7 em cada 10 pessoas com deficiência** estão fora do mercado de trabalho
- ❌ Empresas enfrentam dificuldades para encontrar candidatos PCDs qualificados e compatíveis com suas vagas
- ❌ Falta de transparência sobre acessibilidade real dos ambientes corporativos
- ❌ Processos seletivos não adaptados às necessidades das PCDs

### 👥 Público-alvo

- 🧑‍🦽 Pessoas com deficiência em busca de oportunidades de trabalho
- 🏢 Empresas que desejam contratar de forma inclusiva
- 🎓 Instituições que promovem programas de empregabilidade e diversidade

---

## 💡 A Solução Acessly

O **Acessly** é a plataforma digital inclusiva que olha além do laudo, focando no potencial e conectando pessoas com deficiência a oportunidades de trabalho verdadeiramente acessíveis. Promovemos um **match assertivo**, baseado em:

✅ **Competências validadas**  
✅ **Compatibilidade real** entre a necessidade do profissional e a estrutura da empresa  
✅ **Transparência de ponta a ponta** no processo seletivo  

### 🎯 Objetivo

Reduzir ativamente o **gap de empregabilidade e renda** das pessoas com deficiência no Brasil. Buscamos facilitar a inclusão produtiva e sustentável, conectando candidatos e empresas em uma plataforma acessível, que assegura dignidade, equidade e total transparência sobre o nível de acessibilidade de cada oportunidade, garantindo um match justo e assertivo.

## 🤔 Como a API Rest resolve o problema?

A **Acessly API** é o **coração tecnológico da plataforma**, fornecendo toda a infraestrutura backend necessária para conectar candidatos PCDs a empresas inclusivas de forma eficiente, segura e escalável.

## ⚡ Funcionalidades principais da API

#### 1️⃣ **Gestão completa de usuários**

- Cadastro diferenciado para **Candidatos** e **Empresas**
- Perfis detalhados com informações de acessibilidade
- Autenticação segura com **JWT** e controle de permissões por roles

#### 2️⃣ **Match inteligente**
A API permite:
- 🔍 **Filtros avançados** por tipo de deficiência, habilidades, localização e tipo de vaga
- 📍 **Busca geográfica** para vagas próximas ao candidato
- 🎯 **Compatibilidade de acessibilidade**: candidatos visualizam quais recursos cada empresa oferece

#### 3️⃣ **Transparência total**
- 📋 Empresas cadastram **recursos de suporte** disponíveis (rampa, elevador, software leitor de tela, intérprete de Libras, etc.)
- 👀 Candidatos acessam informações detalhadas sobre acessibilidade **antes de se candidatar**
- 📊 Vagas especificam claramente: tipo (remoto/presencial/híbrido), cidade, recursos oferecidos

#### 4️⃣ **Processo seletivo estruturado**
- 📝 Candidatos se candidatam a vagas de forma simples
- 🔔 Empresas recebem lista organizada de candidaturas
- ✅ Sistema de aprovação/reprovação com status transparente
- 📧 Notificações automáticas sobre mudanças de status (futuro)

### 🚀 Impacto da API na solução

| Problema | Como a API Resolve |
|----------|-------------------|
| ❌ Dificuldade de encontrar vagas acessíveis | ✅ Filtros por tipo de acessibilidade oferecida |
| ❌ Falta de transparência sobre recursos | ✅ Cadastro detalhado de recursos de suporte |
| ❌ Processos seletivos inadequados | ✅ Sistema estruturado com status e aprovações |
| ❌ Baixa taxa de compatibilidade | ✅ Match baseado em habilidades e necessidades reais |
| ❌ Empresas não encontram candidatos | ✅ Busca e filtros para empresas encontrarem perfis |

---

## 🏆 Diferenciais técnicos implementados

### ✅ API Rest atendendo as boas práticas da arquitetura

- 🎯 **Princípios RESTful**: Verbos HTTP corretos (GET, POST, PUT, PATCH, DELETE)
- 📦 **Separação de responsabilidades**: Controllers, Services, Repositories
- 🔄 **DTOs**: Request/Response separados dos models
- 📋 **Padronização de respostas**: Status codes consistentes
- 🚫 **Stateless**: API sem estado de sessão

### ✅ Persistência em Banco de Dados Relacional utilizando Spring Data JPA

- 🗄️ **Oracle Database** como SGBD
- 🔧 **Spring Data JPA** para abstração de acesso a dados
- 🏗️ **Entities** mapeadas com anotações JPA
- 🔑 **Sequences** para geração de IDs
- 🧩 **Repositories** com queries personalizadas

### ✅ Mapeamento de relacionamento entre entidades

| Relacionamento | Tipo | Implementação |
|----------------|------|---------------|
| User ↔ Company | 1:N | `@ManyToOne` em Company |
| User ↔ Candidate | 1:1 | `@ManyToOne` em Candidate |
| Company ↔ Vacancy | 1:N | `@ManyToOne` em Vacancy |
| Company ↔ CompanySupport | 1:N | `@ManyToOne` em CompanySupport |
| Candidate ↔ Candidacy | 1:N | `@ManyToOne` em Candidacy |
| Vacancy ↔ Candidacy | 1:N | `@ManyToOne` em Candidacy |

### ✅ Validação com Bean Validation

- 📝 **Mensagens internacionalizadas** (EN/PT-BR)
- ✅ **Validação automática** com `@Valid` nos controllers
- 🔍 **Validações customizadas** para regras de negócio

### ✅ Paginação, ordenação e filtros

- 📄 **Paginação**: `Pageable` em todos os endpoints de listagem
- 🔢 **Ordenação**: parâmetro `sort` configurável
- 🔍 **Filtros dinâmicos**: specifications para consultas complexas
- 📊 **Metadata de paginação**: total de elementos, páginas, etc.

```java
// Exemplo de endpoint com paginação e filtros
GET /vacancies?title=Java&city=São Paulo&page=0&size=10&sort=salary,desc
```

### ✅ Documentação da API com Swagger

- 📚 **Swagger UI** interativo
- 📝 **Anotações completas**: `@Operation`, `@ApiResponse`, `@Parameter`
- 🏷️ **Tags organizadas** por contexto de negócio
- 🧪 **Testável**: try-it-out direto na interface

Com a aplicação rodando, acesse `http://localhost:8080/swagger-ui/index.html` ou `http://localhost:8080/swagger-ui.html`

### ✅ Autenticação com JWT

- 🔐 **JSON Web Tokens** com assinatura RSA
- 👤 **Roles**: `CANDIDATE` e `COMPANY`
- 🛡️ **Spring Security**: proteção de rotas
- 🎫 **@PreAuthorize**: controle de acesso granular
- ⏱️ **Expiração configurável**: tokens com validade de 1 hora
- 🔑 **Chaves RSA**: geração segura de tokens

## 🔗 Endpoints da API

### 🔐 Authentication

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/auth/login` | Realizar login e obter token JWT | 🌐 Público |

---

### 👤 Users

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/users` | Cadastrar novo usuário (CANDIDATE ou COMPANY) | 🌐 Público |
| GET | `/users` | Listar usuários (paginado e filtrado) | 🔒 Autenticado |
| GET | `/users/{id}` | Buscar usuário por ID | 🔒 Autenticado |
| PUT | `/users/{id}` | Atualizar dados do usuário | 🔒 Próprio usuário |
| DELETE | `/users/{id}` | Deletar usuário | 🔒 Próprio usuário |

---

### 🏢 Companies

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/companies` | Cadastrar empresa | 🏢 COMPANY |
| GET | `/companies` | Listar empresas (paginado e filtrado) | 🔒 Autenticado |
| GET | `/companies/{id}` | Buscar empresa por ID | 🔒 Autenticado |
| PUT | `/companies/{id}` | Atualizar dados da empresa | 🏢 COMPANY |
| DELETE | `/companies/{id}` | Deletar empresa | 🏢 COMPANY |

**Filtros disponíveis:** `name`, `sector`, `acessibilityType`

---

### 👨‍💼 Candidates

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/candidates` | Cadastrar perfil de candidato | 🧑‍🦽 CANDIDATE |
| GET | `/candidates` | Listar candidatos (paginado e filtrado) | 🔒 Autenticado |
| GET | `/candidates/{id}` | Buscar candidato por ID | 🔒 Autenticado |
| PUT | `/candidates/{id}` | Atualizar perfil do candidato | 🧑‍🦽 CANDIDATE |
| DELETE | `/candidates/{id}` | Deletar perfil do candidato | 🧑‍🦽 CANDIDATE |

**Filtros disponíveis:** `disabilityType`, `skills`

---

### 💼 Vacancies

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/vacancies` | Cadastrar nova vaga | 🏢 COMPANY |
| GET | `/vacancies` | Listar vagas (paginado e filtrado) | 🔒 Autenticado |
| GET | `/vacancies/{id}` | Buscar vaga por ID | 🔒 Autenticado |
| PUT | `/vacancies/{id}` | Atualizar vaga | 🏢 COMPANY |
| DELETE | `/vacancies/{id}` | Deletar vaga | 🏢 COMPANY |

**Filtros disponíveis:** `title`, `vacancyType`, `city`, `accessibilityOffered`

---

### 📝 Candidacies

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/candidacies` | Candidatar-se a uma vaga | 🧑‍🦽 CANDIDATE |
| GET | `/candidacies` | Listar candidaturas (paginado e filtrado) | 🔒 Autenticado |
| GET | `/candidacies/{id}` | Buscar candidatura por ID | 🔒 Autenticado |
| GET | `/candidacies/candidate/{candidateId}` | Listar candidaturas de um candidato | 🧑‍🦽 CANDIDATE |
| GET | `/candidacies/vacancy/{vacancyId}` | Listar candidatos de uma vaga | 🏢 COMPANY |
| PATCH | `/candidacies/{id}/status` | Atualizar status da candidatura | 🏢 COMPANY |
| DELETE | `/candidacies/{id}` | Cancelar candidatura | 🧑‍🦽 CANDIDATE |

**Filtros disponíveis:** `candidateId`, `vacancyId`, `status`

**Status possíveis:** `UNDER_ANALYSIS`, `APPROVED`, `REJECTED`

---

### 🛠️ Company Support

| Método | Endpoint | Descrição | Acesso |
|--------|----------|-----------|--------|
| POST | `/company-supports` | Cadastrar recurso de suporte | 🏢 COMPANY |
| GET | `/company-supports` | Listar recursos (paginado e filtrado) | 🔒 Autenticado |
| GET | `/company-supports/{id}` | Buscar recurso por ID | 🔒 Autenticado |
| GET | `/company-supports/company/{companyId}` | Listar recursos de uma empresa | 🔒 Autenticado |
| PUT | `/company-supports/{id}` | Atualizar recurso | 🏢 COMPANY |
| DELETE | `/company-supports/{id}` | Deletar recurso | 🏢 COMPANY |

**Filtros disponíveis:** `companyId`, `supportType`

---

## Instruções para testes

### 📋 Pré-requisitos

- **Java 17** ou superior
- **Oracle Database** configurado
- **Maven** 3.8+
- **Insomnia** ou **Postman** para testes de API

### Configuração do ambiente

### 1. Clone o repositório e entre na pasta
```bash
git clone https://github.com/acessly/acessly-api.git
cd acessly-api
```

### 2. Configure o banco de dados
Edite `src/main/resources/application.properties`:

```bash
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 3. Execute a aplicação

```bash
mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 🪢 Fluxo completo de testes

### **Fase 1: cadastro de usuários (Público)**

#### 📝 1.1 Cadastrar usuário COMPANY

`POST` http://localhost:8080/users

Content-Type: application/json

**Body:**

```json
{
  "name": "Industrias Starks",
  "email": "industrias@starks.com",
  "password": "senha123!",
  "userRole": "COMPANY",
  "city": "São Paulo",
  "state": "SP",
  "phone": "(11) 3000-1000"
}
```

**Resposta esperada:** `201 Created`

```json
{
  "id": 1,
  "name": "Industrias Starks",
  "email": "industrias@starks.com",
  "userRole": "COMPANY",
...
}
```

⚠️ **ANOTE O ID DO USUÁRIO (ex: 1)**

---

##### 📝 1.2 Cadastrar usuário CANDIDATE

`POST` http://localhost:8080/users

Content-Type: application/json

**Body:**

```json
{
  "name": "João Silva",
  "email": "joao.silva@email.com",
  "password": "senha123!",
  "userRole": "CANDIDATE",
  "city": "São Paulo",
  "state": "SP",
  "phone": "(11) 98888-1111"
}
```

**Resposta esperada:** `201 Created`

⚠️ **ANOTE O ID DO USUÁRIO (ex: 2)**

---

#### **FASE 2: Autenticação**

##### 🔐 2.1 Login como COMPANY

`POST` http://localhost:8080/auth/login

Content-Type: application/json

**Body:**

```json
{
  "email": "industrias@starks.com",
  "password": "senha123!"
}
```

**Resposta:**

```json
{
  "token": "eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJhY2Vzc2x5LWFwaS...",
  "email": "industrias@starks.com",
  "name": "Industrias Starks"
}
```

⚠️ **COPIE O TOKEN! Use nas próximas requisições como COMPANY**

---

##### 🔐 2.2 Login como CANDIDATE

`POST` http://localhost:8080/auth/login

Content-Type: application/json

**Body:**

```json
{
  "email": "joao.silva@email.com",
  "password": "senha123!"
}
```

⚠️ **COPIE O TOKEN! Use nas próximas requisições como CANDIDATE**

---

#### **FASE 3: Cadastro de perfis**

##### 🏢 3.1 Cadastrar empresa (COM token COMPANY)

`POST` http://localhost:8080/companies

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Body:**

```json
{
  "userId": 1,
  "name": "Industrias Starks",
  "sector": "Tecnologia",
  "acessibilityType": "LOW",
  "website": "https://industriasstark.com",
  "description": "Empresa de tecnologia focada em inclusão digital e acessibilidade."
}
```

**Resposta esperada:** `201 Created`

⚠️ **ANOTE O ID DA EMPRESA (ex: 1)**

---

##### 🧑‍🦽 3.2 Cadastrar Candidato (COM token CANDIDATE)

`POST` http://localhost:8080/candidates

Authorization: Bearer `TOKEN_DO_CANDIDATE`

Content-Type: application/json

**Body:**

```json
{
  "userId": 2,
  "disabilityType": "PHYSICAL",
  "skills": "Java, Spring Boot, SQL, Git, APIs REST, Docker",
  "requiredAcessibility": "Rampa de acesso, elevador, cadeira ajustável, mesa adaptada para cadeira de rodas"
}
```

**Resposta esperada:** `201 Created`

⚠️ **ANOTE O ID DO CANDIDATE (ex: 1)**

---

#### **FASE 4: Cadastro de recursos de suporte**

##### 🛠️ 4.1 Cadastrar recursos da empresa (COM token COMPANY)

`POST` http://localhost:8080/company-supports

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Body:**

```json
{
  "companyId": 1,
  "supportType": "Acessibilidade Física",
  "description": "Rampa de acesso, elevador adaptado, banheiros acessíveis, estacionamento prioritário"
}
```

**Resposta esperada:** `201 Created`

---

##### 🛠️ 4.2 Cadastrar tecnologia assistiva

`POST` http://localhost:8080/company-supports

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Body:**

```json
{
  "companyId": 1,
  "supportType": "Tecnologia Assistiva",
  "description": "Software leitor de tela (NVDA, JAWS), teclado em Braille, lupas eletrônicas"
}

```

---

#### **FASE 5: criação de vagas**

##### 💼 5.1 Cadastrar vaga remota (COM token COMPANY)

`POST` http://localhost:8080/vacancies

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Body:**

```json
{
  "companyId": 1,
  "title": "Desenvolvedor Java Pleno",
  "description": "Desenvolvimento de APIs REST com Spring Boot, microservices e cloud.",
  "vacancyType": "IN_PERSON",
  "city": "São Paulo",
  "state": "SP",
  "salary": 8500.00,
  "accessibilityOffered": "Trabalho 100% remoto, horário flexível, comunicação assíncrona, ferramentas acessíveis"
}
```

**Resposta esperada:** `201 Created`

⚠️ **ANOTE O ID DA VAGA (ex: 1)**

---

##### 💼 5.2 Cadastrar vaga presencial

`POST` http://localhost:8080/vacancies

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Body:**

```json
{
  "companyId": 1,
  "title": "Designer UX/UI",
  "description": "Criação de interfaces acessíveis e inclusivas.",
  "vacancyType": "IN_PERSON",
  "city": "São Paulo",
  "state": "SP",
  "salary": 6000.00,
  "accessibilityOffered": "Rampa de acesso, elevador, banheiro adaptado, cadeira ajustável, mesa regulável"
}
```

---

#### **FASE 6: Busca e Filtros**

##### 🔍 6.1 Listar todas as vagas (COM token CANDIDATE)

`GET` http://localhost:8080/vacancies

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

##### 🔍 6.2 Filtrar Vagas Remotas

`GET` http://localhost:8080/vacancies?vacancyType=REMOTE

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

##### 🔍 6.3 Filtrar por Cidade

`GET` http://localhost:8080/vacancies?city=SãoPaulo

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

##### 🔍 6.4 Filtrar por Acessibilidade Oferecida

`GET` http://localhost:8080/vacancies?accessibilityOffered=rampa

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

##### 🔍 6.5 Combinar Filtros + Paginação + Ordenação

`GET` http://localhost:8080/vacancies?vacancyType=REMOTO&city=SãoPaulo&page=0&size=10&sort=salary,desc

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

#### **FASE 7: Candidaturas**

##### 📝 7.1 Candidatar-se a uma Vaga (COM token CANDIDATE)

`POST` http://localhost:8080/candidacies

Authorization: Bearer `TOKEN_DO_CANDIDATE`

Content-Type: application/json

**Body:**

```json
{
  "candidateId": 1,
  "vacancyId": 1,
  "applicationDate": "2025-11-15"
```

**Resposta esperada:** `201 Created`

```json
{
  "id": 1,
  "candidateId": 1,
  "candidateName": "João Silva",
  "vacancyId": 1,
  "vacancyTitle": "Desenvolvedor Java Pleno",
  "companyName": "Industrias Stark",
  "applicationDate": "2025-11-15",
  "status": "UNDER_ANALYSIS"
}
```

⚠️ **ANOTE O ID DA CANDIDATURA (ex: 1)**

---

##### 📝 7.2 Ver Minhas Candidaturas (COM token CANDIDATE)

`GET` http://localhost:8080/candidacies/candidate/1

Authorization: Bearer `TOKEN_DO_CANDIDATE`

---

##### 📝 7.3 Ver Candidatos da Vaga (COM token COMPANY)

`GET` http://localhost:8080/candidacies/vacancy/1

Authorization: Bearer `TOKEN_DA_COMPANY`

---

##### ✅ 7.4 Aprovar Candidatura (COM token COMPANY)

`PATCH` http://localhost:8080/candidacies/1/status?status=APPROVED

Authorization: Bearer `TOKEN_DA_COMPANY`

**Resposta esperada:** `200 OK`

```json
{
  "id": 1,
  "status": "APROVADED",
...
}
```

---

##### ❌ 7.5 Tentar Aprovar com Token CANDIDATE (DEVE FALHAR)

`PATCH` http://localhost:8080/candidacies/1/status?status=APPROVED

Authorization: Bearer `TOKEN_DO_CANDIDATE`

**Resposta esperada:** `403 Forbidden` ✅

---

#### **FASE 8: Testes de Permissões**

##### ❌ 8.1 Candidato tentando criar vaga (DEVE FALHAR)

`POST` http://localhost:8080/vacancies

Authorization: Bearer `TOKEN_DO_CANDIDATE`

Content-Type: application/json


**Resposta esperada:** `403 Forbidden` ✅

---

##### ❌ 8.2 Empresa tentando se candidatar (DEVE FALHAR)

`POST` http://localhost:8080/candidacies

Authorization: Bearer `TOKEN_DA_COMPANY`

Content-Type: application/json

**Resposta esperada:** `403 Forbidden` ✅

### 📊 Matriz de Permissões

| Endpoint | CANDIDATE | COMPANY | Público |
|----------|-----------|---------|---------|
| POST /users | - | - | ✅ |
| POST /auth/login | - | - | ✅ |
| POST /companies | ❌ | ✅ | ❌ |
| POST /candidates | ✅ | ❌ | ❌ |
| POST /vacancies | ❌ | ✅ | ❌ |
| POST /candidacies | ✅ | ❌ | ❌ |
| POST /company-supports | ❌ | ✅ | ❌ |
| GET /vacancies | ✅ | ✅ | ❌ |
| GET /candidates | ✅ | ✅ | ❌ |
| GET /companies | ✅ | ✅ | ❌ |
| GET /candidacies/candidate/{id} | ✅ | ❌ | ❌ |
| GET /candidacies/vacancy/{id} | ❌ | ✅ | ❌ |
| PATCH /candidacies/{id}/status | ❌ | ✅ | ❌ |
| DELETE /candidacies/{id} | ✅ | ❌ | ❌ |

## 🚀 Deploy on Render

A API está hospedada via [Render](https://render.com).  
> **Atenção:** Se a aplicação estiver inativa, ao acessar pode demorar cerca de **4-5 minutos** para iniciar (cold start).  
> Acesse a documentação [Swagger UI](https://acessly-api.onrender.com/swagger-ui/index.html).

[![Deploy on Render](https://img.shields.io/badge/Render-deployed-46E3B7?style=for-the-badge&logo=render&logoColor=white)](https://acessly-api.onrender.com/swagger-ui/index.html)
[![API Status](https://img.shields.io/badge/API-Online-success?style=for-the-badge)](https://acessly-api.onrender.com/swagger-ui/index.html)

## 👨‍💻 Dev Team

| Dev | Avatar | RM |
| ------------- | ------ | ----- |
| ![](https://img.shields.io/badge/DEV-Gabriel-47797a?style=for-the-badge&logo=github) | <a href="https://github.com/GabrielRossi01"><img src="https://avatars.githubusercontent.com/u/179617228?v=4" height="50" style="border-radius:30px;"></a> | RM560967 |
| ![](https://img.shields.io/badge/DEV-Rodrigo-70b2b4?style=for-the-badge&logo=github) | <a href="https://github.com/RodrygoYamasaki"><img src="https://avatars.githubusercontent.com/u/182231531?v=4" height="50" style="border-radius:30px;"></a> | RM560759 |
| ![](https://img.shields.io/badge/DEV-Patrick-7ca787?style=for-the-badge&logo=github) | <a href="https://github.com/castropatrick"><img src="https://avatars.githubusercontent.com/u/179931043?v=4" height="50" style="border-radius:30px;"></a> | RM559271 |
