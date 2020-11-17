Feature:  Open Subscription Page
  # Testcase 1
  Scenario Outline: Check format email when input regsister textbox
    Given Open web testmaster.vn
    When input email don't matching format <inputText> on the textbox
    Then Message "* Email không đúng định dạng"
    And Show color of bold text error "rgb(255, 0, 0)" is show

    Examples:

      | inputText |
      | Abc       |
      | ........  |
    # Testcase 2

  Scenario: Check email exists
    Given Open web page
    When input email exists  "khanh.tx@live.com" on the textbox
    Then Message "E-mail khanh.tx@live.com đã được sử dụng, bạn hãy chọn một E-mail khác" is show
    When click on button accept
    Then focus set on the filed Email
    Then Text of email will clear

  @Testcase3

  Scenario: Check email valid
    Given Open web page
    When input email valid  "Thuonglv@gmail.com" on the textbox
    Then informantion screen is display "Để phục vụ bạn được tốt hơn, bạn vui lòng cung cấp thêm các thông tin bên dưới."
    And default vaule is focus on the "Không xác định" of gender textbox
    And default vaule is focus on the "Nhận tất cả các loại tin" of field Fullname
    And default vaule is focus mouse on the Fullname fields

     # Testcase 4

    When don't input email and click on button Accpect screen information
    Then Message error screen  "* Bạn cần phải nhập dữ liệu" is show
    And highlight color on the Fullname fields



