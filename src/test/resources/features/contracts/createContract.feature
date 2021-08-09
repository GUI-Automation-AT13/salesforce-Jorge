Feature: Create Contract

  Scenario: create a contract with only required fields
    Given I login to SalesForce.
    And I navigate to the "Contract" page
    When I create a new contract with required fields
      | Account Name           | TestAccount |
      | Contract Term (months) | 2           |
      | Contract Start Date    | 7/15/2021   |
    Then I verify the Contract created with the set fields
      | Account Name           | TestAccount |
      | Contract Term (months) | 2           |
      | Contract Start Date    | 7/15/2021   |

  Scenario: create a contract with all required fields
    Given I login to SalesForce.
    And I navigate to the "Contract" page
    When I create a new contract with required fields
      | Account Name            | TestAccount         |
      | Contract Term (months)  | 2                   |
      | Contract Start Date     | 7/15/2021           |
      | Customer Signed By      | TestContact         |
      | Customer Signed Title   | tittle              |
      | Customer Signed Date    | 7/15/2021           |
      | Price Book              | Standard            |
      | Owner Expiration Notice | 30 Days             |
      | Company Signed Date     | 7/19/2021           |
      | Special Terms           | Special Terms       |
      | Description             | Description         |
    Then I verify the Contract created with the set fields
      | Account Name            | TestAccount         |
      | Contract Term (months)  | 2                   |
      | Contract Start Date     | 7/15/2021           |
      | Customer Signed By      | TestContact         |
      | Customer Signed Title   | tittle              |
      | Customer Signed Date    | 7/15/2021           |
      | Price Book              | Standard            |
      | Owner Expiration Notice | 30 Days             |
      | Company Signed Date     | 7/19/2021           |
      | Special Terms           | Special Terms       |
      | Description             | Description         |