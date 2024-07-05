Feature: Search Product on GreenCart Application
Scenario Outline: Searching for Specific Product on Application 

Given User is on GreenCart Landing Page
When user searched with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then user proceed to checkout and validate the <Name> items in checkout page 
And verify user has ability to enter promo code and place the order

Examples: 
| Name |
| Tom |
| Beet |