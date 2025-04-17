#Add New Users: Assign roles like Admin or ESS (Employee Self Service), link to existing employees, set username & password.
#
#Edit Users: Update user role, status, or credentials.
#
#Search Users: Filter users by role, status, employee name, or username.
#
#Delete Users: Select and delete from the user list.

how to add roles tabnames and status as constants in utils ? as those fields are fixed,
i want to keep them somewhere in constants and use in my feature/steps/page files

Feature: user actions on HRM application through Admin option

Background:
  Given hrm page is "https://opensource-demo.orangehrmlive.com"

  Scenario Outline: Add users in Admin tab
    When user logs in with <username> and <password>
    And user navigates to <tabname> tab
#    //a[@href='/web/index.php/admin/viewAdminModule']//span[text()='Admin']
#  /web/index.php/pim/viewPimModule ...PIM
#    //div[contains(@class,'oxd-topbar-header-title')]//h6[1]
    Then user should land on <tabname> succesfully
    When User clicks on Add User button
    And User fills details with username password empname for "<role>" and "<status>"
    And User clicks on Save button
    Then user should be listed in the records table with <role>
    Examples:
      | username | password | tabname | role | status |
      | Admin | admin123 | ADMIN_TAB | ROLE_ADMIN | STATUS_ENABLED |


#    And add new user <username1> <role> <empname> <status>
#    And add user details <role> <status> <empname> <username1> <password1>
##    //button[@type='submit']............//label[text()='User Role']//..//..//..//div[contains(@class,'oxd-select-wrapper')]
#    Then user should be seen under records table with <username1> <role> <empname>





