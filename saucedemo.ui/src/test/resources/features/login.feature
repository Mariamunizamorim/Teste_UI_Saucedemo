#Author: Mariamunizamorim

@login
Feature: Login
Como usuario
Quero realizar login
Para acessar a conta

Background: Acessar a tela de login
Given que esteja na tela de login 

  @loginPositivo
  Scenario: Login valido
    And preencher o usuario
    And preencher a senha
    When realizar o login
    Then login realizado com sucesso
    
   
    
    
    
   
    
    


