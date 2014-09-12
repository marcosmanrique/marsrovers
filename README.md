MarsRovers
==========
Basicamente utilizei spring-mvc para a camada web, não me preocupando com a parte estética da tela.
Criei todos os testes unitários utilizando JUnit.

Preparação eclipse:
- Baixar plugin Jetty;

Teste Web:

Importar Maven Project, executar o seguinte comando:
mvn clean install jetty:run

Acessar a seguinte URL:
http://localhost:8080/robot/

Teste JUnit:

Importar Maven Project, executar o seguinte comando:
mvn clean install