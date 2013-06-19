Controladora de Fila Bancária
------------------------------------------------------------------------------------------------------
A aplicação proposta é um controle de uma fila bancária utilizando multithreads, tendo em conta casos específicos de clientes com níveis de prioridades maior ou menor de que outros.  

Este controle terá a informação do número de atendentes que irão iniciar o expediente e os clientes irão retirar os tickets durante o expediente, sendo esses clientes escolhidos de forma aleatória, tendo cada um seu nível de prioridade.  

Durante o horário de atendimento podem ser descartados ou inseridos atendentes, tendo em conta de que sempre haverá de ter dois atendentes em ação, um para fila de preferência normal e outro para uma fila especial, sendo que eles podem ser substituídos.  A cada hora serão gerados relatórios com dados referente ao tempo e prioridade dos tickets que foram atendidos.
