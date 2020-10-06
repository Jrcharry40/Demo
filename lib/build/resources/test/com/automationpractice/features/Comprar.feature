#language:en

Feature: Camprar articulo
Como usuario registrado, quiero realizar una compra de un articulo

Background:
Given que voy a la pagina de inicio de Automation Practice
When escribo mis credenciales, luego hacemos clic en iniciar sesion
|email|password|
|gabo@gmail.com|123456|

@RealizarCompra
Scenario: Realizar compra de un articulo
When Selecciono el articulo de interes y registro mi compra
Then Deberia ver mi transaccion completa
