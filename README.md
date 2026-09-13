#  Projeto Final — POO

Aplicação desktop desenvolvida com **Java** como projeto final da disciplina de **Programação Orientada a Objetos (POO)**.

O projeto foi desenvolvido com foco na aplicação prática dos principais conceitos de orientação a objetos, organização do código utilizando o padrão **MVC (Model-View-Controller)** e construção de uma interface gráfica utilizando **Java Swing**.

---

##  Sobre o projeto

O **Projeto Final — POO** é uma aplicação desktop desenvolvida em **Java**, criada com o objetivo de aplicar na prática os conceitos estudados durante a disciplina de **Programação Orientada a Objetos**.

A aplicação possui uma interface gráfica desenvolvida com **Java Swing** e utiliza uma organização baseada no padrão arquitetural **MVC**, buscando separar as responsabilidades entre as diferentes partes do sistema.

O projeto trabalha conceitos fundamentais como:

* Classes e objetos
* Encapsulamento
* Abstração
* Herança
* Polimorfismo
* Construtores
* Métodos e atributos
* Modificadores de acesso
* Separação de responsabilidades
* Arquitetura MVC
* Interfaces gráficas com Java Swing

---

##  Tecnologias utilizadas

* **Java**
* **Java Swing**
* **AWT**
* **MVC**
* **Git**
* **GitHub**

---

##  Arquitetura

O projeto utiliza o padrão arquitetural **MVC (Model-View-Controller)** para organizar os componentes da aplicação e separar suas responsabilidades.

```text
src/
└── main/
    └── java/
        └── ...
            ├── controller/
            ├── model/
            └── view/
```

### Responsabilidade das camadas

**Model**

Responsável por representar os dados e as entidades utilizadas pela aplicação, além de concentrar os elementos relacionados ao domínio do sistema.

**View**

Responsável pela interface gráfica da aplicação, utilizando componentes do **Java Swing** para apresentar informações e permitir a interação do usuário.

**Controller**

Responsável por controlar o fluxo da aplicação e realizar a comunicação entre as interfaces (**View**) e os dados/regras do sistema (**Model**).

---

##  Interface

<table>
  <tr>
    <td>
      <img width="100%" alt="Captura de tela 2026-09-12 210158" src="https://github.com/user-attachments/assets/52668986-4bf5-4355-804a-fe4158756f6d" />
    </td>
    <td>
      <img width="100%" alt="Captura de tela 2026-09-12 210212" src="https://github.com/user-attachments/assets/6c6e4a64-6d44-4feb-b323-9b6fe05f50f7" />
    </td>
  </tr>
</table>


---

##  Programação Orientada a Objetos

Um dos principais objetivos do projeto é demonstrar a utilização prática dos conceitos fundamentais da **Programação Orientada a Objetos**.

### Encapsulamento

Utilização de modificadores de acesso e métodos para controlar o acesso aos atributos das classes.

### Abstração

Representação das características e comportamentos essenciais dos objetos, mantendo a implementação organizada.

### Herança

Utilização do relacionamento entre classes para possibilitar o reaproveitamento de características e comportamentos.

### Polimorfismo

Permite que diferentes objetos possam responder de maneiras diferentes às mesmas operações, de acordo com suas implementações.

---

##  Fluxo da aplicação

De forma geral, o fluxo da aplicação segue a seguinte estrutura:

```text
Usuário
   ↓
View
   ↓
Controller
   ↓
Model
   ↓
Controller
   ↓
View
```

A **View** recebe a interação do usuário, o **Controller** processa a ação e realiza a comunicação necessária com o **Model**, retornando posteriormente as informações para a interface.

---

##  Como executar

### Pré-requisitos

Antes de executar o projeto, tenha instalado:

* **Java JDK**
* **IntelliJ IDEA**, Eclipse, VS Code ou outra IDE compatível

### 1. Clone o repositório

```bash
git clone https://github.com/viniciusfonseca19/projeto-final-poo.git
```

### 2. Entre na pasta

```bash
cd projeto-final-poo
```

### 3. Abra o projeto

Abra a pasta do projeto na IDE de sua preferência.

### 4. Execute a aplicação

Localize a classe principal que contém o método:

```java
public static void main(String[] args)
```

e execute a aplicação.

---

## Objetivo

Este projeto foi desenvolvido como projeto final da disciplina de **Programação Orientada a Objetos** do meu curso Técnico de Informática, tendo como principal objetivo colocar em prática os conhecimentos adquiridos durante os estudos de Java.

O desenvolvimento também proporcionou experiência com:

* Programação Orientada a Objetos
* Desenvolvimento desktop
* Java Swing
* Arquitetura MVC
* Organização de código
* Separação de responsabilidades
* Desenvolvimento de interfaces gráficas
* Git e GitHub

---

##  Aprendizados

Durante o desenvolvimento do projeto foram praticados conceitos importantes para a formação em desenvolvimento Java, incluindo:

* Criação e organização de classes
* Relacionamento entre objetos
* Encapsulamento
* Herança
* Polimorfismo
* Abstração
* Arquitetura MVC
* Desenvolvimento de interfaces gráficas
* Manipulação de eventos no Java Swing
* Organização de projetos Java

---

##  Autor

Desenvolvido por **Vinícius Fonseca**.

Estudante de Técnico em Informática e desenvolvedor focado em **Java, Spring Boot e desenvolvimento backend**.

---

⭐ Se este projeto foi útil para você ou ajudou nos seus estudos, considere deixar uma estrela no repositório!
