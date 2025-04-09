package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado1, lado2, altura, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/***********************/");
        System.out.println("/* Cadastrando Triangulo */");
        System.out.println("/***********************/");
        System.out.println("Informe a base: ");
        base = scanner.nextDouble();
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
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
        System.out.println("/* Definir Tipo   */");
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
        System.out.println("/************************/");
        System.out.println("/* Informações Triangulo  */");
        System.out.println("/************************/");
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/***************************/");
    }

    public void verificarTrianguloRetangulo() {
        System.out.println("/***************************/");
        System.out.println("/* Verificando Triangulo Retângulo */");
        System.out.println("/***************************/");

        // Encontrando o maior lado (hipotenusa)
        double hipotenusa, cateto1, cateto2;
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

        if (hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2) {
            System.out.println("Esse triângulo é retângulo.");
        } else {
            System.out.println("Esse triângulo não é retângulo.");
        }
        System.out.println("/***************************/");
    }

    // Método simplificado para verificar se o triângulo é do tipo 3, 4, 5
    public void verificarTriangulo345() {
        System.out.println("/***************************/");
        System.out.println("/* Verificando Triângulo 3, 4, 5 */");
        System.out.println("/***************************/");

        if ((base == 3 && lado1 == 4 && lado2 == 5) ||
                (base == 4 && lado1 == 3 && lado2 == 5) ||
                (base == 5 && lado1 == 3 && lado2 == 4)) {
            System.out.println("Esse triângulo é do tipo 3, 4, 5.");
        } else {
            System.out.println("Esse triângulo não é do tipo 3, 4, 5.");
        }
        System.out.println("/***************************/");
    }
}