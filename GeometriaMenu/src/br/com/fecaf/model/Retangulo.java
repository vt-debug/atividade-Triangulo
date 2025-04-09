package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {

    public double lado1, lado2, area, perimetro;

    Scanner  scanner = new Scanner(System.in);

    public boolean cadastrarRetangulo () {
        System.out.println("/************************/");
        System.out.println("/*  Cadastro Retangulo  */");
        System.out.println("/************************/");
        System.out.print("/* Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("/* Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Retângulo cadastrado com sucesso !");
        System.out.println("/*********************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/**********************/");
        System.out.println("/*   Calculando Area  */");
        System.out.println("/**********************/");
        area = lado1 * lado2;
        System.out.println("A área é: " + area);
        System.out.println("/**********************/");
    }

    public void calcularPerimetro () {
        System.out.println("/************************/");
        System.out.println("/* Calculando Perimetro */");
        System.out.println("/************************/");
        perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*************************/");
    }

    public void exibirRetangulo() {
        System.out.println("/***************************/");
        System.out.println("/*  Informações Retângulo  */");
        System.out.println("/***************************/");
        System.out.println("O lado 1 é: " + lado1);
        System.out.println("O lado 2 é: " + lado2);
        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/****************************/");
    }
}
