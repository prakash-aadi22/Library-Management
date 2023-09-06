import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class library {
    Scanner sc = new Scanner(System.in);
    FileWriter fw;

    {
        try {
            fw = new FileWriter("programmingLibrary.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void bookList() {
        System.out.println("Available Book List are ");
        System.out.println("-------------------------------------------------");
        System.out.println("|  BOOK'S NAME          AUTHOR'S NAME           |");
        System.out.println("| * JAVA         -->     1                      |");
        System.out.println("| * PYTHON       -->     2                      |");
        System.out.println("| * SWIFT        -->     3                      |");
        System.out.println("| * C            -->     4                      |");
        System.out.println("| * C#           -->     5                      |");
        System.out.println("| * C++          -->     6                      |");
        System.out.println("| * JAVASCRIPT   -->     7                      |");
        System.out.println("| * CSS          -->     8                      |");
        System.out.println("| * HTML         -->     9                      |");
        System.out.println("| * RUBY         -->     10                     |");
        System.out.println("| * GO           -->     11                     |");
        System.out.println("| * OBJECTIVE C  -->     12                     |");
        System.out.println("| * PHP          -->     13                     |");
        System.out.println("| * SQL          -->     14                     |");
        System.out.println("| * KOTLIN       -->     15                     |");
        System.out.println("| * PERL         -->     16                     |");
        System.out.println("| * PASCAL       -->     17                     |");
        System.out.println("| * R            -->     18                     |");
        System.out.println("| * RUST         -->     19                     |");
        System.out.println("-------------------------------------------------");
    }

    void borrowBook(String name, int num) {
        try {
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the name of the book you want to borrow: ");
                String bName = sc.nextLine();
                if (bName.equalsIgnoreCase("JAVA") || bName.equalsIgnoreCase("PYTHON") || bName.equalsIgnoreCase("SWIFT") || bName.equalsIgnoreCase("C") || bName.equalsIgnoreCase("C#") || bName.equalsIgnoreCase("C++") || bName.equalsIgnoreCase("JAVASCRIPT") || bName.equalsIgnoreCase("CSS") || bName.equalsIgnoreCase("HTML") || bName.equalsIgnoreCase("RUBY") || bName.equalsIgnoreCase("GO") || bName.equalsIgnoreCase("OBJECTIVE C") || bName.equalsIgnoreCase("PHP") || bName.equalsIgnoreCase("SQL") || bName.equalsIgnoreCase("KOTLIN") || bName.equalsIgnoreCase("PERL") || bName.equalsIgnoreCase("PASCAL") || bName.equalsIgnoreCase("R") || bName.equalsIgnoreCase("RUST")) {
                    System.out.println(bName + " --> Book has been borrowed to " + name);
                    fw.write(bName + " --> Book has been borrowed to " + name + "\n");
                } else {
                    System.out.println("The book name you have entered is not in the list");
                }
            }
            fw.flush();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void returnBook(String name, int num) {
        try {
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the name of the book you want to return: ");
                String bName = sc.nextLine();
                if (bName.equalsIgnoreCase("JAVA") || bName.equalsIgnoreCase("PYTHON") || bName.equalsIgnoreCase("SWIFT") || bName.equalsIgnoreCase("C") || bName.equalsIgnoreCase("C#") || bName.equalsIgnoreCase("C++") || bName.equalsIgnoreCase("JAVASCRIPT") || bName.equalsIgnoreCase("CSS") || bName.equalsIgnoreCase("HTML") || bName.equalsIgnoreCase("RUBY") || bName.equalsIgnoreCase("GO") || bName.equalsIgnoreCase("OBJECTIVE C") || bName.equalsIgnoreCase("PHP") || bName.equalsIgnoreCase("SQL") || bName.equalsIgnoreCase("KOTLIN") || bName.equalsIgnoreCase("PERL") || bName.equalsIgnoreCase("PASCAL") || bName.equalsIgnoreCase("R") || bName.equalsIgnoreCase("RUST")) {
                    System.out.println(bName + " --> Book has been returned by " + name);
                    fw.write(bName + " --> Book has been returned by " + name + "\n");
                } else {
                    System.out.println("The book name you have entered is not in the list");
                }
            }
            fw.flush();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void donateBook(String name, int num) {
        try {
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the name of the book you want to donate: ");
                String bName = sc.nextLine();
                if (bName.equalsIgnoreCase("JAVA") || bName.equalsIgnoreCase("PYTHON") || bName.equalsIgnoreCase("SWIFT") || bName.equalsIgnoreCase("C") || bName.equalsIgnoreCase("C#") || bName.equalsIgnoreCase("C++") || bName.equalsIgnoreCase("JAVASCRIPT") || bName.equalsIgnoreCase("CSS") || bName.equalsIgnoreCase("HTML") || bName.equalsIgnoreCase("RUBY") || bName.equalsIgnoreCase("GO") || bName.equalsIgnoreCase("OBJECTIVE C") || bName.equalsIgnoreCase("PHP") || bName.equalsIgnoreCase("SQL") || bName.equalsIgnoreCase("KOTLIN") || bName.equalsIgnoreCase("PERL") || bName.equalsIgnoreCase("PASCAL") || bName.equalsIgnoreCase("R") || bName.equalsIgnoreCase("RUST")) {
                    System.out.println(bName + " --> Book has been donated by " + name);
                    fw.write(bName + " --> Book has been donated by " + name + "\n");
                } else {
                    System.out.println("The book name you have entered is not in the list");
                }
            }
            fw.flush();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void buyBook(String name, int num) {
        try {
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the name of the book you want to buy: ");
                String bName = sc.nextLine();
                if (bName.equalsIgnoreCase("JAVA") || bName.equalsIgnoreCase("PYTHON") || bName.equalsIgnoreCase("SWIFT") || bName.equalsIgnoreCase("C") || bName.equalsIgnoreCase("C#") || bName.equalsIgnoreCase("C++") || bName.equalsIgnoreCase("JAVASCRIPT") || bName.equalsIgnoreCase("CSS") || bName.equalsIgnoreCase("HTML") || bName.equalsIgnoreCase("RUBY") || bName.equalsIgnoreCase("GO") || bName.equalsIgnoreCase("OBJECTIVE C") || bName.equalsIgnoreCase("PHP") || bName.equalsIgnoreCase("SQL") || bName.equalsIgnoreCase("KOTLIN") || bName.equalsIgnoreCase("PERL") || bName.equalsIgnoreCase("PASCAL") || bName.equalsIgnoreCase("R") || bName.equalsIgnoreCase("RUST")) {
                    System.out.println(bName + " --> Book has been bought by " + name);
                    fw.write(bName + " --> Book has been bought by " + name + "\n");
                } else {
                    System.out.println("The book name you have entered is not in the list");
                }
            }
            fw.flush();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }
}

public class Library_Management {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            library l = new library();
            System.out.println("********** PROGRAMMING LIBRARY **********");
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            String[] words = name.split("\\s");
            StringBuilder capitalizeStr = new StringBuilder();
            for (String word : words) {
                String firstLetter = word.substring(0, 1);
                String remainingLetters = word.substring(1);
                capitalizeStr.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
            }
            String newName = capitalizeStr.toString();
            System.out.print("Enter your mobile number: ");
            long number = sc.nextLong();
            int max = 99;
            int min = 10;
            int otp1 = min + (int) (Math.random() * ((max - min) + 1));
            int otp2 = min + (int) (Math.random() * ((max - min) + 1));
            int otp3 = min + (int) (Math.random() * ((max - min) + 1));
            String otp = String.valueOf(otp1) + otp2 + otp3;
            System.out.println("OTP has been sent on the mobile number: " + number);
            System.out.println("OTP generated: " + otp);
            System.out.print("Enter the OTP: ");
            String OTP = sc.next();
            System.out.println("Verifying the OTP: " + OTP + ".....");
            Calendar cal = Calendar.getInstance();
            TimeUnit.SECONDS.sleep(1);
            if (OTP.equals(otp)) {
                System.out.println("Logged in --> " + cal.getTime() + " as " + newName);
                l.bookList();
                int noOfBorrow = 3;
                int noOfReturn = 3;
                int noOfDonate = 10;
                int noOfBuy = 2;
                while (true) {
                    System.out.println("""
                            Please choose an option:
                                    1 --> TO BORROW BOOK/s
                                    2 --> TO RETURN BOOK/s
                                    3 --> TO DONATE BOOK/s
                                    4 --> TO BUY BOOK/s
                                    5 --> TO EXIT THE LIBRARY
                            """);
                    System.out.print("Enter you option: ");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.print("How many Book you want to borrow(max -> 3): ");
                        int num = sc.nextInt();
                        if (num > 3) {
                            System.out.println("You can't borrow more than 3 books.");
                        } else if (num <= 0) {
                            System.out.println("Invalid Option");
                        } else {
                            noOfBorrow = noOfBorrow - num;
                            if (noOfBorrow >= 0 && noOfBorrow <= 3) {
                                l.borrowBook(newName, num);
                            } else if (noOfBorrow < 0) {
                                System.out.println("You have already borrowed 3 books.");
                            } else {
                                System.out.println("Error");
                                break;
                            }
                        }
                    } else if (option == 2) {
                        System.out.println("Max number of book that can be borrowed is 3, so you can return only 3 book.");
                        System.out.print("How many Book you want to return: ");
                        int num = sc.nextInt();
                        if (num > 3) {
                            System.out.println("Invalid Option");
                        } else if (num <= 0) {
                            System.out.println("Invalid Option");
                        } else {
                            noOfReturn = noOfReturn - num;
                            if (noOfReturn >= 0 && noOfReturn <= 3) {
                                l.returnBook(newName, num);
                            } else if (noOfReturn < 0) {
                                System.out.println("You have already returned 3 books.");
                            } else {
                                System.out.println("Error");
                                break;
                            }
                        }
                    } else if (option == 3) {
                        System.out.print("How many Book you want to donate(max -> 10): ");
                        int num = sc.nextInt();
                        if (num > 10) {
                            System.out.println("You can't donate more than 10 books at a time.");
                        } else if (num <= 0) {
                            System.out.println("Invalid Option");
                        } else {
                            noOfDonate = noOfDonate - num;
                            if (noOfDonate >= 0 && noOfDonate <= 10) {
                                l.donateBook(newName, num);
                            } else if (noOfDonate < 0) {
                                System.out.println("You have already donated 10 books.");
                            } else {
                                System.out.println("Error");
                                break;
                            }
                        }
                    } else if (option == 4) {
                        System.out.print("How many Book you want to buy(max -> 2): ");
                        int num = sc.nextInt();
                        if (num > 2) {
                            System.out.println("You can't buy more than 2 books.");
                        } else if (num <= 0) {
                            System.out.println("Invalid Option");
                        } else {
                            noOfBuy = noOfBuy - num;
                            if (noOfBuy >= 0 && noOfBuy <= 2) {
                                l.buyBook(newName, num);
                            } else if (noOfBuy < 0) {
                                System.out.println("You have already bought 2 books.");
                            } else {
                                System.out.println("Error");
                                break;
                            }
                        }
                    } else if (option == 5) {
                        break;
                    } else {
                        System.out.println("You have given a wrong input.");
                        break;
                    }
                }
                System.out.println("Details has been sent on your mobile number: " + number);
                System.out.println("Details has been saved in programmingLibrary.txt");
            } else {
                System.out.println("Incorrect OTP");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        } finally {
            System.out.println("\n********** THANK YOU **********");
        }
    }
}
