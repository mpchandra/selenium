Feature: CRM

Scenario: Create Lead
Given login
When create lead
Then verify

Scenario: Create Account
Given login
When create account
Then verify