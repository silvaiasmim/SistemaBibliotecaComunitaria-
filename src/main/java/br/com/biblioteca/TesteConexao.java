package br.com.biblioteca;

import br.com.biblioteca.conexao.ConexaoBanco;
import java.sql.Connection;

public class TesteConexao {

    public static void main(String[] args) {

        try {
            Connection conexao = ConexaoBanco.conectar();

            if (conexao != null) {
                System.out.println("Conexão feita");
            }

            conexao.close();

        } catch (Exception e) {
            System.out.println("Deu errado");
            System.out.println(e.getMessage());
        }

    }
}