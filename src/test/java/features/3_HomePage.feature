@HomePage
Feature: Create customer
    As an automation tester
  I want to create new product
  So that I want to verify all fields is correct message

Background: User to navigate to Dang san pham moi page
    Given I click Kenh ban hang label

@TC_01_Verify_Current_link
  Scenario: Verify current url
    When i click Dang san pham label
    Then I verify link current
    