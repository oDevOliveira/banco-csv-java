import java.io.*;
import java.util.*;
public class ObjetosBancoCsv {
    public static ArrayList <String> nomes = new ArrayList<>();
    public static ArrayList <String> codigo = new ArrayList<>();
    public static ArrayList <Double> saldo = new ArrayList<>();
    public static Scanner scnr = new Scanner(System.in);
   public static Random rdm = new Random();
    
        public static void Iniciar(){
            try{
            BufferedReader leitor = new BufferedReader(new FileReader("docm.csv"));
                codigo.clear();
                 nomes.clear();
                 saldo.clear();
                 
                 String linha;
                int ctdr = 0;
                while((linha = leitor.readLine()) != null){
                    String[] dados = linha.split(";");
                    codigo.add((dados[0]));
                    nomes.add(dados[1]);
                    saldo.add(Double.parseDouble(dados[2]));
                    
                }
            }catch(IOException e){
                System.out.println("ERRO!!");
            }
        }
   public static void CriarConta(){
        
        System.out.println("DIGITE SEU NOME:");
            String nomeCriar = scnr.next();
            System.out.println("DIGITE O VALOR DO SEU PRIMEIRO DEPOSITO:");
            double depositoInicial = scnr.nextDouble();
             scnr.nextLine();
            
            String codigoCriar = "";
            for(int i = 0; i < 3;i++){
                codigoCriar += String.valueOf(rdm.nextInt(99));
            }
        
        codigo.add(codigoCriar);
        nomes.add(nomeCriar);
        saldo.add(depositoInicial);
            
            System.out.println("\nConta Criada!!\n");
        
    }
   public static void VerContas(){
        for(int x = 0; x < codigo.size(); x++){
            System.out.println("\n" + codigo.get(x) + ";" + nomes.get(x) + ";" + saldo.get(x));
        }
        System.out.println("\nConcluido!!\n");
    }
   public static void Depositar(){
        System.out.println("DIGITE O CODIGO DA CONTA");
        String contaDeposito = scnr.next();
        System.out.println("DIGITE O VALOR DO DEPOSITO");
        double valorDeposito = scnr.nextDouble();
        
        
        for(int z = 0; z < codigo.size(); z++){
            if(codigo.get(z).equals(contaDeposito)){
                saldo.set(z, (saldo.get(z) + valorDeposito));
            }
        }
        System.out.println("\nDeposito Concluido\n");
    }
   public static void Sacar(){
        System.out.println("DIGITE O CODIGO DA CONTA");
        String contaSaque = scnr.next();
        System.out.println("DIGITE O VALOR DO SAQUE");
        double valorSaque = scnr.nextDouble();
        
        
        for(int z = 0; z < codigo.size(); z++){
            if(codigo.get(z).equals(contaSaque)){
                saldo.set(z, (saldo.get(z) - valorSaque));
                    System.out.println("\nSaque realizado!!\n");
            }
        }
    }
   public static void Transferir(){
        System.out.println("DIGITE O CODIGO DA SUA CONTA");
        String contaTransferencia = scnr.next();
        System.out.println("DIGITE O CODIGO DA CONTA DESTINO");
        String contaDestino = scnr.next();
        System.out.println("DIGITE O VALOR DO DEPOSITO");
        double valorTransferencia = scnr.nextDouble();
        
        double saldoOrigem;
            double saldoDestino;
                
            for(int z = 0; z < codigo.size(); z++){
            if(codigo.get(z).equals(contaTransferencia)){
                saldo.set(z, (saldo.get(z) - valorTransferencia));
            }
        }    
            for(int z = 0; z < codigo.size(); z++){
            if(codigo.get(z).equals(contaDestino)){
                saldo.set(z, (saldo.get(z) + valorTransferencia));
            }
        }
        
        System.out.println("\nTransferencia Concluida!!\n");
   }
     public static void SalvarCsv(){
          try{
          BufferedWriter escritorSalvar = new BufferedWriter(new FileWriter("docm.csv"));
          for(int y = 0; y < codigo.size(); y++){
               escritorSalvar.write(codigo.get(y) + ";" + nomes.get(y) + ";" + saldo.get(y));
               escritorSalvar.newLine();
               
          }
               escritorSalvar.close();
             }catch(IOException e){
          System.out.println("ERRO");  
     }
     }
    
}