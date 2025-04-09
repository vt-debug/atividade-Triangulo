package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado1, lado2, altura, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/*************************/");
        System.out.println("/* Cadastrando Triangulo */");
        System.out.println("/*************************/");
        System.out.println("Informe a base: ");
        base = scanner.nextDouble();
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso !");
        System.out.println("/********************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/************************/");
        System.out.println("/*   Calculando Area    */");
        System.out.println("/************************/");
        area = base * altura / 2;
        System.out.println("A area é: " + area);
        System.out.println("/************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/**************************/");
        System.out.println("/* Calculando Perimetro   */");
        System.out.println("/**************************/");
        perimetro = base + lado1 + lado2;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/**************************/");
    }

    public void definirTipo() {
        System.out.println("/**************************/");
        System.out.println("/*      Definir Tipo      */");
        System.out.println("/**************************/");

        if (base == lado1 && base == lado2) {
            System.out.println("Esse Triângulo é Equilátero");
        } else if (base != lado1 && base != lado2 && lado1 != lado2) {
            System.out.println("Esse Triângulo é Escaleno");
        } else {
            System.out.println("Esse Triângulo é Isosceles");
        }
    }

    public void exibirTriangulo() {
        System.out.println("/**************************/");
        System.out.println("/* Informações Triangulo  */");
        System.out.println("/**************************/");
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/**************************/");
    }

    public void TrianguloRetangulo() {
        System.out.println("/***********************************/");
        System.out.println("/* Verificando Triangulo Retângulo */");
        System.out.println("/***********************************/");

        double hipotenusa, cateto1, cateto2; //aqui declarei as variáveis para armazenar a hipotenusa e os catetos do triângulo
        //nas linhas abaixo estou usando uma forma para decidir qual dos três lados é a hipotenusa
        if (base >= lado1 && base >= lado2) {
            hipotenusa = base;
            cateto1 = lado1;
            cateto2 = lado2;
        } else if (lado1 >= base && lado1 >= lado2) {
            hipotenusa = lado1;
            cateto1 = base;
            cateto2 = lado2;
        } else {
            hipotenusa = lado2;
            cateto1 = base;
            cateto2 = lado1;
        }
        //como explicado anteriormente em sala, estou verificando se o triângulo é retângulo, aplicando o teorema de pitágoras (hipotenusa² = cateto1² + cateto2²)
        if (hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2) {
            System.out.println("Esse triângulo é retângulo.");
        } else {
            System.out.println("Esse triângulo não é retângulo.");
        }
        System.out.println("/**********************************/");
    }

    public void verificarTriangulo345() {
        System.out.println("/*********************************/");
        System.out.println("/* Verificando Triângulo 3, 4, 5 */");
        System.out.println("/*********************************/");
        //aqui o código abaixo está verificando se os lados passados para o triângulo são 3,4 e 5, independentemente da ordem
        if ((base == 3 && lado1 == 4 && lado2 == 5) ||
                (base == 4 && lado1 == 3 && lado2 == 5) ||
                (base == 5 && lado1 == 3 && lado2 == 4)) {
            System.out.println("Esse triângulo é do tipo 3, 4, 5.");
        } else {
            System.out.println("Esse triângulo não é do tipo 3, 4, 5.");
        }
        System.out.println("/*********************************/");
    }
}