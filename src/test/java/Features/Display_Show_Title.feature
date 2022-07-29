
Feature: verifying the click functionality of Display_Show_Title option in App section of ApiDemo application.
         

  @test3
  Scenario: Display_show_title Check
  
    Given application has already opened
    When user tap on the App section of app
    And tap on the Action Bar option
    And tap on the Display Option 
    And as click on Display Show Title button
    Then path of that button starts toggling on the top

 
