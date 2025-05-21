# Spotfei 🎵

Projeto acadêmico desenvolvido com o objetivo de simular uma plataforma de informações de áudios digitais, como músicas e podcasts — inspirado no Spotify.

## 🧑‍💻 Desenvolvido por
**Paulo Ricardo Bezerra R.A = 22.223.015-3 **  
Centro Universitário FEI – Ciência da Computação

---

. Introdução
Este projeto tem como objetivo simular uma plataforma de informações de músicas e podcasts, inspirada no Spotify. O nome do projeto é Spotfei, e ele foi desenvolvido utilizando a linguagem Java com a biblioteca Swing para interface gráfica, banco de dados PostgreSQL para armazenamento, e a arquitetura MVC para organização do código.


## 📚 Tecnologias utilizadas

- Java (Swing)
- PostgreSQL
- JDBC
- Arquitetura MVC
- NetBeans IDE

---

## 🔧 Funcionalidades

- Cadastro e login de usuário
- Tela principal com layout inspirado em plataformas de streaming
- Buscar músicas por nome, artista ou gênero
- Curtir e descurtir músicas
- Criar, editar e excluir playlists
- Adicionar ou remover músicas das playlists
- Visualizar histórico das últimas músicas buscadas
- Visualizar lista de músicas curtidas e descurtidas

Cadastro e Login
Permite o cadastro de usuários e login utilizando dados armazenados no banco de dados.
 Buscar Músicas
O usuário pode buscar músicas por nome, artista ou gênero. Os resultados são exibidos dinamicamente em uma lista.
 Curtir e Descurtir Músicas
O botão 'Curtir / Descurtir' permite adicionar ou remover músicas da lista de músicas curtidas.
 Gerenciar Playlists
Permite ao usuário criar, editar e excluir playlists. Também é possível adicionar ou remover músicas das playlists.
 Histórico
O botão Histórico permite visualizar:
- As últimas 10 músicas buscadas
- A lista de músicas curtidas
- A lista de músicas descurtidas

---

## 🗂 Estrutura do Projeto

src/
 view/ # Telas do sistema (Swing)
 controller/ # Controladores das ações
 model/ # Entidades do sistema
 dao/ # Acesso a banco de dados
 projeto/ # Classe principal

 Conclusão
O projeto Spotfei atendeu todos os requisitos propostos, utilizando boas práticas de programação orientada a objetos e organização do código via MVC. A interface foi desenvolvida com foco em usabilidade, e todas as funcionalidades funcionam corretamente após testes realizados.


RELATORIO 

O projeto Spotfei foi desenvolvido com o objetivo de simular uma plataforma de informações de músicas e podcasts inspirada em serviços de streaming, como o Spotify. Este sistema, implementado em Java, visa oferecer uma experiência de interface gráfica onde o usuário pode buscar músicas, visualizar informações detalhadas, curtir ou descurtir faixas, gerenciar playlists e acompanhar seu histórico de ações. O desenvolvimento seguiu os princípios da arquitetura MVC (Model-View-Controller) para promover uma melhor organização e manutenção do código, e utilizou tecnologias como Java Swing para a interface, PostgreSQL para o armazenamento de dados e JDBC para a conexão com o banco de dados.

 Tecnologias Utilizadas
Java (Swing): A aplicação foi construída utilizando a linguagem Java com Swing, que possibilitou a criação de uma interface gráfica rica e interativa.

PostgreSQL: Como sistema gerenciador de banco de dados, o PostgreSQL armazena informações essenciais, como dados de usuários e músicas.

JDBC: Foi utilizado para estabelecer a conexão entre a aplicação e o banco de dados, permitindo a execução de queries e o gerenciamento de dados.

NetBeans IDE: O ambiente de desenvolvimento escolhido para o projeto foi o NetBeans, que facilitou a criação das telas via GUI Builder, bem como a organização do projeto em pacotes seguindo o padrão MVC.

Git e GitHub: Todas as etapas de desenvolvimento foram versionadas utilizando Git, e o projeto foi disponibilizado no GitHub com commits organizados para mostrar a evolução do desenvolvimento.

 Funcionalidades Implementadas
O Spotfei possui um conjunto de funcionalidades que foram implementadas para demonstrar o fluxo e a lógica de um sistema de streaming de músicas:

 Cadastro e Login
Cadastro e Autenticação: Os usuários podem se cadastrar e realizar login com suas credenciais. Esses dados são armazenados no banco de dados, e a aplicação valida o login antes de conceder acesso às funcionalidades principais do sistema.

 Busca de Músicas
Pesquisa Dinâmica: O usuário pode buscar músicas por meio de um campo de busca onde pode digitar o nome da música, artista ou gênero. A busca é executada utilizando consultas parametrizadas no banco de dados (via DAO), garantindo segurança e eficiência.

Exibição Detalhada: Os resultados são apresentados em uma lista (JList) e incluem informações detalhadas, como o ID, nome, artista e gênero, possibilitando a identificação clara de cada faixa.

 Curtir e Descurtir Músicas
Interação com a Lista: Ao selecionar uma música na lista de resultados, o usuário pode clicar no botão “Curtir / Descurtir”. Se a música já estiver curtida, ela será desmarcada, e vice-versa.

Feedback Imediato: A ação gera um feedback visual por meio de diálogos (JOptionPane), informando o usuário sobre o estado da ação (música curtida ou descurtida). Internamente, as músicas curtidas são gerenciadas através de uma lista em memória.

Gerenciamento de Playlists
Criação de Playlists: O usuário pode criar novas playlists, atribuindo-lhes nomes personalizados. A criação é realizada via interface, e as playlists são armazenadas em memória utilizando uma estrutura de dados (Map) que associa o nome da playlist a uma lista de músicas.

Edição e Exclusão: Além de criar, o sistema permite renomear e excluir playlists. Essa funcionalidade garante flexibilidade para o usuário organizar sua coleção de músicas.

Adição e Remoção de Músicas: É possível adicionar músicas às playlists ou removê-las conforme a preferência do usuário. Essas operações são realizadas por meio de prompts interativos que solicitam o nome da playlist e confirmam a adição ou remoção da música selecionada.

Histórico
Registro de Buscas: O sistema armazena as últimas 10 buscas realizadas pelo usuário, oferecendo um histórico que permite rever termos de pesquisa anteriores.

Histórico de Ações: Além das buscas, o histórico também registra as músicas curtidas e descurtidas, proporcionando ao usuário uma visão completa de suas interações com a plataforma.

 Estrutura do Projeto
O projeto foi organizado em pacotes de forma a separar as responsabilidades de cada componente, seguindo o padrão MVC:

model: Contém as classes de modelo (por exemplo, Aluno e Musica) que representam as entidades do sistema.

DAO: Abriga as classes responsáveis pela conexão com o banco de dados e pelas operações SQL (por exemplo, Conexao, AlunoDao e MusicaDao).

Controller: Contém a lógica de negócios e as regras do sistema. O ControllerSpotfei, por exemplo, gerencia todas as interações da tela principal, enquanto os outros controladores gerenciam funções de cadastro e login.

view: Possui todas as interfaces gráficas desenvolvidas em Swing (por exemplo, Login, Cadastro e Spotfei).

Essa organização permite uma manutenção mais simples, com cada camada sendo responsável por uma parte específica do sistema.

 Conclusão
O desenvolvimento do Spotfei permitiu a integração de diversas tecnologias e abordagens modernas, como o padrão MVC e boas práticas de programação orientada a objetos. Com uma interface gráfica interativa, funcionalidades robustas de busca, curtir/descurtir, gerenciamento de playlists e histórico, o sistema demonstra claramente como seria uma aplicação real voltada para a gestão de informações musicais. Todas as funcionalidades foram implementadas com o intuito de oferecer uma experiência prática e funcional para o usuário, utilizando métodos interativos e feedback visual para facilitar o uso.

Além disso, o versionamento detalhado com Git e a publicação no GitHub possibilitaram um acompanhamento transparente da evolução do projeto, contribuindo para a organização e documentação do desenvolvimento.
 

