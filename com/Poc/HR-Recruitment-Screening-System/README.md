HR Recruitment Screening System – Java POC

Overview:
The HR Recruitment Screening System is a console-based Java application designed to simulate an initial candidate screening process.
The application collects candidate information and evaluates eligibility based on predefined educational qualifications, technical skills, job requirements, and work experience criteria.
It also performs input validation and generates a final candidate screening report with eligibility status and reasons for rejection, where applicable.

Key Features:
 - Candidate registration with personal details.
 - Email address validation.
 - Indian mobile number validation.
 - Educational qualification screening.
 - CGPA-based eligibility assessment.
 - Active backlog verification.
 - Pass-out year validation.
 - Technical skill assessment.
 - Job requirement evaluation.
 - Experienced and fresher candidate classification.
 - Internship and project information collection.
 - Input validation for text, integer, decimal, and yes/no values.
 - Final candidate screening report.
 - Displays eligibility status and reasons for disqualification.

Recruitment Screening Stages:
Stage 1: Candidate Registration
 - Full name
 - Email address
 - Mobile number
Stage 2: Educational Screening
 - Degree qualification
 - Minimum CGPA requirement (8.0)
 - Active backlog verification
 - Pass-out year (2024–2026)
Stage 3: Technical Screening
 - Java knowledge
 - SQL knowledge
 - Spring Boot knowledge
 - Stage 4: Job Requirements
 - Willingness to relocate
 - Availability to join
Stage 5: Experience Screening
Experienced Candidates:
 - Relevant work experience
 - Previous company
 - Designation
 - Previous annual salary
Fresher Candidates:
 - Internship details
 - Internship duration
 - Academic or personal projects
Stage 6: Final Screening Report
 - Candidate information summary
 - Candidate category
 - Work experience details
 - Final eligibility status
 - Reasons for not meeting screening criteria

Technical Concepts Used:
 - Java Classes and Methods
 - Static Methods
 - Scanner Class
 - String Handling and StringBuilder
 - Conditional Statements (if-else)
 - Boolean Data Types
 - Loops (while loop)
 - Exception Handling (try-catch for numeric input validation)
 - Input Validation
 - Regular Expressions (Regex)
 - String Matching
 - Method Reusability
 - Logical and Relational Operators

Technologies Used
 - Programming Language: Java
 - IDE: Eclipse
 - Input Handling: Java Scanner
 - Application Type: Console-Based Application

How to Run:
 - Clone or download the repository.
 - Import the project into Eclipse IDE.
 - Navigate to HR_Recruitment_Screening_System.java.
 - Open the Java file.
 - Right-click and select Run As → Java Application.
 - Enter the requested candidate details.
 - Complete all screening stages to view the final report.

Screening Criteria:
Criteria ->	Requirement,
Degree ->	Mandatory,
Minimum CGPA ->		8.0,
Active Backlogs	 ->	Not allowed,
Pass-out Year ->		2024–2026,
Java ->		Required,
SQL	 ->	Required,
Spring Boot ->		Required,
Relocation	 ->	Must be willing,
Joining Availability	 ->	Required.

Learning Objectives:
The objective of this POC is to understand how Core Java concepts can be applied to build a practical recruitment screening application.
It focuses on structured input handling, reusable validation methods, conditional decision-making, exception handling, string manipulation, and generating meaningful screening reports.

Future Enhancements:
 - Store candidate information in a database.
 - Implement JDBC integration.
 - Introduce separate classes for candidate details and screening logic.
 - Add multiple job roles with different eligibility criteria.
 - Generate candidate screening reports in PDF format.
 - Implement a graphical user interface.
 - Integrate Spring Boot for REST API-based recruitment screening.

Disclaimer:
This is an educational Proof of Concept. The screening criteria are predefined for demonstration purposes and do not represent actual recruitment policies or professional hiring decisions.

License:
This project is licensed under the MIT License.
