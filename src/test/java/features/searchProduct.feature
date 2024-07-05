Feature: Search Product on GreenCart Application
Scenario Outline: Searching for Specific Product on Application 

Given User is on GreenCart Landing Page
When user searched with Shortname <Name> and extracted actual name of product
Then user searched for same shortname <Name> in offers page 
And validate product name in offers page matches with Landing Page 

Examples: 
| Name |
| Tom |
| Beet |