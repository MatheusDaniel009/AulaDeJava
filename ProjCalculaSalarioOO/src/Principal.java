
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        // importacao de classes
        Autonomo aut = new Autonomo();
        Horista hor = new Horista();
        //variaveis
        int op = 0;
        double salario;
        while(op != 3){
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1) funcionario autonomo"
                    + "\n2) funcionario horista"
                    + "\n3) sair do programa"
                    + "\nescolha uma opção: "));
            if(op == 1){
                   aut.nome = "alstolvo";
                   aut.registro = 9075;
                   aut.setFilial("casas baiha");
                   aut.setCargo("vendas");
                   aut.setValorTotal(30000.50);
                   aut.setPorcentagemVendas(0.10);
                   JOptionPane.showMessageDialog(null, 
                           "nome: " + aut.nome +
                           "\nregistro: " + aut.registro +
                           "\nfilial: " + aut.getFilial()+
                           "\ncargo: " + aut.getCargo() +
                           "\nvalor total R$:" + aut.getValorTotal() +
                           "\nporcentagem de vendas: " + aut.getPorcentagemVendas());
        
                    salario = aut.CalcularSalario();
                    aut.ExibirSalario(salario);   
            }
            if (op == 2){
                hor.nome = "joana";
                hor.registro = 1244;
                hor.setSetor("compras");
                hor.setFuncao("gerente");
                hor.setValorHoras(50);
                hor.setNumerosHoras(200);
                JOptionPane.showMessageDialog(null, 
                           "nome: " + hor.nome +
                           "\nregistro: " + hor.registro +
                           "\nsetor: " + hor.getSetor()+
                           "\nfunção: " + hor.getFuncao() +
                           "\nvalor hora R$:" + hor.getValorHora() +
                           "\nhoras trabalhadas: " + hor.getNumerosHoras());
                
                salario = hor.CalculaSalario();
                hor.ExibiSalario(salario);
            }
            if(op==3){
                JOptionPane.showMessageDialog(null, "programa sera fechado");
            }
            if(op >= 4){
                JOptionPane.showMessageDialog(null, "digite um valor valido!!!");
            }
        }
     
        

    }
    
}
