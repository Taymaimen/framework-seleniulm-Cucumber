@connexion
Feature: Orange - Authentification
  ETQ Userje souhaite m'authentifier

  @cnx
  Scenario: Orange - Authentification
    Given Open application
    When Set UserName
    And Set Password
    And Click button Login
    Then Show Page home
