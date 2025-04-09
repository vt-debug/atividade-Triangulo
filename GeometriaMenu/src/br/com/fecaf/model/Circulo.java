package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {

    public double raio, area, perimetro, diametro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarCirculo() {
        System.out.println("/***********************/");
        System.out.println("/* Cadastrando Circulo */");
        System.out.println("/***********************/");
        System.out.print("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/************************/");
        System.out.println("/*   Calculando Area    */");
        System.out.println("/************************/");
        //area = 3.14159 * (raio * raio);
        //area = Math.PI * (raio * raio);
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é: " + area);
        System.out.println("/************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/**************************/");
        System.out.println("/* Calculando Perimetro   */");
        System.out.println("/**************************/");
        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/**************************/");
    }
    public void exibirCirculo () {
        System.out.println("/************************/");
        System.out.println("/* Informações Circulo  */");
        System.out.println("/************************/");
        System.out.println("O raio é: " + raio);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/***************************/");
    }




}
