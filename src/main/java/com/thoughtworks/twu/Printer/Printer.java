            package com.thoughtworks.twu.Printer;


            import com.thoughtworks.twu.Printer.geometrics.Basics;
            import com.thoughtworks.twu.Printer.geometrics.Diamond;
            import com.thoughtworks.twu.Printer.geometrics.Triangle;
            import com.thoughtworks.twu.Printer.textAndOthers.FizzBuzz;
            import com.thoughtworks.twu.Printer.textAndOthers.Generator;
            import java.util.Calendar;
            import java.util.GregorianCalendar;
            import java.util.Scanner;

            public class Printer {

                private int n = 0;
                private String userName;
                private Scanner input = new Scanner(System.in);
                private Basics basics = Basics.getBasics();
                private Triangle triangle = Triangle.getTriangle();
                private Diamond diamond = Diamond.getDiamond();
                private FizzBuzz fizzBuzz = new FizzBuzz();
                private Generator generator = new Generator();


                public void hello() {
                    System.out.println(greeting());
                    userName = input.nextLine();
                    menu();
                    again();
                }

                public String greeting() {

                    Calendar calendar = new GregorianCalendar();
                    int hour = calendar.get(Calendar.HOUR_OF_DAY);

                    String greeting = "Boa tarde, digite o seu nome para começar > ";

                    if (hour < 12) {
                        greeting = "Bom dia, digite o seu nome para começar >";
                    }
                    if (hour > 19) {
                        greeting = "Boa noite, digite o seu nome para começar >";
                    }
                    return greeting;
                }

                public void menu() {

                    System.out.println("------------------------------------------\n" +
                            "Olá, " + userName + ", digite o número do exercício que deseja conferir: \n" +
                            "1. Impressão de asterisco simples; \n" +
                            "2. Linha horizontal de asteriscos; \n" +
                            "3. Linha vertical de asteriscos; \n" +
                            "4. Um triângulo alinhado à direita; \n" +
                            "5. Um triângulo isósceles; \n" +
                            "6. Um diamante; \n" +
                            "7. Um diamante com seu nome;\n" +
                            "8. Exercício FizzBuzz; \n" +
                            "9. Descobrindo os fatores de um número; \n" +
                            "------------------------------------------\n" +
                            "SUA RESPOSTA >");

                    String exercise = input.next();
                    exerciseMenu(exercise);

                }


                public void exerciseMenu(String next) {


                    int exercise = Integer.parseInt(next);
                    if(exercise == 1) {
                        printAsterisks();
                    } else if(exercise == 8) {
                        printFizzBuzz();
                    } else {
                        setN();
                        switch (exercise) {
                            case 2:
                                printInLine();
                                break;
                            case 3:
                                printInVerticalLine();
                                break;
                            case 4:
                                printTriangle();
                                break;
                            case 5:
                                printIsoscelesTriangle();
                                break;
                            case 6:
                                printDiamond();
                                break;
                            case 7:
                                printDiamond(userName);
                                break;
                            case 9:
                                printGen(n);
                                break;
                            default:
                                printAsterisks();
                                break;
                        }
                        again();
                    }
                }

                private void again() {

                    System.out.println(userName + ", você deseja continuar? Digite S para Sim ou N para Não >");
                    String answer = input.next();

                    switch (answer.toLowerCase()) {
                        case "s":
                            menu();
                            break;
                        case "n":
                            return;
                        default:
                            System.out.println("Digite um valor válido. ");
                            again();
                            break;
                    }

                }

                public void setN () {

                    String linhas = "Digite o tamanho/número > ";
                    System.out.println(linhas);
                    n = Integer.parseInt(input.next());

                }


                public void printGen(int n) {
                    System.out.println("- Printing " + n + "'s factors in ascending order - ");
                    generator.findFactors(n);
                    System.out.println("-----------------------------------");

                }


                public void printFizzBuzz() {
                    System.out.println("- Printing FizzBuzz - ");
                    fizzBuzz.fizzBuzz();
                    System.out.println("-----------------------------------");

                }

                public void printAsterisks() {
                    basics.setN(n);
                    System.out.println("- Printing one asterisks in one line - ");
                    basics.asterisks();
                    System.out.println("-----------------------------------");

                }

                public void printInLine() {
                    basics.setN(n);
                    System.out.println("- Printing " + n + " asterisks in one line - ");
                    basics.inLine();
                    System.out.println("\n--------------------------------------");

                }

                public void printInVerticalLine() {
                    basics.setN(n);
                    System.out.println("- Printing " + n + " asterisks in " + n + " lines - ");
                    basics.verticalLine();
                    System.out.println("--------------------------------------");

                }

                public void printTriangle() {
                    System.out.println("- Drawing a triangle with " + n + " lines - ");
                    triangle.setN(n);
                    triangle.printInTriangle();
                    System.out.println("--------------------------------------");


                }

                public void printIsoscelesTriangle() {
                    triangle.setN(n);
                    System.out.println("- Drawing a triangle  with " + n + " lines - ");
                    triangle.isoscelesTriangle(false);
                    System.out.println("--------------------------------------");

                }

                public void printDiamond() {
                    diamond.setN(n);
                    System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                    diamond.drawDiamond();
                    System.out.println("--------------------------------------");
                }

                public void printDiamond(String name) {
                    diamond.setN(n);
                    System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                    diamond.drawDiamond(name);
                    System.out.println("--------------------------------------");

                }


            }




