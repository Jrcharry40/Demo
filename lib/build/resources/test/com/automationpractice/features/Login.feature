#language:en

Feature: Inicio de Sesion
Como usuario registrado, quiero iniciar sesion en el portal de automation practice

@InicioDeSesionExitoso
Scenario: Inicio de sesion en Automation Practice
Given que voy a la pagina de inicio de Automation Practice
When escribo mis credenciales, luego hacemos clic en iniciar sesion
|email|password|
|gabo@gmail.com|123456|
Then deberia ver mi nombre registrado

@inicioSesionFallido
  Scenario Outline: Inicios de sesion fallidos
    When escribo mi credenciales erroneas, luego hacemos clic en iniciar sesion
      | email   | password   |
      | <email> | <password> |
    Then deberia ver error en el login

    Examples: 
      | email             | password |
      | gaboxxx@gmail.com | lperez   |
      | gbetancb          | gbetancb |