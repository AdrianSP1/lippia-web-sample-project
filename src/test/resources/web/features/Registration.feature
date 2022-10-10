Feature:  Pruebas sobre el registro de cuenta en la pagina my-account

  Background:
    Given El cliente se encuentra en la pagina Automation Practice
    And El cliente hace click en el boton My Account de la barra de navegacion

   Scenario Outline: El Cliente se registra de manera exitosa
      When El Cliente ingresa un mail<mail>
      And El Cliente ingresa un password<password>
      And El Cliente hace click en el boton Register para registrarse
     Then El Cliente verifica que su registro fue exitoso
     Examples:
     |            mail        |    password      |
     |pepegomez@test.com|pepegomez123|

     Scenario Outline:El Cliente intenta registrarse con mail no valido
       When El Cliente ingresa un mail no valido<invalidMail>
       And El Cliente ingresa un password<password>
       Then El Cliente hace click en el boton Register para registrarse
       Examples:
       |      invalidMail       | password |
       |pepelopez1@.com| pepe123  |