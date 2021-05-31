Feature: For Traveling Notarization entry
  As a user I should be able to go to Homepage, click on Traveling Notarization, enter a valid address and click next


  @current
  Scenario: Testing Real Estate Refinance

    Given The user is on the Order info page
    When The user clicks on Real Estate and Refinance
    Then The user selects Home buyer/seller from the dropdown menu
    And In Additional Services increases Printing by five and decreasing by two and verifies the price
    And In Additional Services increases Drop off at post office by ten and decreases by three and verifies the price
    And Uploads a document
    And Clicks next and verifies that the user is on the Data/Info Page


