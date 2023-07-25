@StationFinder
Feature: Station Finder

  
  Background:
    Given user is on NLID screen

  @P11270-13163 @IosRegression @AndroidRegression
  Scenario: Stations accepting Mobile pay should have Nectar points in the filter options
  Given Login to ESSO app
  When Stations accepting Mobile pay should have Nectar points in the filter options
  
#  @P11270-560 @IosRegression @AndroidRegression
  @P11270-13157
  Scenario: Station Finder : Select the Nectar points service in Filter options
  Given Login to ESSO app
  When Stations accepting Mobile pay should have Nectar points in the filter options
  Then From LID screen reach Station finder