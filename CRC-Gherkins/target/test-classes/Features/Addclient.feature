Feature: I want to add new client

  Scenario: I want to add new client in the Client module
    Given Select client tab
    Then Click on Add new client button
    And Pass the client First name
    And Pass client Last name
    And Click on Email Checkbox
    And Click on Save button
    And Click on Ok button in the warining popup
    Then User should navigate to client dashboard
    When user clicks on clients tab
    And user enters Client name in search field
    And click beside
    And user clicks on search button
    And user click on client dropdown
    And user clicks on delete button
    Then click on deletethisclientbutton
