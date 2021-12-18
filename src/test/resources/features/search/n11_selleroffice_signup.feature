Feature: n11 signup
#https://so.n11.com/
@selleroffice-signup
Scenario: n11 selleroffice signup
  Given user launch browser and open the signup page
  When user tries to sign up
  Then user should see validation errors
