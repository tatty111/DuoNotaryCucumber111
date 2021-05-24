Feature: Search functionality

  Scenario: search for a product using a search bar
    Given The user is on the homepage
    When  user eneters a term Blouse on a search bar
    Then  the search result should contain the term Blouse


  Scenario: search for a product using invalid search term
    Given The user is on the homepage
    When  User eneters a term jhfldyucljhv on a search bar
    Then  the error message should be displayed

