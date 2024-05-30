

import java.sql.*;
import javax.swing.JOptionPane;


public class ControleAlunos {
    Alunos alu = new Alunos();
    private Connection conexao = null;
    private Statement st = null;
    private String servername = "127.0.0.1:3306";
    private String usuario = "root";
    private String senha = "1234";
    private String banco = "aluno";
    private String driverName = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://" + this.servername + "/" + this.banco + "?serverTimezone=America/Sao_Paulo";
    
    public void Conecta(){
        try {
            
            this.conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            st = conexao.createStatement();
            
        } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
    public void Cadastrar (int rgm, String nome, double n1, double n2){
        
        try {
            alu.setNome(nome);
            alu.setRgm(rgm);
            alu.setN1(n1);
            alu.setN2(n2);
            
            PreparedStatement sql;
            sql = conexao.prepareStatement("insert into aluno (rgm, nome, n1, n2) values (?,?,?,?)");
            sql.setInt(1, alu.getRgm());
            sql.setString(2, alu.getNome());
            sql.setDouble(3, alu.getN1());
            sql.setDouble(4, alu.getN2());
            
            int valor = sql.executeUpdate();
            
            if (valor == 1){
                JOptionPane.showMessageDialog(null, "cadastro realizado com exeto!!!");
            }
            else{
                
                JOptionPane.showMessageDialog(null, "cadastro não realizado!!!");
            }
            
        } catch (Exception e){
            System.out.println("erro SQL: "+ e);
        }
    }
    
    public void Listar(){
        
        PreparedStatement sql;
        ResultSet rs;
        
        try {
            sql = conexao.prepareCall("select * from aluno");
            rs = sql.executeQuery();
            
            while (rs.next()){
                
                System.out.println("RGM: " + rs.getString("rgm"));
                System.out.println("nome: " + rs.getString("nome"));
                System.out.println("nota 1: " + rs.getString("n1"));
                System.out.println("nota 2:" + rs.getString("n2"));
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "erro: " + e);
        }
    }
    
    public String Exibir (int rgm){
        PreparedStatement sql;
        ResultSet rs;
        
        String lista = "";
        
        try {
            
            sql = conexao.prepareCall("select * from aluno where rgm = " + rgm );
            rs = sql.executeQuery();
            
            if(rs.next()){
                lista = rs.getString("rgm") + ";" + rs.getString("nome") + ";" +
                        rs.getString("n1") + ";" + rs.getString("n2")+ ";"; 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        
        return lista;
    }
    
    public void Alterar ( int rgm, String nome, double n1, double n2) {
        
        try{
            alu.setRgm(rgm);
            alu.setNome(nome);
            alu.setN1(n1);
            alu.setN2(n2);
            PreparedStatement sql;
            sql = conexao.prepareCall("UPDATE aluno SET nome = ?, n1 = ?, n2 = ? WHERE rgm = ?");
            sql.setString(1, alu.getNome());
            sql.setDouble(2, alu.getN1());
            sql.setDouble(3, alu.getN2());
            sql.setInt(4, alu.getRgm());
            
            int valor = sql.executeUpdate();
            
            if (valor == 1){
                JOptionPane.showMessageDialog(null, "Alteração  efeituada com exeto!!!");
            } else {
                JOptionPane.showMessageDialog(null, "alteração nao realizado!!!");
            } 
        }catch (Exception e){
                    System.out.println("Erro SQL: " + e);
                    }
    }
    
    public void Excluir (int rgm){
        try{
            
            alu.setRgm(rgm);
            
            PreparedStatement sql;
            sql = conexao.prepareStatement("delete from aluno WHERE rgm = " + alu.getRgm());
            int valor = sql.executeUpdate();
            
            if (valor == 1){
                
                JOptionPane.showMessageDialog(null, "Exclução feito com exeto !!!");
            } else {
                
                JOptionPane.showMessageDialog(null, "exclução nao realizado!!!");
            }
        } catch (Exception e){
            
            System.out.println("Erro Sql" + e);
        }
    }
    
    
}
