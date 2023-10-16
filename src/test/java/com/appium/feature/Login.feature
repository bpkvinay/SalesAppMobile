Feature: SalesApplication

  
 Background: Login Sales Applications
 
  Scenario Outline: Verify the Homepage when user login to applications
    Given when user click on LoginButton
    When user enter "<EmployeeID>" in EmployeeID TextField
    Then user click on sendotp button
    And user enter "<otp>" to OtpTextFeild
    And user click on verify button
    Then user lands to homepage

    Examples: 
      | EmployeeID | otp    |
      | ng2011     | 123456 |
  
  
 
  Scenario Outline: Verify Fresh Lead is Created Succesfully, Fetching LeadId From CRMDatabase With Refrence Of MobileNumber
    Given user lands to homepage
    When user click addition sign from dashboard page
    And Select  "<option>" from createoptiondropdown from dashboard page
    And select "<leadsource>" from choose an option dropdown
    And select "<visitdate>" from visit date dropdown
    And select "<visitlocation>" from visit location dropdown
    And Enter "<firstname>" in Firstnametextfeild
    And Enter "<lastname>" in lastnametextfeild
    And Enter  mobilenumber in mobilenumbertextfeild
    And Enter "<pannumber>" in pannumbertextfeild
    And Enter "<Email>" in Emailtextfeild
    And Enter "<tradingname>" in Tradingnametextfeild
    And Select "<controlledprogram>" from controlledprogramdropdown
    And Select "<Industry>" from Industrydropdown
    And Select "<purposeofloan>" from Purposeofloandropdown
    And Select "<BuisnessEntity>" from buisnessenitydropdown
    And Select "<NatureofBuisness>" from natureofbuisnessdropdown
    And Enter "<BuisnessYears>" in buisnessyearstextfeild
    And Enter "<Loanamount>" in Loanamounttextfeild
    And Enter "<Averagesalespermonth>" in averagesalesmonthTF
    And Enter "<postalcode>" in postalcodeTF
    And Select "<City>" from Citydropdown
    And Enter "<street>" in streettextfeild
    And Click on submit button
    Then Fetching the leadid from CRM database using mobilenumber

    Examples: 
      | leadsource | visitdate | visitlocation      | firstname | lastname | pannumber  | Email           | tradingname | controlledprogram | Industry | BuisnessYears | Loanamount | Averagesalespermonth | street                | postalcode | purposeofloan | BuisnessEntity | NatureofBuisness | City      |
      | MARKETING  | 12jan2023 | CUSTOMER RESIDENCE | vinay     | gaonkar  | BFJKL3456D | vinay@gamil.com | smile       | RETAIL            | APPAREL  |             5 |     200000 |               240000 | avenue rooad,1stcross |     560040 | EXPANSION     | HUF            | RETAILER         | BANGALORE |

  Scenario Outline: Verify Lead Should Not be Created,when User Updating Same Existing MobileNumber
    Given user lands to homepage
    When user click addition sign from dashboard page
    And Select  "<option>" from createoptiondropdown from dashboard page
    And select "<leadsource>" from choose an option dropdown
    And select "<visitdate>" from visit date dropdown
    And select "<visitlocation>" from visit location dropdown
    And Enter "<firstname>" in Firstnametextfeild
    And Enter "<lastname>" in lastnametextfeild
    And Enter  "<mobilenumber>" in mobilenumbertextfeild
    And Enter "<pannumber>" in pannumbertextfeild
    And Enter "<Email>" in Emailtextfeild
    And Enter "<tradingname>" in Tradingnametextfeild
    And Select "<controlledprogram>" from controlledprogramdropdown
    And Select "<Industry>" from Industrydropdown
    And Select "<purposeofloan>" from Purposeofloandropdown
    And Select "<BuisnessEntity>" from buisnessenitydropdown
    And Select "<NatureofBuisness>" from natureofbuisnessdropdown
    And Enter "<BuisnessYears>" in buisnessyearstextfeild
    And Enter "<Loanamount>" in Loanamounttextfeild
    And Enter "<Averagesalespermonth>" in averagesalesmonthTF
    And Enter "<postalcode>" in postalcodeTF
    And Select "<City>" from Citydropdown
    And Enter "<street>" in streettextfeild
    And Click on submit button
   

    Examples: 
      | leadsource | visitdate | visitlocation      | firstname | lastname | mobilenumber | pannumber  | Email           | tradingname | controlledprogram | Industry | BuisnessYears | Loanamount | Averagesalespermonth | street                | postalcode | purposeofloan | BuisnessEntity | NatureofBuisness | City      |
      | MARKETING  | 12jan2023 | CUSTOMER RESIDENCE | vinay     | gaonkar  |   9876541472 | BFJKL3456D | vinay@gamil.com | smile       | RETAIL            | APPAREL  |             5 |     200000 |               240000 | avenue rooad,1stcross |     560040 | EXPANSION     | HUF            | RETAILER         | BANGALORE |
