<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Agenda de Contatos</title>
  <!-- Adiciona os arquivos CSS do Bootstrap -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/css/bootstrap.min.css"/>
</head>
<body>
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
      <a class="navbar-brand" href="/admin/home">Agenda de Contatos</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link" href="/admin/cadastrar-contatos">Cadastrar Contatos</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/admin/consultar-contatos">Consultar Contatos</a>
          </li>
        </ul>
        <div class="d-flex">
          <span class="navbar-text me-3 text-white"><strong>Usuário autenticado</strong></span>
          <a class="btn text-white" href="/agendacontatos/">Sair do Sistema</a>
        </div>
      </div>
    </div>
  </nav>

  <!-- Cards -->
  <div class="container mt-4">
  
  	<div class="mt-4 mb-4">
  		<h5>Seja bem vindo a agenda de contatos!</h5>
  		<p>Acesse a opção desejada</p>
  	</div>
  
    <div class="row">
      <div class="col-md-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Cadastrar Contatos</h5>
            <p class="card-text">Clique aqui para cadastrar novos contatos.</p>
            <a href="/admin/cadastrar-contatos" class="btn btn-outline-primary">Acessar</a>
          </div>
        </div>
      </div>
      <div class="col-md-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Consultar Contatos</h5>
            <p class="card-text">Clique aqui para consultar os contatos já cadastrados.</p>
            <a href="/admin/consultar-contatos" class="btn btn-outline-primary">Acessar</a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Adiciona os arquivos JavaScript do Bootstrap -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/js/bootstrap.min.js"></script>

 </body>
 </html>


