package contabancaria;

public class Conta {
    private double saldo;
    private final double limiteChequeEspecial;
    

    
    public Conta(double DepositoInicial){
        this.saldo = DepositoInicial;
        if (DepositoInicial <= 500){
            this.limiteChequeEspecial = 50.00;
        }else{
            this.limiteChequeEspecial = DepositoInicial * 0.50;
        }
    }

    public  double consultarSaldo(){
        return saldo;
    }
    public  double consultarCheque(){
        return limiteChequeEspecial;
    }
    public  double consultarSaldoDisponivel(){
        return saldo + limiteChequeEspecial;
    }

    public boolean estaUsandoCheque(){
        return saldo < 0;
    }

    public void depositar(double valor){
        if (valor <= 0) {
           System.out.println("Valor de depósito inválido, deve ser acima de 0");
        }
        this.saldo = saldo + valor;
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor indisponível para saque");
            return false;
        }else if(valor > consultarSaldoDisponivel()){
            System.out.println("Saldo indisponível, mesmo com o cheque especial");
            return false;
        }
        this.saldo -= valor;
        System.out.printf( "Saque de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, this.saldo);
        if (estaUsandoCheque()) {
            System.out.printf("Atenção: Você está usando R$ %.2f do cheque especial.\n", Math.abs(this.saldo));
        }
        return true;

        
    }

    public boolean pagarBoleto(double valor){
        System.out.println("Pagando boleto...");
        return sacar(valor);
    }
}
