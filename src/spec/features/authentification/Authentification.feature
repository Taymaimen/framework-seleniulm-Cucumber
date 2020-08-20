@connexion
Feature: Orange - Authentification
  ETQ Userje souhaite m'authentifier
Background:
Given Open application
    When Set UserName
    And Set Password
    And Click button Login
  @cnx
  Scenario: Orange - Authentification

    Then Show Page home
@Click1
  Scenario: Click - Link
    
    When Click on Admin Link
    
 @Click2
  Scenario: Click - Link
   When Click on Dashboard 
    
    