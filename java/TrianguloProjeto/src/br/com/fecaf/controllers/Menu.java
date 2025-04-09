package br.com.fecaf.controllers;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {
    public void executarMenu() {
        boolean exit = false;

        //Globais
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(); //Chama o Objeto
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        boolean validaRetangulo = false;
        boolean validaCirculo = false;
        boolean validaTriangulo = false;
        //Finalização dos Globais


        while (!exit) {
            System.out.println("/******************/");
            System.out.println("/*      Menu       /");
            System.out.println("/******************/");
            System.out.println("/* 1- Retângulo    */");
            System.out.println("/* 2- Circulo    */");
            System.out.println("/* 3- Triangulo    */");
            System.out.println("/* 4- Sair    */");
            System.out.println("/******************/");

            System.out.println("Informe a opção desejada: ");
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:

                    boolean exitRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/******************/");
                        System.out.println("/*      Retangulo       /");
                        System.out.println("/******************/");
                        System.out.println("/* 1- Cadastrar   */");
                        System.out.println("/* 2- Calcular Area    */");
                        System.out.println("/* 3- Calcular Perimetro    */");
                        System.out.println("/* 4- Validar Retangulo   */");
                        System.out.println("/* 5- Sair    */");
                        System.out.println("/******************/");

                        System.out.println("Informe a opção desejada: ");

                        int userOptionRetangulo = scanner.nextInt();


                        switch (userOptionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;

                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo");
                                }
                                break;

                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo");
                                }
                                break;

                            case 4:
                                if (validaRetangulo) {
                                    retangulo.exibirRetangulo();
                                } else {
                                    System.out.println("Cadastre um Retângulo");
                                }
                                break;

                            case 5:
                                System.out.println("Retornando ao Menu...");
                                exitRetangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção válida!");
                                break;
                        }
                    }
                    break;


                case 2:
                    boolean exitCirculo = false;

                    while (!exitCirculo) {
                        System.out.println("/******************/");
                        System.out.println("/*      Circulo      /");
                        System.out.println("/******************/");
                        System.out.println("/* 1- Cadastrar   */");
                        System.out.println("/* 2- Calcular Area    */");
                        System.out.println("/* 3- Calcular Perimetro    */");
                        System.out.println("/* 4- Exibir Circulo    */");
                        System.out.println("/* 5- Sair    */");
                        System.out.println("/******************/");

                        System.out.println("Informe a opção desejada: ");
                        int userOptionCirculo = scanner.nextInt();


                        switch (userOptionCirculo) {
                            case 1:
                                validaCirculo = circulo.cadastrarCirculo();
                                break;

                            case 2:
                                if (validaCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo");
                                }
                                break;

                            case 3:
                                if (validaCirculo) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;

                            case 4:
                                if (validaCirculo) {
                                    circulo.exibirCirculo();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;

                            case 5:
                                System.out.println("Retornando ao Menu...");
                                exitCirculo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção válida!");
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean exitTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/******************/");
                        System.out.println("/*      Triangulo      /");
                        System.out.println("/******************/");
                        System.out.println("/* 1- Cadastrar   */");
                        System.out.println("/* 2- Calcular Area    */");
                        System.out.println("/* 3- Calcular Perimetro    */");
                        System.out.println("/* 4- Definir Tipo   */");
                        System.out.println("/* 5- Verificar se o Triângulo é Retângulo */");
                        System.out.println("/* 6- Verificar se o Triângulo é do tipo 3, 4, 5 */");
                        System.out.println("/* 7- Sair    */");
                        System.out.println("/******************/");

                        System.out.println("Informe a opção desejada: ");
                        int userOptionTriangulo = scanner.nextInt();


                        switch (userOptionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;

                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;

                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;

                            case 4:
                                if (validaTriangulo) {
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;

                            case 5:
                                if (validaTriangulo) {
                                    triangulo.verificarTrianguloRetangulo();
                                } else {
                                System.out.println("Cadastre um Triangulo");
                            }
                            break;

                            case 6:
                                if (validaTriangulo){
                                    triangulo.verificarTriangulo345();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }

                            case 7:
                                System.out.println("Retornando ao Menu...");
                                exitTriangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção válida!");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do Sistema");
                    exit = true;
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");  // Se o usuário digitar uma opção inválida
                    break;
            }
        }
    }

}



