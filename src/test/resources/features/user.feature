Feature: User functionality

  Scenario Outline: As a user I want register

    Given I create user with userAge <userAge>, userEmail <userEmail>, userName <userName>
    Then I see my newly user created

    Examples:
      | userAge | userEmail                      | userName |
      | 20      | jaime.gomez.moraleda@gmail.com | Jaime    |