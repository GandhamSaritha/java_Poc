
package com.Poc;

import java.util.Scanner;

public class HR_Recruitment_Screening_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   HR RECRUITMENT SCREENING SYSTEM");
        System.out.println("========================================");

        // Stage 1: Candidate Registration
        System.out.println("\n--- CANDIDATE REGISTRATION ---");

        String fullName = readNonEmpty(sc, "Enter your full name: ");
        String email = readEmail(sc);
        String phone = readPhone(sc);

        boolean eligible = true;
        StringBuilder reasons = new StringBuilder();

        // Stage 2: Educational Screening
        System.out.println("\n--- EDUCATIONAL SCREENING ---");

        System.out.print("Do you have a degree? (yes/no): ");
        boolean hasDegree = readBoolean(sc);

        if (!hasDegree) {

            eligible = false;
            reasons.append("- Degree requirement not satisfied.\n");

        } else {

            double cgpa = readDouble(
                    sc, "Enter your CGPA (0.0 to 10.0): ", 0.0, 10.0);

            if (cgpa >= 8.0) {
                System.out.println("CGPA requirement satisfied.");
            } else {
                eligible = false;
                reasons.append("- CGPA is below 8.0.\n");
            }

            System.out.print("Do you have active backlogs? (yes/no): ");
            boolean backlogs = readBoolean(sc);

            if (backlogs) {
                eligible = false;
                reasons.append("- Active backlogs do not meet the job criteria.\n");
            }

            int year = readInt(
                    sc, "Enter your pass-out year: ", 1900, 2100);

            if (year >= 2024 && year <= 2026) {
                System.out.println("Pass-out year requirement satisfied.");
            } else {
                eligible = false;
                reasons.append(
                        "- Pass-out year must be between 2024 and 2026.\n");
            }
        }

        // Stage 3: Technical Screening
        System.out.println("\n--- TECHNICAL SCREENING ---");

        System.out.print("Do you know Java? (yes/no): ");
        boolean knowsJava = readBoolean(sc);

        if (knowsJava) {
            System.out.println("Java skill verified.");
        } else {
            eligible = false;
            reasons.append("- Java skill requirement not satisfied.\n");
        }

        System.out.print("Do you know SQL? (yes/no): ");
        boolean knowsSQL = readBoolean(sc);

        if (knowsSQL) {
            System.out.println("SQL skill verified.");
        } else {
            eligible = false;
            reasons.append("- SQL skill requirement not satisfied.\n");
        }

        System.out.print("Do you know Spring Boot? (yes/no): ");
        boolean knowsSpringBoot = readBoolean(sc);

        if (knowsSpringBoot) {
            System.out.println("Spring Boot skill verified.");
        } else {
            eligible = false;
            reasons.append("- Spring Boot skill requirement not satisfied.\n");
        }

        // Stage 4: Job Requirements
        System.out.println("\n--- JOB REQUIREMENTS ---");

        System.out.print("Are you willing to relocate if required? (yes/no): ");
        boolean willingToRelocate = readBoolean(sc);

        if (!willingToRelocate) {
            eligible = false;
            reasons.append("- Relocation requirement not satisfied.\n");
        }

        System.out.print("Are you available to join as required? (yes/no): ");
        boolean availableToJoin = readBoolean(sc);

        if (!availableToJoin) {
            eligible = false;
            reasons.append("- Availability requirement not satisfied.\n");
        }

        // Stage 5: Experience Screening
        System.out.println("\n--- EXPERIENCE SCREENING ---");

        int experience = readInt(
                sc,
                "Enter relevant work experience in years (0 or more): ",
                0, 60);

        String candidateType;
        StringBuilder experienceDetails = new StringBuilder();

        if (experience > 0) {

            // Experienced Candidate
            candidateType = "Experienced Candidate";

            System.out.println("\nCandidate Type: Experienced");

            String company = readNonEmpty(
                    sc, "Enter previous company name: ");

            String designation = readNonEmpty(
                    sc, "Enter your designation: ");

            double salary = readDouble(
                    sc,
                    "Enter previous annual salary (0 if not applicable): ",
                    0.0, 1_000_000_000.0);

            experienceDetails.append("Previous Company: ")
                    .append(company)
                    .append("\nDesignation: ")
                    .append(designation)
                    .append("\nPrevious Annual Salary: ")
                    .append(salary);

        } else {

            // Fresher Candidate
            candidateType = "Fresher";

            System.out.println("\nCandidate Type: Fresher");

            System.out.print("Have you completed an internship? (yes/no): ");
            boolean internship = readBoolean(sc);

            if (internship) {

                String internshipCompany = readNonEmpty(
                        sc, "Enter internship company name: ");

                int duration = readInt(
                        sc, "Enter internship duration in months: ", 1, 120);

                experienceDetails.append("Internship Company: ")
                        .append(internshipCompany)
                        .append("\nInternship Duration: ")
                        .append(duration)
                        .append(" month(s)");

            } else {

                experienceDetails.append("No internship experience reported.");
            }

            System.out.print(
                    "Have you completed academic or personal projects? (yes/no): ");

            boolean hasProjects = readBoolean(sc);

            if (hasProjects) {

                String projectName = readNonEmpty(
                        sc, "Enter one project name: ");

                experienceDetails.append("\nProject: ").append(projectName);

            } else {

                experienceDetails.append("\nNo projects reported.");
            }
        }

        // Stage 6: Final Screening Report
        System.out.println("\n========================================");
        System.out.println("       CANDIDATE SCREENING REPORT");
        System.out.println("========================================");

        System.out.println("Candidate Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Candidate Type: " + candidateType);
        System.out.println("Work Experience: " + experience + " year(s)");

        System.out.println("\nExperience Details:");
        System.out.println(experienceDetails);

        System.out.println("\n--- FINAL RESULT ---");

        if (eligible) {

            System.out.println("Status: ELIGIBLE FOR NEXT ROUND");
            System.out.println(
                    "The candidate meets the initial screening criteria.");

        } else {

            System.out.println("Status: NOT ELIGIBLE UNDER CURRENT CRITERIA");
            System.out.println("\nReasons:");
            System.out.print(reasons);
        }

        System.out.println(
                "\nNote: Final hiring decisions require HR review.");
        System.out.println("Thank you for completing the screening.");

        sc.close();
    }

    // Validate non-empty text
    private static String readNonEmpty(Scanner sc, String prompt) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    // Validate email format
    private static String readEmail(Scanner sc) {

        while (true) {

            System.out.print("Enter your email address: ");
            String email = sc.nextLine().trim();

            String emailPattern =
                    "^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)+$";

            if (email.matches(emailPattern)
                    && !email.contains("..")
                    && !email.matches(".*@.*@.*")) {

                return email;
            }

            System.out.println(
                    "Invalid email! Enter a valid email, such as name@gmail.com.");
        }
    }

    // Validate Indian mobile number
    private static String readPhone(Scanner sc) {

        while (true) {

            System.out.print("Enter your 10-digit Indian mobile number: ");
            String phone = sc.nextLine().trim();

            if (phone.matches("[6-9][0-9]{9}")) {
                return phone;
            }

            System.out.println(
                    "Invalid number! Enter exactly 10 digits starting with 6-9.");
        }
    }

    // Validate yes/no input
    private static boolean readBoolean(Scanner sc) {

        while (true) {

            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("yes")
                    || input.equalsIgnoreCase("true")) {

                return true;

            } else if (input.equalsIgnoreCase("no")
                    || input.equalsIgnoreCase("false")) {

                return false;

            } else {

                System.out.print(
                        "Invalid input. Enter yes or no: ");
            }
        }
    }

    // Validate integer input
    private static int readInt(
            Scanner sc, String prompt, int min, int max) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine().trim();

            try {

                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println(
                        "Enter a value between " + min + " and " + max + ".");

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a whole number.");
            }
        }
    }

    // Validate decimal input
    private static double readDouble(
            Scanner sc, String prompt, double min, double max) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine().trim();

            try {

                double value = Double.parseDouble(input);

                if (Double.isFinite(value)
                        && value >= min
                        && value <= max) {

                    return value;
                }

                System.out.println(
                        "Enter a valid value between " + min + " and " + max + ".");

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a numeric value.");
            }
        }
    }
}