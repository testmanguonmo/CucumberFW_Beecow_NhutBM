@LogInBeecow
Feature: Payment feature
    As an automation tester
  I want to login success
  So that I want to verify all fields is correct message

  Background: User to navigate to Dang nhap
    Given I navigate to Beecow and click Dang nhap



  @TC_02_03_04_Input_User_invalid
  Scenario Outline: Input username with invalid
    When I input data "Username" to username
    Then Verify successfully with message "<Message 1>" and "<Message 2>"

    Examples: 
      | Username                | Message 1                | Message 2                                  |
      |                  123456 | Số điện thoại không đúng | Hãy nhập email / số điện thoại và mật khẩu |
      | 12345adbcd              | Email không đúng         | Hãy nhập email / số điện thoại và mật khẩu |
      | genymotionios@gmail.com |                          | Hãy nhập email / số điện thoại và mật khẩu |
