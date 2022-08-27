#language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro_sucesso
    Cenario: Registrar um novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro do usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Então vejo cadastro realizado com sucesso

    @cadastro_sucesso2
    Cenario: Registrar um novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro do usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Então vejo cadastro realizado com sucesso