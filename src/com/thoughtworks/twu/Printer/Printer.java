            package thoughtworks.twu.Printer;

            import com.thoughtworks.twu.Printer.geometrics.Basics;

            import com.thoughtworks.twu.Printer.textAndOthers.FizzBuzz;
            import thoughtworks.twu.Printer.geometrics.Diamond;
            import thoughtworks.twu.Printer.geometrics.Triangle;
            import thoughtworks.twu.Printer.textAndOthers.Generator;
            import java.util.Calendar;
            import java.util.GregorianCalendar;
            import java.util.Scanner;

            public class Printer {

                private int n = 0;
                private String userName;
                private Scanner input;
                private Basics basics;
                private Triangle triangle;
                private Diamond diamond;


                public void hello() {
                    input = new Scanner(System.in);
                    System.out.println(greeting());
                    userName = input.nextLine();
                    menu();
                    again();
                }

                private String greeting() {

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

                private void menu() {

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


                private void exerciseMenu(String next) {


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

                private void setN() {

                    String linhas = "Digite o tamanho/número > ";
                    System.out.println(linhas);
                    n = Integer.parseInt(input.next());

                }


                private void printGen(int n) {

                    Generator generator = new Generator();
                    System.out.println("- Printing " + n + "'s factors in ascending order - ");
                    generator.findFactors(n);
                    System.out.println("-----------------------------------");

                }


                private void printFizzBuzz() {

                    FizzBuzz fizzBuzz = new FizzBuzz();
                    System.out.println("- Printing FizzBuzz - ");
                    fizzBuzz.fizzBuzz();
                    System.out.println("-----------------------------------");

                }

                private void printAsterisks() {

                    basics = Basics.getBasics();
                    basics.setN(n);
                    System.out.println("- Printing one asterisks in one line - ");
                    basics.asterisks();
                    System.out.println("-----------------------------------");

                }

                private void printInLine() {

                    basics = Basics.getBasics();
                    basics.setN(n);
                    System.out.println("- Printing " + n + " asterisks in one line - ");
                    basics.inLine();
                    System.out.println("\n--------------------------------------");

                }

                private void printInVerticalLine() {

                    basics = Basics.getBasics();
                    basics.setN(n);
                    System.out.println("- Printing " + n + " asterisks in " + n + " lines - ");
                    basics.verticalLine();
                    System.out.println("--------------------------------------");

                }

                private void printTriangle() {

                    triangle = Triangle.getTriangle();
                    triangle.setN(n);
                    System.out.println("- Drawing a triangle with " + n + " lines - ");
                    triangle.printInTriangle();
                    System.out.println("--------------------------------------");


                }

                private void printIsoscelesTriangle() {

                    triangle = Triangle.getTriangle();
                    triangle.setN(n);
                    System.out.println("- Drawing a triangle  with " + n + " lines - ");
                    triangle.isoscelesTriangle(false);
                    System.out.println("--------------------------------------");

                }

                private void printDiamond() {

                    diamond = Diamond.getDiamond();
                    diamond.setN(n);
                    System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                    diamond.drawDiamond();
                    System.out.println("--------------------------------------");
                }

                private void printDiamond(String name) {

                    diamond = Diamond.getDiamond();
                    diamond.setN(n);
                    System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                    diamond.drawDiamond(name);
                    System.out.println("--------------------------------------");

                }


            }




