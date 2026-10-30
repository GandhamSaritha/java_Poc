**Bank Loan Eligibility Checker**

A Java console-based Proof of Concept (POC) that evaluates preliminary loan eligibility using predefined business rules.

Overview:
The Bank Loan Eligibility Checker collects applicant information and evaluates preliminary eligibility based on age, monthly income, employment type, work experience, existing loan obligations, credit score, and requested loan amount.
This project demonstrates fundamental Core Java concepts, conditional logic, and rule-based decision-making.

Features:
 - Validates applicant age.
 - Checks the minimum monthly income.
 - Supports salaried and self-employed applicants.
 - Validates employment or business experience.
 - Checks existing monthly EMI obligations.
 - Evaluates the applicant's credit score.
 - Validates the requested loan amount.
 - Displays eligibility or rejection messages.
   
Technology Stack:
 - Programming Language: Java
 - Application Type: Console-based application
 - Input Handling: Java Scanner class
 - IDE: Eclipse
 - Version Control: Git and GitHub

Eligibility Criteria:
 - Criteria	Requirement
 - Age	21 to 60 years
 - Minimum monthly income	₹25,000
 - Salaried work experience	At least 1 year
 - Business experience	At least 2 years
 - Minimum credit score	700
 - Existing monthly EMI	Maximum 40% of monthly income
 - Requested loan amount	Up to ₹5,00,000

Note: The EMI condition applies only to applicants who report existing loans in the current implementation.

Application Workflow: 
1.Enter the applicant's full name and age.
2.Validate the age requirement.
3.Enter and validate monthly income.
4.Select salaried or self-employed status.
5.Enter work or business experience.
6.Provide details about existing loans.
7.If applicable, validate the existing monthly EMI.
8.Enter the credit score.
9.Enter the requested loan amount.
10.Display the preliminary screening result.

Sample Output:

1. Salaried Employee
What is your fullname?
user1
What is your age?
33
What is your monthly income?
30000
Are you a salaried employee or self-employed? (type salaried or self)
salaried
How many years have you worked at your current company?
2
Do you currently have any existing loans? Enter yes or no.
no
What is your credit score?
750
What loan amount do you require?
100000
Congratulations! You are eligible for preliminary loan screening.

2. Self-Employed Applicant
What is your fullname?
user2
What is your age?
26
What is your monthly income?
40000
Are you a salaried employee or self-employed? (type salaried or self)
self
How many years have you been running your business?
3
Do you currently have any existing loans? Enter yes or no.
yes
What is your current monthly EMI?
20000
Your existing EMI is too high. You are not eligible.

Core Java Concepts Demonstrated:
 - Variables and data types
 - Console input using Scanner
 - Nested if-else statements
 - Logical AND operator (&&)
 - String comparison using equals()
 - Conditional branching
 - Basic business-rule implementation
  
How to Run:
 - Prerequisites
Java Development Kit (JDK)
Eclipse IDE or another Java-compatible IDE
 - Steps
1.Clone or download this repository.
2.Import the project into Eclipse as a Java project.
3.Open BankLoan_Eligibility.java.
4.Run the program using Run As → Java Application.
5.Enter the requested information in the console.

Future Enhancements:
 - Refactor repeated logic into reusable methods.
 - Add input validation and exception handling.
 - Improve object-oriented design.
 - Add unit tests using JUnit.
 - Store applicant information in a database.
 - Develop a graphical user interface or REST API.

Disclaimer:
This is an educational Proof of Concept. The eligibility criteria are illustrative and do not represent actual bank lending policies or guarantee loan approval.

Application Screenshot
The following screenshot demonstrates the loan eligibility screening process using the Java console application.
!Bank Loan Eligibility Checker - Console Output
<img width="1142" height="843" alt="Loan Eligibility Checker Output" src="https://github.com/user-attachments/assets/2feb118f-9b48-497a-a0e2-9ba345c23247" />

Author:
Gandham Saritha
Developed as a Core Java project to demonstrate conditional logic and rule-based loan eligibility screening.


