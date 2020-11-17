Feature: login and action on the Banggood
  #  Testcase 2
  Scenario: Show messsage when click on Sign in with case password and user blank
    Given Goto Banggood login page
    When the user attempt login with user blank and passowrd blank
    Then The message "Vui lòng nhập email."  user
    And The message "Xin vui lòng nhập mật khẩu." pw
    # Testcase 3
  Scenario: show suggestion when input email
    Given keep home page of banggood
    When  input username  on the textbox
    Then the suggestion is shown correct
    And Can choose item matched with suggestion