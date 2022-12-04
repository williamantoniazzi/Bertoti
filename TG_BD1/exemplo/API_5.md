<html>
<body>
  
  <h1 align="center"> API 5º Semestre - 01/2022</h1>
<a href="https://github.com/API5Sem22/API5Doc"><img src="https://img.shields.io/badge/GitHub-Repositório Projeto-181717?style=for-the-badge&logo=github"></a>

  <h2> Parceiro Acadêmico: <a href="https://www.spcbrasil.org.br/">SPC Brasil</a></h2>
  
  <h2 style="font-family:roboto;"> Resumo do Projeto :clipboard:</h2>
  
  <p align="justify" style="font-family:roboto;"> :chart_with_upwards_trend: O Projeto foi uma parceria entre a SPC Brasil e a FATEC São José dos Campos com a finalidade de desenvolvimento de um Data Warehouse que centralize os dados da empresa. Possibilitando o uso destes em reports e modelos, com o objetivo de prospectar novos clientes e aumentar as vendas e o consumo dos produtos SPC, por meio de análise de inteligência de negócio.</p>
 
  
  <h2 style="font-family:roboto;"> Tecnologias Adotadas :computer:</h2>
   
  <ul>
  <li><a href="https://www.java.com/pt_BR/">Java</a>:
    <p align="justify" style="font-family:roboto;"> Linguagem de programação utilizada para o desenvolvimento Back-End do sistema, apresenta como principais características: Portabilidade, Robustez, Segurança, Orientação a Objetos, Dinâmica e Alto Desempenho. Foi um requisito técnico solicitado pelo cliente.</p></li>
    
  <li><a href="https://spring.io/">Spring Boot</a>:
    <p align="justify" style="font-family:roboto;"> É um framework open source para Java, aplicado para facilitar a configuração e gerenciamento das dependências do projeto. Logo melhorando a produtividade e agilidade no processo de desenvolvimnto da aplicação.</p></li>
    
  <li><a href="https://www.microsoft.com/pt-br/sql-server/sql-server-downloads">Microsoft SQL Server</a>:
   <p align="justify" style="font-family:roboto;"> O Microsoft SQL Server é um sistema gerenciador de banco de dados relacional, utilizado para gerenciar o banco de dados que armazena as informações obtidas pelo sistema.</p></li>
  
  <li><a href="https://circleci.com/">CircleCI</a>:
   <p align="justify" style="font-family:roboto;"> É uma plataforma de entrega contínua e integração contínua, que pode ser usada para implementar práticas de DevOps. Foi empregado para controle da qualidade do desenvolvimento do software e controle automatizado das pipelines.</p></li>
  
  <li><a href="https://powerbi.microsoft.com/pt-br/">Power BI</a>:
   <p align="justify" style="font-family:roboto;"> O Microsoft Power BI é um serviço de análise de negócios e análise de dados. Utilizado no projeto para criação de telas que permitem a visualização dos dados, demonstrando as informações em forma gráfica.</p></li>
  
  <li><a href="https://azure.microsoft.com/pt-br/services/sql-database/campaign/#overview">Microsoft Azure</a>:
   <p align="justify" style="font-family:roboto;"> É uma plataforma destinada à execução de aplicativos e serviços, baseada nos conceitos da computação em nuvem. Foi utilizado para deploy do banco de dados SQL Server.</p></li>
  
  <li><a href="https://vertabelo.com/">Vertabelo</a>:
   <p align="justify" style="font-family:roboto;"> Ferramenta empregada para modelagem e documentação do banco de dado SQL Server.</p></li>
  
  <li><a href="https://learn.microsoft.com/pt-br/sql/integration-services/sql-server-integration-services?view=sql-server-ver15">SQL Server Integration Service</a>:
   <p align="justify" style="font-family:roboto;"> É um componente do software de banco de dados Microsoft SQL Server que pode ser usado para executar uma ampla variedade de tarefas de migração de dados. No projeto foi utilizado como ETL (Extract, Transform, Load) do banco de dados relacional para o Data Warehouse.</p></li>
    
  <li><a href="https://vuejs.org/">Vue.JS</a>:
    <p align="justify" style="font-family:roboto;"> O Front-End do projeto foi realizado com Vue.JS, uma framework para desenvolvimento de aplicações web com um código open source, foi escolhido pela equipe pela possibilidade de criação de páginas dinâmicas e otimização de trabalho com reescrita de código.</p></li>
        
  <li><a href="https://www.figma.com/">Figma</a>:
  <p align="justify" style="font-family:roboto;"> É uma ferramenta para projetos UI com excelentes recursos de Design, Prototipagem, Colaboração, Plug-in de Sistema de Projeto, entre outros. Foi empregado pela nossa equipe para realização da metodologia Product Backlog Building (PBB) e criação das Wireframes.</p></li>
          
  <li><a href="https://vempracasa.atlassian.net/">Jira</a>:
  <p align="justify" style="font-family:roboto;"> Foi utilizado como ferramenta do método Scrum para distribuição das atividades do grupo e priorização das demandas. Possibilitando realizar o planejamento das sprints, sendo capaz de registrar o progresso da equipe e do projeto, facilitando o desenvolvimento e acompanhamento da realização de tarefas.</p></li>
       
  <li><a href="https://www.heroku.com/platform">Heroku</a>:
   <p align="justify" style="font-family:roboto;"> É uma plataforma em nuvem com um serviço que suporta várias linguagens de programação, nela foi realizado o deploy do Front-End da aplicação.</p></li>
  </ul>
 
  
  <h2 style="font-family:roboto;"> Contribuições Individuais :dart:</h2>
  
   <h3> Atribuições como Desenvolvedor Back-end</h3>
  <p align="justify" style="font-family:roboto;"> Como Desenvolvedor Back-End, as atribuições foram relacionadas com a elaboração da lógica do sistema web planejado, tendo em vista as regras de negócio propostas pelo cliente. Com a criação dos Endpoints utilizados na interação com o Front-End, foi obtida uma solução completa com todas as funcionalidades necessárias.</p>
  
  <p align="justify" style="font-family:roboto;"> O primeiro passo foi a configuração do ambiente Java, para qual, foi utilizado o <a href="https://start.spring.io/">Sprint Initializr</a> para estruturar o projeto com Spring Boot 2.5.10, Java 11 e Maven. Logo, adicionamos todas as dependências necessárias no arquivo POM.xml, sendo as mais importantes: o driver de conexão com o Banco de Dados SQL Server (mssql-jdbc), o JPA (spring-boot-starter-data-jpa) e o Spring Boot Starter Web (spring-boot-starter-web).</p>
  
  <p align="justify" style="font-family:roboto;"> Com isso finalizado e versionado no GitHub, focamos em decidir a Arquitetura e padrões de projetos que implementaríamos. Logo, optamos pela arquitetura Modelo-Visão-Controle (MVC), em que separamos o sistema em componentes interligados que são essenciais para uma melhora na conexão entre as camadas de dados, lógica de negócio e iteração com o usuário.</p>
  <details>
  <summary>Clique aqui para visualizar a Lógica Arquitetural MVC</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/DiagramaArq.png" width="500px;" alt=""/>
  </details>
  
  <ul>
  <li> <p align="justify" style="font-family:roboto;">Model: são representações das tabelas do Banco de Dados SQL Server, tendo seus campos e relações mapeadas pelo Hibernate. Resultando em uma melhor validação dos dados e facilitação com consultas, inserções e atualizações na Database;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Repositories: são interfaces que tem como função serem camadas de acesso a dados. Eles extendem o JpaRepository, portanto há um melhor e mais fácil acesso aos métodos de manipulação dos dados na Database, sendo inserção (save), consulta (listAll), atualização (save) e deleção (deleteById) os que utilizamos no desenvolvimento. Além de permitirem realizar comandos SQL customizados de acordo com a necessidade da funcionalidade;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Services: são classes que concentram os métodos do Repository, visto que tem essa interface injetada com a anotação @Autowired. Sendo adicionados neles a lógica essencial para regra de negócio imposta pelo cliente, como por exemplo o envio de e-mails, além de contribuirem muito para organização dos métodos utilizados pela interface;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Controllers: são as classes onde se encontram os Endpoints do Back-End que serão utilizados para interação com o Front-End, isso corre pela chamada de rotas presentes em seus métodos, pela anotação @RequestMapping("/rota-exemplo"). Contém os Services necessários injetados com a anotação @Autowired e utiliza das chamadas dos métodos dessas classes para realização da lógica desenvolvida.</p>
  </li>
  </ul>
  
  <p align="justify" style="font-family:roboto;"> Ademais, utilizarmos a arquitetura REST, visto que a comunicação entre as aplicações ocorre com requisições HTTP, podendo ser perceptível pelas rotas nos controllers. Nesse ponto, também foi implementado o padrão de projeto Proxy, uma vez que controlamos o acesso aos objetos nas requisições com as anotações do Spring Boot. Além do uso do padrão Facade, aplicado nos repositórios do sistema, sendo uma interface que simplifica as funcionalidades das classes da Java Persistence API (JPA).</p>
  <details>
  <summary>Clique aqui para visualizar o Padrão de Projeto Proxy</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/PadraoProxy.png" width="800px;" alt=""/>
  </details>
  
  <h3>Atribuições no uso de DevOps</h3>
    <p align="justify" style="font-family:roboto;"> O DevOps é uma metodologia de desenvolvimento de software que utiliza a comunicação para integrar desenvolvedores de software e profissionais de infraestrutura de TI, realizando a integração entre os setores de desenvolvimento e operações. O objetivo é agilizar e otimizar a criação e o gerenciamento da estrutura das aplicações. Tem uma abordagem de cultura, automação e design de plataforma que tem como objetivo agregar mais valor aos negócios e aumentar sua capacidade de resposta às mudanças, por meio de entregas de serviços rápidas e de alta qualidade. Na prática, seu trabalho está envolvido no ciclo de planejamento, desenvolvimento, automação e serviço. Portanto, envolve todas as etapas até chegar ao resultado final.</p>
  <details>
     <summary>Clique aqui para visualizar os processos do DevOps</summary>
     <br>
     <img style="border-radius: 50%; align: center" src="https://github.com/API5Sem22/API5Doc/blob/main/DevOps/images/dev.png" width="400px;" alt=""/>
  </details>
  
 <p align="justify" style="font-family:roboto;"> A primeira prática que aplicamos foi um Git Workflow, uma recomendação de como usar o Git e organizar suas branches para realizar um tragalho de maneira consistente e produtiva. A estrutura das branches para versionamento de código foi dividida da seguinte maneira:</p>
  <ul>
  <li> <p align="justify" style="font-family:roboto;">main - Concentra o código de produção, só pondendo ter mudanças por pull requests (permissão para alteração) da branch develop.</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">develop - Branch destinada para testes de funcionalidades e da ferramenta como um todo, só pode ter mudanças por meio de pull requests (permissão para alteração) das branches features.</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">features - Branches com objetivo de desenvolvimentos das funcionalidades do software.</p>
  </li>
  </ul>
  
  <p align="justify" style="font-family:roboto;"> Também foi emprega o CI/CD. CI (integração contínua) é a prática de integrar alterações de código em um repositório várias vezes ao dia. CD é a entrega contínua, ocorrendo desenvolvimento de novas funcionalidades de forma constante e automatizada. O CI/CD foi realizado pela ferramenta <a href="https://circleci.com/">CircleCI</a>, tendo 3 jobs para as branches:</p>
 
   * build-and-test - Realiza o build e testes unitários, rodando apenas nas branches features e develop.
      <details>
      <summary>Job Build e Testes unitários</summary>
   
      ```yaml
      build-and-test:
        docker:
          - image: cimg/openjdk:11.0
        steps:
          - checkout
          - run:
              name: Build
              command: mvn clean package
          - run:
              name: Unit Tests
              command: mvn -Dtest="dw.servico.**" test
      ```
      </details>

   * integration-test - Realiza os testes integrados do projeto utilizando Selenium, que testam a aplicação como um todo (Front-end e Back-end), rodando apenas na branch develop.
      <details>
      <summary>Job Testes Integrados</summary>
   
      ```yaml
      integration-test:
        docker:
          - image: cimg/openjdk:11.0.10-browsers
        steps:
          - browser-tools/install-browser-tools
          - checkout
          - run:
              name: Download Selenium
              command: curl -O http://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar
          - run:
              name: Start Selenium Server
              command: java -jar selenium-server-standalone-3.141.59.jar
              background: true
          - run:
              name: Integration Tests
              command: mvn -Dtest="dw.integracaoTestes.**" test
      ```
      </details>

* build-deploy - Realiza o deploy automático do código Front-end e Back-end para nuvem no Heroku, rodando apenas na branch main.
      <details>
      <summary>Job Deploy</summary>
   
    ```yaml
    build-deploy:
      machine: true
      steps:
        - checkout
        - run:
            name: Build and push Docker image to Heroku
            command: |
              set -x
              sudo curl https://cli-assets.heroku.com/install.sh | sh
              HEROKU_API_KEY=${HEROKU_API_KEY} heroku container:login
              HEROKU_API_KEY=${HEROKU_API_KEY} heroku container:push -a datawarriors-back web
              HEROKU_API_KEY=${HEROKU_API_KEY} heroku container:release -a datawarriors-back web
    ```
     </details>
  
 <p align="justify" style="font-family:roboto;"> Ademais, realizamos uma migração do banco de dados SQL Server, utilizando a ferramenta <a href="https://www.liquibase.org/">Liquibase</a>. Essa prática auxilia na manutenção e atualização do banco de dados de maneira simples, apenas criando um novo arquivo de versão.</p>
 
<details>
  <summary>Dml.sql</summary>
   
   ```yaml
    --liquibase formatted sql
    --changeset Gabriel Ferraz:1

    insert into Carteira(crt_descricao) values('Junior');
    insert into Carteira(crt_descricao) values('Pleno');
    insert into Carteira(crt_descricao) values('Senior');
    insert into Carteira(crt_descricao) values('Especialista');

    --changeset Gabriel Ferraz:2

    insert into Cargo(car_descricao) values('Vendedor');
    insert into Cargo(car_descricao) values('Admin');
    insert into Cargo(car_descricao) values('Analista de negócios');
  ```
</details>
 
<p align="justify" style="font-family:roboto;"> Para finalizar, foi implementada a documentação das rotas fornecidades pelo back-end, uma maneira mais eficaz de identificar e testar as funcionalidades desenvolvidas. Foi empregada a ferramenta <a href="https://swagger.io/">Swagger</a> para essa finalidade.</p>
  
  <h3> Atribuições como Scrum Master</h3>
  <p align="justify" style="font-family:roboto;"> As atribuições como Scrum Master da equipe foram pertinentes a realizar um bom planejamento e organização das ações do grupo no decorrer das Sprints. No início do projeto, foi realizada uma reunião para definir nosso principal meio de comunicação e a ferramenta para monitoramento de tarefas, assim decidimos utilizar, respectivamente, o Discord e o Jira. Como Master da equipe, fiquei responsável por acompanhar e analisar o progresso do grupo nesses softwares, de modo a observar se todos os integrantes estavam participando das reuniões semanais e se apresentavam alguma dificuldade com a evolução das tarefas, logo atuando da melhor maneira de acordo com a situação.</p>
  <p align="justify" style="font-family:roboto;"> Após a apresentação do problema por parte do cliente, utilizamos a metodologia Product Backlog Building (<a href="https://www.caroli.org/livro/pbb/">AGUIAR; CAROLI, 2021</a>) para a elaboração de um Backlog conciso com as necessidades do cliente. Obtendo como resultado final desse processo as User Stories que compõe o Product Backlog e a descrição da experiência do usuário com o produto, além de promover um ótimo entendimento das regras de negócio e os primeiros questionamentos para o cliente. Com esse alinhamento inicial finalizado, as User Stories foram divididas entre as 3 Sprints do projeto, dessa forma tive a função de quebrar essas histórias em tarefas menores e mais objetivas, para um melhor desenvolvimento do que foi planejado, e também delegar essas tasks entre os integrantes da equipe.</p>
  <details>
  <summary>Clique aqui para visualizar a organização de uma Sprint no Jira</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/API5Sem-Jira1.png" width="1000px;" alt=""/>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/API5Sem-Jira2.png" width="1000px;" alt=""/>
  </details>
  
   <h2 style="font-family:roboto;"> Funcionamento :bulb:</h2>

   <div align="center">
     <h3 align="center"> Aplicação Web </h3>
     <video src="https://user-images.githubusercontent.com/61523979/191330258-23a1ef9d-3dce-4f9e-bc2d-ffdb15ee8fda.mp4" controls="controls" style="max-rate: 730px;">
     </video>    
   </div>
  <br>
   <div align="center">
     <h3> Power BI </h3>
     <video src="https://user-images.githubusercontent.com/61523979/191330330-87136600-ab66-471c-969d-80a07ac70efd.mp4" controls="controls" style="max-rate: 730px;">
     </video>    
   </div>
  
  
   
  <h2 style="font-family:roboto;"> Aprendizados Efetivos :book:</h2>   
  
  <h3 align="center"> Hard Skills </h3>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Metodologia Scrum - Scrum Master</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Java</td>
      <td>★★★★★★★★★☆</td>
    </tr>
    <tr>
      <td>Spring Boot</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Microsoft SQL Server</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Cloud</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
     <tr>
      <td>GIT</td>
      <td>★★★★★★★★★☆</td>
    </tr>
    <tr>
      <td>DevOps</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
  </table>
  
  <h3 align="center">Soft Skills</h3>
  <table align="center">
    <tr>
      <th width="300px">Habilidade</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Proatividade</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Visão de Negócio</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★★★★★☆</td>
    </tr>
    <tr>
      <td>Organização</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Planejamento</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
  </table>
  
---

 <h2 align="center"> Navegação Projetos :link:</h2>
 
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_1.md"> 1º Semestre: Assistente Virtual para Idosos - O app que facilita o uso de smartphones para usuários da terceira idade</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_2.md"> 2º Semestre: Trinity - Cadastro e análise de contas com mais simplicidade</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_3.md"> 3° Semestre: AirPLAN - O software que otimiza a criação e controle de documentos de aeronaves</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_4.md"> 4° Semestre: #VEMPRACASA - Uma plataforma de gerenciamento de eventos</a></li></p>
   <p align="justify" style="font-family:roboto;"><li>5º Semestre: Data Rangers - Ferramenta de análise de dados para prospecção de novos clientes</li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_6.md"> 6º Semestre: D-end - Processamento e análise de dados para tratamento de inconsistências</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/README.md"> Voltar para página inicial</a></li></p>

</body>
</html>
