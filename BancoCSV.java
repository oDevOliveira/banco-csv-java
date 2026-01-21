class BancoCSV{
    public static void main(String[] args){
        System.out.println("BANCO.JAVA COM ARMAZENAMENTO EM CSV!!");
        int chc;
        do{
            ObjetosBancoCsv.Iniciar();
            System.out.println("ESCOLHA:\n1. Criar Contas\n2. Ver Contas\n3. Depositar\n4. Sacar\n5. Transferir\nQlqr outra opção. Sair!!");
            chc = ObjetosBancoCsv.scnr.nextInt();
            
         switch(chc){
             case 1:
             ObjetosBancoCsv.CriarConta();
             ObjetosBancoCsv.SalvarCsv();
             break;
             
             case 2:
             ObjetosBancoCsv.VerContas();
             break;
             
             case 3:
             ObjetosBancoCsv.Depositar();
             ObjetosBancoCsv.SalvarCsv();
             break;
             
             case 4:
             ObjetosBancoCsv.Sacar();
             ObjetosBancoCsv.SalvarCsv();
             break;
             
             case 5:
             ObjetosBancoCsv.Transferir();
             ObjetosBancoCsv.SalvarCsv();
             break;
         }
        }while(chc < 6 && chc > 0);
        System.out.println("PROGRAMA ENCERRADO!!");
    }
}