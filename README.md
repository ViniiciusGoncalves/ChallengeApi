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



