<html>
<body>
  
  <h1 align="center"> API 4º Semestre - 02/2021</h1>
<a href="https://github.com/GabrielSG20/API4Sem2021"><img src="https://img.shields.io/badge/GitHub-Repositório Projeto-181717?style=for-the-badge&logo=github"></a>

  <h2> Parceiro Acadêmico: <a href="https://www.oracle.com/br/index.html">Oracle</a></h2>
  
  <h2 style="font-family:roboto;"> Resumo do Projeto :clipboard:</h2>
  
  <p align="justify" style="font-family:roboto;"> :calendar: <b>#VEMPRACASA</b> é uma parceria entre a <a href="https://www.oracle.com/br/index.html">Oracle</a> e a FATEC São José dos Campos com a finalidade de desenvolvimento de um sistema para realização de agendamentos de eventos nos espaços da Casa Oracle, seguindo as normas vigentes de ocupação por conta da Pandemia do Coronavírus. O sistema foi planejado com uma série de funcionalidades com objetivo de deixar mais intuitivo e produtivo o cadastro e participação de eventos nos dois espaços disponíveis (Open Space e Lounge on Hall). Essas funções estão divididas entre os tipos de usuários do sistema, que são: Admin, Organizador, Interno e Externo.</p>
  <p align="justify" style="font-family:roboto;"> O Admin é quem tem o controle sobre a aprovação ou recusa de eventos no calendário, podendo priorizar os que estiverem marcados na mesma data, hora e local, além de ter acesso à relatórios sobre os eventos realizados e conseguindo cadastrar novos fornecedores (empresas terceirizadas) para apoio aos organizadores. O Usuário Organizador poderá agendar eventos nos espaços diponíveis preenchendo as informações necessárias, podendo criar uma lista de convidados adicionando os e-mails dos remententes no cadastro, além de ser capaz de visualizar os contatos dos fornecedores disponíveis. O Interno conseguirá se inscrever para eventos abertos ao público em geral ou os quais foi convidado, também tem acesso a solicitar permissão para se tornar Oraganizador, visto que é obrigatório esse usuário ter um e-mail Oracle. Já o Externo se destinará ao público em geral que deseja participar dos eventos abertos, sendo capaz de apenas visualizar o calendário e se inscrever nas palestras de seu interesse.</p>
  
  <h2 style="font-family:roboto;"> Tecnologias Adotadas :computer:</h2>
   
  <ul>
  <li><a href="https://www.java.com/pt_BR/">Java</a>:
    <p align="justify" style="font-family:roboto;"> Linguagem de programação utilizada para o desenvolvimento Back-End do sistema, apresenta como principais características: Portabilidade, Robustez, Segurança, Orientação a Objetos, Dinâmica e Alto Desempenho. Foi um requisito técnico solicitado pelo cliente.</p></li>
    
  <li><a href="https://spring.io/">Spring Boot</a>:
    <p align="justify" style="font-family:roboto;"> É um framework open source para Java, aplicado para facilitar a configuração e gerenciamento das dependências do projeto. Logo melhorando a produtividade e agilidade no processo de desenvolvimnto da aplicação.</p></li>
    
  <li><a href="https://angular.io/">Angular</a>:
    <p align="justify" style="font-family:roboto;"> O Front-End do projeto foi realizado com Angular, uma framework para desenvolvimento de aplicações web com um código open source com base em TypeScript, foi escolhido pela equipe pela possibilidade de criação de páginas dinâmicas e otimização de trabalho com reescrita de código.</p></li>
    
  <li><a href="https://miragejs.com/">MirageJS</a>:
   <p align="justify" style="font-family:roboto;"> É uma biblioteca de simulação de API (Application Programming Interface) que permite construir, testar e compartilhar um aplicativo JavaScript funcional completo sem ter que depender de nenhum Back-End. Foi empregado para realização de testes das telas do Front-End, no momento em que não existia conexão com o Back-End.</p></li>
      
  <li><a href="https://www.oracle.com/tools/downloads/sqldev-downloads.html">Oracle SQL Developer</a>:
  <p align="justify" style="font-family:roboto;"> Na parte de armazenamento de dados, foi utilizado o Oracle Database 12c, um SGBD relacional, escolhido por atender todas as necessidades do projeto e ser uma ferramenta da empresa parceira. Para trabalhar com scripts SQL nessa Base de Dados selecionada, usamos o Oracle SQL Developer, um ambiente de desenvolvimento integrado com o Bancos de Dados Oracle.</p></li>
        
  <li><a href="https://www.figma.com/">Figma</a>:
  <p align="justify" style="font-family:roboto;"> É uma ferramenta para projetos UI com excelentes recursos de Design, Prototipagem, Colaboração, Plug-in de Sistema de Projeto, entre outros. Foi empregado pela nossa equipe para realização da metodologia Product Backlog Building (PBB) e criação das Wireframes.</p></li>
          
  <li><a href="https://vempracasa.atlassian.net/">Jira</a>:
  <p align="justify" style="font-family:roboto;"> Foi utilizado como ferramenta do método Scrum para distribuição das atividades do grupo e priorização das demandas. Possibilitando realizar o planejamento das sprints, sendo capaz de registrar o progresso da equipe e do projeto, facilitando o desenvolvimento e acompanhamento da realização de tarefas.</p></li>
       
  <li><a href="https://www.oracle.com/br/cloud/">Oracle Cloud</a>:
   <p align="justify" style="font-family:roboto;"> É um serviço de computação em nuvem oferecido pela Oracle Corporation. Foi usado para o deploy do Back-End e Banco de Dados Oracle do projeto.</p></li>
       
  <li><a href="https://www.heroku.com/platform">Heroku</a>:
   <p align="justify" style="font-family:roboto;"> É uma plataforma em nuvem com um serviço que suporta várias linguagens de programação, nela foi realizado o deploy do Front-End da aplicação.</p></li>
  </ul>
 
  
  <h2 style="font-family:roboto;"> Contribuições Individuais :dart:</h2>
  
  <h3> Atribuições como Desenvolvedor Back-end</h3>
  <p align="justify" style="font-family:roboto;"> Como Desenvolvedor Back-End, as atribuições foram relacionadas com a elaboração da lógica do sistema web planejado, tendo em vista as regras de negócio propostas pelo cliente. Com a criação dos Endpoints utilizados na interação com o Front-End, foi obtida uma solução completa com todas as funcionalidades necessárias.</p>
  
  <p align="justify" style="font-family:roboto;"> O primeiro passo foi a configuração do ambiente Java, para qual, foi utilizado o <a href="https://start.spring.io/">Sprint Initializr</a> para estruturar o projeto com Spring Boot 2.5.4, Java 8 e Maven. Logo, adicionamos todas as dependências necessárias no arquivo POM.xml, sendo as mais importantes: o driver de conexão com o Banco de Dados Oracle (ojdbc8), o JPA (spring-boot-starter-data-jpa) e o Spring Boot Starter Web (spring-boot-starter-web).</p>
  
  <p align="justify" style="font-family:roboto;"> Com isso finalizado e versionado no GitHub, focamos em decidir a Arquitetura e padrões de projetos que implementaríamos. Logo, optamos pela arquitetura Modelo-Visão-Controle (MVC), em que separamos o sistema em componentes interligados que são essenciais para uma melhora na conexão entre as camadas de dados, lógica de negócio e iteração com o usuário.</p>
  <details>
  <summary>Clique aqui para visualizar a Lógica Arquitetural MVC</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/DiagramaArq.png" width="500px;" alt=""/>
  </details>
  
  <ul>
  <li> <p align="justify" style="font-family:roboto;">Model: são representações das tabelas do Banco de Dados Oracle, tendo seus campos e relações mapeadas pelo Hibernate. Resultando em uma melhor validação dos dados e facilitação com consultas, inserções e atualizações na Database;</p>
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
  
   <p align="justify" style="font-family:roboto;"> Também, foi necessário realizar uma configuração de Cors, que verifica a real origem, métodos HTTP e cabeçalhos de uma determinada solicitação enviada para o Back-End. Sendo fundamental para conexão com o Front-End, porque permite que a rota utilizada no Angular consiga fazer requisições e receber suas respostas.</p>
  <details>
  <summary>Clique aqui para visualizar a configuração dos Cors</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/Config-Cors.png" width="800px;" alt=""/>
  </details>
  
  <p align="justify" style="font-family:roboto;"> A seguir foram configuradas as Properties, para as quais foram aplicadas a conexão com a Base de Dados Oracle que está em
  nuvem no Oracle Cloud, por meio do sistema de Wallet. Além de declarar: o driver utilizado (oracle.jdbc.OracleDriver), a versão da linguagem do Banco (Oracle12cDialect), a maneira que o hibernate vai ler os Models (validate) e a porta que será rodado o serviço (PORT:8080).</p>
  <details>
  <summary>Clique aqui para visualizar as Properties</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/Properties-VPC.png" width="800px;" alt=""/>
  </details>
  
  <p align="justify" style="font-family:roboto;"> Por fim, colaborei com o deploy do Front-End no Heroku, por meio do método manual usando uma branch do GitHub do projeto. Com isso o sistema ficou 100% hospedado em nuvem e disponível pelo seguinte link: <a href="http://vempracasa.herokuapp.com/">#VEMPRACASA</a></p>
  <details>
  <summary>Clique aqui para visualizar o deploy no Heroku</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/Heroku.png" width="1000px;" alt=""/>
  </details>
  
  <h3> Atribuições como Scrum Master</h3>
  <p align="justify" style="font-family:roboto;"> As atribuições como Scrum Master da equipe foram pertinentes a realizar um bom planejamento e organização das ações do grupo no decorrer das Sprints. No início do projeto, foi realizada uma reunião para definir nosso principal meio de comunicação e a ferramenta para monitoramento de tarefas, assim decidimos utilizar, respectivamente, o Discord e o Jira. Como Master da equipe, fiquei responsável por acompanhar e analisar o progresso do grupo nesses softwares, de modo a observar se todos os integrantes estavam participando das reuniões semanais e se apresentavam alguma dificuldade com a evolução das tarefas, logo atuando da melhor maneira de acordo com a situação.</p>
  <p align="justify" style="font-family:roboto;"> Após a apresentação do problema por parte do cliente, utilizamos a metodologia Product Backlog Building (<a href="https://www.caroli.org/livro/pbb/">AGUIAR; CAROLI, 2021</a>) para a elaboração de um Backlog conciso com as necessidades do cliente. Obtendo como resultado final desse processo as User Stories que compõe o Product Backlog e a descrição da experiência do usuário com o produto, além de promover um ótimo entendimento das regras de negócio e os primeiros questionamentos para o cliente. Com esse alinhamento inicial finalizado, as User Stories foram divididas entre as 4 Sprints do projeto, dessa forma tive a função de quebrar essas histórias em tarefas menores e mais objetivas, para um melhor desenvolvimento do que foi planejado, e também delegar essas tasks entre os integrantes da equipe.</p>
  <details>
  <summary>Clique aqui para visualizar a organização de uma Sprint no Jira</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/GabrielSG20/Portfolio/blob/main/images/Jira.png" width="1000px;" alt=""/>
  </details>
  
   <h2 style="font-family:roboto;"> Funcionamento :bulb:</h2>

   <div align="center">
     <video src="https://user-images.githubusercontent.com/61523979/189658833-ef25e07d-417e-4832-8a5b-7613ce5d8853.mp4" controls="controls" style="max-rate: 730px;">
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
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Java</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Spring Boot</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Oracle</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Cloud</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
     <tr>
      <td>GIT</td>
      <td>★★★★★★★★☆☆</td>
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
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★★★★☆☆</td>
    </tr>
    <tr>
      <td>Organização</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Planejamento</td>
      <td>★★★★★★★☆☆☆</td>
    </tr>
  </table>
  
---

 <h2 align="center"> Navegação Projetos :link:</h2>
 
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_1.md"> 1º Semestre: Assistente Virtual para Idosos - O app que facilita o uso de smartphones para usuários da terceira idade</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_2.md"> 2º Semestre: Trinity - Cadastro e análise de contas com mais simplicidade</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_3.md"> 3° Semestre: AirPLAN - O software que otimiza a criação e controle de documentos de aeronaves</a></li></p>
   <p align="justify" style="font-family:roboto;"><li>4° Semestre: #VEMPRACASA - Uma plataforma de gerenciamento de eventos</li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_5.md"> 5º Semestre: Data Rangers - Ferramenta de análise de dados para prospecção de novos clientes</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/API_6.md"> 6º Semestre: D-end - Processamento e análise de dados para tratamento de inconsistências</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/GabrielSG20/Portfolio/blob/main/README.md"> Voltar para página inicial</a></li></p>

</body>
</html>
