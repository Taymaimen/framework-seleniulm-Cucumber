@formulaire
Feature: Patient - FullName
ETQ User je souhaite de remplir le nom du patient

@form
Scenario: Patient - FullName
Given Open patient application
When Set FirstName
And Set LastName
And Click button Submit
Then Show an error message