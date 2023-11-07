/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.app;

import br.edu.utfpr.devolucao.Devolucao;
import br.edu.utfpr.emprestimo.Emprestimo;
import br.edu.utfpr.filme.Exemplar;
import br.edu.utfpr.filme.Filme;
import br.edu.utfpr.filme.Midia;
import br.edu.utfpr.pagamento.Cartao;
import br.edu.utfpr.pagamento.Pix;

/**
 *
 * @author lamb
 */
public class App {

    public static void main(String[] args) {
        Filme titanic = new Filme("Titanic", "Drama");
        // titanic.mostrarFilme();
        Midia dvd = new Midia("DVD", titanic);
        // dvd.mostrar();
        Exemplar ex01 = new Exemplar(01, dvd);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.adicionar(ex01);
        emprestimo.emprestar();
        emprestimo.emprestar();
        //Devolucao devolucao = new Devolucao(emprestimo);
        //devolucao.setP(new Pix());
        //devolucao.devolver();
    }
}
