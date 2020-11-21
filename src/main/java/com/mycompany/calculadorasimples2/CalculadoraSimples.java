package com.mycompany.calculadorasimples2;

public class CalculadoraSimples {

    public static void main(String[] args) {
        System.out.printf("Olá, sou a calculadora simples %n Escolha qual"
                + " operação deseja saber o resultado %n");
        System.out.println("OBS: Apenas valores inteiros.");

        int operacao = 4;
        String nome;
        int n1 = 2;
        int n2 = 7;
        int resul;

        switch (operacao) {
            case 1:
                nome = "soma";
                resul = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resul);
                break;
            case 2:
                nome = "subtracao";
                resul = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resul);
                break;
            case 3:
                nome = "multiplicacao";
                resul = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resul);
                break;
            case 4:
                nome = "divisao";
                resul = n1 / n2;
                if (n1 < n2) {
                    System.out.println("ERRO:Divisor maior que dividendo");
                } else {
                    System.out.println(n1 + " / " + n2 + " = " + resul);
                }

        }
    }//fim do main

    public int soma(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double media(double[] v) {
        double somam = 0;
        for (int i = 0; i < v.length; i++) {
            somam += v[i];
        }
        return somam / v.length;
    }

    public double maximo(double[] v) {
        double max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return max;
    }

    public double soma_seq(int n) {
        int acum = 0;
        for (int i = 1; i <= n; i++) {
            acum += i;
        }
        return acum;

    }

    public double media2(double n1, double n2) {
        double med = 0;
        med = (n1 + n2) / 2.0;
        return med;
    }

    public double potencia(double n1, int n2) {
        double acum = 1;
        for (int i = 0; i < n2; i++) {
            acum *= n1;
        }
        return acum;

    }

    public int soma_quadrados(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            int quad = i * i;
            soma += quad;
        }
        return soma;
    }

    public int soma_quadrados_vetor(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            int quadv = v[i] * v[i];
            soma += quadv;
        }
        return soma;
    }

    public int mult_vetor(int[] v) {
        int mult = 1;
        for (int i = 0; i < v.length; i++) {
            mult *= v[i];
        }
        return mult;
    }

    public void duplica_vetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            v[i] = v[i] * 2;

        }
    }

    public void incrementa_vetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] += 1;
        }
    }

    public void soma_acumulativa(int[] v) {
        for (int i = 1; i < v.length; i++) {
            v[i] = v[i] + v[i - 1];
        }
    }

    public void positivos(int[] v) {
        //y=x*-1
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                v[i] = -v[i];
            }
        }

    }

    public void inverte(int[] v) {
        int n = v.length;
        for (int i = 0; i < n / 2; i++) {
            int tmp = v[i];
            v[i] = v[n - i - 1];
            v[n - i - 1] = tmp;

        }
    }

    public int[] sequencia(int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = i + 1;
        }
        return v;
    }
    
    public int[] sequencia_quadrados (int n){
        int[]v = new int[n];
        for (int i = 1; i <= n; i++) {
            v[i-1] =  i*i;//(v[i] = (i+1)*(i+1)
            
        }
        return v;
       
    }

    
}//fim da classe
