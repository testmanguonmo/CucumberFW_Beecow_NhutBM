Feature: Payment feature
    As an automation tester
  I want to login success
  So that I want to verify all fields is correct message

  Background: User to navigate to Login page
    Given I navigate to Beecow "https://www.beecow.com/market"
    And I click Dang nhap

  @TC_02_03_04_Input_invalid
  Scenario Outline: Input username with invalid
    When I input data "<UserName>" to username
    And I input data "<PassWord>" to password
    And i click button Dang Nhap on popup
    Then Verify successfully with message "<Message1>" and "<Message2>"

    Examples: 
      | UserName                | PassWord  | Message1                                   | Message2                                   |
      |                         |           | Hãy nhập email / số điện thoại và mật khẩu |                                            |
      |                    1234 |           | Số điện thoại không đúng                   | Hãy nhập email / số điện thoại và mật khẩu |
      | 1234abcd                |           | Email không đúng                           | Hãy nhập email / số điện thoại và mật khẩu |
      | genymotionios@gmail.com |           |                                            | Hãy nhập email / số điện thoại và mật khẩu |
      | genymotionios@gmail.com |       123 | Tối thiểu 6 ký tự                          | Hãy nhập email / số điện thoại và mật khẩu |
      | genymotionios@gmail.com |    123456 |                                            | Sai email / số điện thoại hoặc mật khẩu    |
      | genymotionios@gmail.com | 1234@abcd |                                            |                                            |
