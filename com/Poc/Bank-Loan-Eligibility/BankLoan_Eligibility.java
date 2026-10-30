
package com.Poc;

import java.util.Scanner;

public class BankLoan_Eligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your fullname?");
        String fullname = sc.nextLine();

        System.out.println("What is your age?");
        int age = sc.nextInt();

        if (age >= 21 && age <= 60) {

            System.out.println("What is your monthly income?");
            double salary = sc.nextDouble();

            if (salary >= 25000) {

                sc.nextLine();

                System.out.println("Are you a salaried employee or self-employed? (type salaried or self)");
                String emp_type = sc.nextLine();

                if (emp_type.equals("salaried")) {

                    System.out.println("How many years have you worked at your current company?");
                    int exp_yrs = sc.nextInt();

                    if (exp_yrs >= 1) {

                        sc.nextLine();

                        System.out.println("Do you currently have any existing loans? Enter yes or no.");
                        String loans = sc.nextLine();

                        if (loans.equals("no")) {

                            System.out.println("What is your credit score?");
                            int credit_score = sc.nextInt();

                            if (credit_score >= 700) {

                                System.out.println("What loan amount do you require?");
                                double loan_amount = sc.nextDouble();

                                if (loan_amount <= 500000) {
                                    System.out.println("Congratulations! You are eligible for preliminary loan screening.");
                                } else {
                                    System.out.println("Requested loan amount exceeds the limit.");
                                }

                            } else {
                                System.out.println("Your credit score is below the required limit. You are not eligible.");
                            }

                        } else if (loans.equals("yes")) {

                            System.out.println("What is your current monthly EMI?");
                            double EMI = sc.nextDouble();

                            if (EMI <= salary * 0.40) {

                                System.out.println("What is your credit score?");
                                int credit_score = sc.nextInt();

                                if (credit_score >= 700) {

                                    System.out.println("What loan amount do you require?");
                                    double loan_amount = sc.nextDouble();

                                    if (loan_amount <= 500000) {
                                        System.out.println("Congratulations! You are eligible for preliminary loan screening.");
                                    } else {
                                        System.out.println("Requested loan amount exceeds the limit.");
                                    }

                                } else {
                                    System.out.println("Your credit score is below the required limit. You are not eligible.");
                                }

                            } else {
                                System.out.println("Your existing EMI is too high. You are not eligible.");
                            }

                        } else {
                            System.out.println("Invalid answer. Please enter yes or no.");
                        }

                    } else {
                        System.out.println("You need at least 1 year of work experience.");
                    }

                } else if (emp_type.equals("self")) {

                    System.out.println("How many years have you been running your business?");
                    int bus_yrs = sc.nextInt();

                    if (bus_yrs >= 2) {

                        sc.nextLine();

                        System.out.println("Do you currently have any existing loans? Enter yes or no.");
                        String b_loans = sc.nextLine();

                        if (b_loans.equals("no")) {

                            System.out.println("What is your credit score?");
                            int cd_score = sc.nextInt();

                            if (cd_score >= 700) {

                                System.out.println("What loan amount do you require?");
                                double b_loan_amount = sc.nextDouble();

                                if (b_loan_amount <= 500000) {
                                    System.out.println("Congratulations! You are eligible for preliminary loan screening.");
                                } else {
                                    System.out.println("Requested loan amount exceeds the limit.");
                                }

                            } else {
                                System.out.println("Your credit score is below the required limit. You are not eligible.");
                            }

                        } else if (b_loans.equals("yes")) {

                            System.out.println("What is your current monthly EMI?");
                            double b_EMI = sc.nextDouble();

                            if (b_EMI <= salary * 0.40) {

                                System.out.println("What is your credit score?");
                                int cd_score = sc.nextInt();

                                if (cd_score >= 700) {

                                    System.out.println("What loan amount do you require?");
                                    double b_loan_amount = sc.nextDouble();

                                    if (b_loan_amount <= 500000) {
                                        System.out.println("Congratulations! You are eligible for preliminary loan screening.");
                                    } else {
                                        System.out.println("Requested loan amount exceeds the limit.");
                                    }

                                } else {
                                    System.out.println("Your credit score is below the required limit. You are not eligible.");
                                }

                            } else {
                                System.out.println("Your existing EMI is too high. You are not eligible.");
                            }

                        } else {
                            System.out.println("Invalid answer. Please enter yes or no.");
                        }

                    } else {
                        System.out.println("You need at least 2 years of business experience.");
                    }

                } else {
                    System.out.println("Invalid employment type.");
                }

            } else {
                System.out.println("Your monthly income does not meet the minimum requirement.");
            }

        } else if (age > 60) {
            System.out.println("You are not eligible because your age exceeds the limit.");
        } else {
            System.out.println("You are not eligible because your age is below 21.");
        }

        sc.close();
    }
}
