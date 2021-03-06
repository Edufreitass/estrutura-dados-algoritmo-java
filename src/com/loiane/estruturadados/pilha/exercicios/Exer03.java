package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<>(20);

		Livro livro1 = new Livro();

		livro1.setNome("Java Efetivo: as Melhores Práticas Para a Plataforma Java");
		livro1.setAutor("Joshua Bloch");
		livro1.setAnoLancamento(2019);
		livro1.setIsbn("8550804622");

		Livro livro2 = new Livro();

		livro2.setNome("OCA Java SE 8: Guia de Estudos para o Exame 1Z0-808");
		livro2.setAutor("Edward Finegan");
		livro2.setAnoLancamento(2018);
		livro2.setIsbn("8582604769");

		Livro livro3 = new Livro();

		livro3.setNome("Java®: Como Programar");
		livro3.setAutor("Paul Deitel");
		livro3.setAnoLancamento(2016);
		livro3.setIsbn("8543004799");

		Livro livro4 = new Livro();

		livro4.setNome("Use a Cabeça!: Java");
		livro4.setAutor("Bert Bates");
		livro4.setAnoLancamento(207);
		livro4.setIsbn("8576081733");

		Livro livro5 = new Livro();

		livro5.setNome("Java Guia do Programador - 3ª Edição: Atualizado Para Java 8");
		livro5.setAutor("Peter Jandl Junior");
		livro5.setAnoLancamento(2015);
		livro5.setIsbn("8575224441");

		Livro livro6 = new Livro();

		livro6.setNome("Java Para Leigos ");
		livro6.setAutor("Barry Burd");
		livro6.setAnoLancamento(2013);
		livro6.setIsbn("8576088010");

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

		System.out.println("Empilhando livros na pilha");

		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);

		System.out.println(pilha.tamanho() + " livros foram empilhados");
		System.out.println(pilha);

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

		System.out.println("Espiando o topo da pilha: " + pilha.topo());

		System.out.println("Desempilhando livros da pilha");

		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: " + pilha.desempilha());
		}

		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());

	}

}
