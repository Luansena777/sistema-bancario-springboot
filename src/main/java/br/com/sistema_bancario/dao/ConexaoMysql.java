//package br.com.sistema_bancario.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConexaoMysql {
//    private static final String URL = "jdbc:mysql://localhost:3306/`sistemaBancario`";
//    private static final String USER = "root";
//    private static final String PASSWORD = "12345678";
//
//    public Connection connection(){
//        try {
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (SQLException e) {
//            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
//        }
//    }
//
//}