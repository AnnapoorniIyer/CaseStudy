Feature: Conduit CRUD Functions

Scenario: Login into App
Given User is on Login page
When User provides "poornianu7@gmail.com" and "annu@2003"
Then User should be on Home Page 

Scenario: Create new Article
Given User should be on New Article Page
When enters Article details
| title | Desc | Content |tag |
| Test125 Title | Test125 Desc | Content125 |Tag |
Then Article must be created

Scenario: View Article
Given User should be on Global Feed page
When enters select an article "Test125 Title"
Then Article details page must be created


Scenario: Update an Article
Given Article detail page must be displayed
When User update article details
| title | Desc | Content |
| New Selenium Test  | New Test Description | New Test Content |
Then Article details page must be updated

Scenario: Delete an Article
Given Article detail page must be displayed
When User Delete article
Then Article must be deleted




