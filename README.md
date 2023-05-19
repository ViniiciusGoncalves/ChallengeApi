<h1>Descrição do Projeto</h1>

<h2>Objetivo e escopo do HeartMeOut</h2>

O objetivo deste projeto é desenvolver uma aplicação de chatbot com funcionalidades de reconhecimento de fala e resposta utilizando as APIs do Google Cloud Speech-to-Text e OpenAI GPT-3.
A aplicação permitirá que os usuários enviem mensagens de texto ou áudio para o chatbot, que será capaz de converter o áudio em texto usando o serviço de reconhecimento de fala do Google
Cloud e gerar uma resposta adequada utilizando a API do GPT-3.

<h2>Arquitetura da API do HearMeOut</h2>

<ul>
  <li><b>Servidor de Aplicação:<b/> Responsável por receber as requisições do front-end e encaminhá-las para o serviço adequado. Também lida com a lógica de negócio, como o processamento das mensagens 
    e o gerenciamento do histórico de conversas.
  </li>
    
   <li>
    <b>Google Cloud Speech-to-Text:</b> Serviço de reconhecimento de fala fornecido pelo Google Cloud. É utilizado para converter os áudios enviados pelos usuários em texto.
  </li>
  
  <li>
    <b>Google Cloud Text-to-Speecht:</b> Serviço de reconhecimento de texto fornecido pelo Google Cloud. É utilizado para converter os texto enviados pelos usuários em audio.
  </li>
  
  <li>
    <b>OpenAI GPT-3:</b> API do GPT-3 fornecida pela OpenAI. É utilizado para gerar respostas automáticas com base nas mensagens recebidas.
  </li>

</ul>

A comunicação entre os componentes é feita através de requisições HTTP.


<h2>Endpoints</h2> 

1. Enviar mensagem<br/>
Endpoint: /hearmeout/messages/send<br/>
Verbo HTTP: POST<br/>

Parâmetros:
•	user_id: ID do usuário que envia a mensagem (string, obrigatório)<br/>
•	message: Texto da mensagem enviada pelo usuário (string, obrigatório)<br/>

Respostas:
•	200 OK: Mensagem enviada com sucesso.<br/>
•	400 Bad Request: Parâmetros ausentes.<br/>
•	500 Internal Server Error: Erro no processamento da mensagem.<br/>

2. Obter histórico de mensagens<br/>
Endpoint: /hearmeout/messages/history<br/>
Verbo HTTP: GET<br/>

Parâmetros:<br/>
•	user_id: ID do usuário para o qual o histórico de mensagens será retornado (string, obrigatório)<br/>

Respostas:<br/>
•	200 OK: Histórico de mensagens obtido com sucesso.<br/>
•	400 Bad Request: Parâmetros ausentes.<br/>
•	500 Internal Server Error: Erro ao recuperar o histórico de mensagens.<br/>

3. Ativar/Desativar funcionalidade de voz<br/>
Endpoint: / hearmeout /voice/toggle<br/>
Verbo HTTP: PUT<br/>

Parâmetros:
•	user_id: ID do usuário que deseja ativar/desativar a funcionalidade de voz (string, obrigatório)
•	enabled: Estado da funcionalidade de voz (boolean, obrigatório)

Respostas:<br/>
•	200 OK: Funcionalidade de voz ativada/desativada com sucesso.<br/>
•	400 Bad Request: Parâmetros ausentes.<br/>
•	500 Internal Server Error: Erro ao alternar a funcionalidade de voz.<br/>

<h2>Próximos Passos<h2/>
  
  <ul>
    <li>Implementar a lógica de conversão de áudio em texto usando o Google Cloud Speech-to-Text.</li>
    <li>Criar a interface do cliente na web para melhorar a experiência do usuário.</li>
  </ul>
  
  
<h2>Participantes do grupo</h2>
  
  
  <ul>
    <li>GUILHERME HENRIQUE MELO DE OLIVEIRA – RM: 95184</li>
    <li>GUILHERME LUCAS ARTIGIANI – RM: 94322</li>
    <li>LUCAS VINICIUS OLIVEIRA GALINDO – RM: 95177</li>
    <li>MARCUS VINICIUS DAGOSTINI – RM: 94279</li>
    <li>THIAGO RIBEIRO DA COSTA – RM: 92800</li>
    <li>VINICIUS GONÇALVES CARNEIRO – RM: 94154</li>
    <li>TURMA - 2TDST</li>
  </ul>


