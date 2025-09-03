
package com.mycompany.exerciciojava;

//Olá, meu nome é Luis e eu vou fazer um código com JavaSwitch e JavaScanner
import java.util.Scanner;

public class ExercicioJava {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    //Primeira tarefa 
try{
    System.out.print("Digite um número de 1 a 4: ");
    int Passagem = scanner.nextInt();
    
    String TipoDePassagem = "";
    double Valor = 0;
    
    switch (Passagem) {
        case 1:
        TipoDePassagem = "ônibus urbano";
        Valor = 4.40;
        System.out.println("Você deseja comprar uma passagem de ônibus urbano?");
        break;

        case 2:
        TipoDePassagem = "metrô";
        Valor = 5.00;
        System.out.println("Você deseja comprar uma passagem de metrô?");
        break;

        case 3:
        TipoDePassagem = "trem intermunicipal";
        Valor = 6.50;
        System.out.println("Você deseja comprar uma passagem de trem intermunicipal?");
        break;

        case 4:
        TipoDePassagem = "ônibus rodoviário";
        Valor = 12.00;
        System.out.println("Você deseja comprar uma passagem de ônibus rodoviário?");
        break;
        
        default:
        System.out.println("Número inválido, digite novamente um número de 1 a 4.");
        break;
        }
    
        System.out.print("Digite quantas passagens você deseja: ");
        int Quantidade = scanner.nextInt();
  
        System.out.println("Você deseja "+ Quantidade +" passagem(ns) de "+ TipoDePassagem + "?");
    
        double ValorTotal = Quantidade*Valor;
        System.out.println("O valor a se pagar é de R$"+ ValorTotal);
    
    }catch(Exception e) {
    System.out.println("O valor digitado não é válido, digite outro por favor.");
        
    }finally{
    System.out.println("Obrigado por utilizar o nosso serviço.");
    }
    
//Fim da primeira tarefa

System.out.println();

//Segunda tarefa

    double Saldo = 1000;
try{
    System.out.print("Digite qual serviço você deseja de 1 a 4: ");
    int Serviço = scanner.nextInt();
    
    switch (Serviço) {
        case 1:
        System.out.println("Você deseja consultar o seu saldo?");
        System.out.println("Seu saldo é de R$"+ Saldo); 
        break;

        case 2:
        System.out.println("Você deseja sacar quanto dinheiro do seu saldo?");

        double Saque = scanner.nextDouble();

        if (Saque > Saldo) {
        System.out.println("Quantidade inválida, digite um número igual ou menor que o seu saldo.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (Saldo-Saque));
        }
        break;

        case 3:
        System.out.println("Você deseja depositar quanto dinheiro no seu saldo?");

        double Depósito = scanner.nextDouble();

        if (Depósito <= 0) {
        System.out.println("Quantidade inválida, digite um número maior que 0.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (Saldo+Depósito));
        }
        break;

        case 4:
        System.out.println("Você deseja encerrar o atendimento?");
        break;
        
        default:
        System.out.println("Número de serviço inválido, digite novamente um número de 1 a 4.");
        break;
        }
    
    }catch(Exception e) {
    System.out.println("O número não é válido, digite um valor inteiro por favor.");
        
    }finally{
    System.out.println("Obrigado por utilizar o nosso serviço.");
    }

    //Fim da segunda tarefa

    System.out.println();

    //Terceira tarefa
    
try{
    System.out.println("Escolha a faixa etária:"); 
    System.out.println("1: Criança (0 a 12)");
    System.out.println("2: Adolescente (13 a 17)");
    System.out.println("3: Adulto (18 a 59)");
    System.out.println("4: Idoso (60 ou mais)");
    
    int opção = scanner.nextInt();
    
    System.out.println();

    System.out.print("Digite a sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.println();

switch (opção) {
        case 1:
        if (idade <= 12) {
        System.out.println("Você é uma criança. Sua faixa etária é infantil.");
        }else {
        System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 2:
        if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente. Sua faixa etária é juvenil.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 3:
        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto. Sua faixa etária é adulta.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 4:
        if (idade >= 60) {
            System.out.println("Você é um idoso. Sua faixa etária é idosa.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        default:
        System.out.println("Opção inválida. Digite de 1 a 4 por favor.");
        break;
        }

    }catch(Exception e) {
    System.out.println("O valor digitado não é válido.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado por utilizar o nosso serviço.");
    }

    //Fim da terceira tarefa
        
        }
    }


