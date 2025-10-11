Feature: REST API endpoints

  Scenario: Client gets version
    When the client calls /version
    Then the client receives status code of 200
    And the client receives server version 1.0

  Scenario: Client checks server status
    When the client calls /status
    Then the client receives status code of 200
    And the client receives server response "OK"

  Scenario: Client greets a name
    When the client calls /greet?name=Alex
    Then the client receives status code of 200
    And the client receives server response "Hello, Alex!"
