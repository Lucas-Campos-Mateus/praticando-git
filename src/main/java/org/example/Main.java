package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Lucas", 25);
        Pessoa pessoa1 = new Pessoa("Lucas1", 251);

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);

            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
            System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        }
    }
}