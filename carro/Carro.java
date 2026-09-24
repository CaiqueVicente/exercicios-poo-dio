package carro;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;
    
    public Carro(){
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }
    
    public boolean carroLigado(){
        return ligado;
    }
    
    public void LigarCarro(){
        if(ligado){
            System.out.println("Carro já está ligado!");
            return;
        }
        ligado = true;
        System.out.println("Carro ligado!");
    }
    
    
    public void DesligarCarro(){
        if(!ligado){
            System.out.println("Carro já está desligado!");
            return;
        }
        if(marcha != 0 || velocidade != 0){
            System.out.println("Só pode desligar em ponto morto com velocidade 0");
        }
        ligado = false;
        System.out.println("Carro desligado!");
    }
    
    
    public int getMarcha(){
        return marcha;
    
    }


    public int verificarVelocidade(){
        return velocidade;
    }
    
    public void AcelerarCarro(){
       if(!ligado){
        System.out.println("Carro precisa estar ligado para acelerar");
        return;
       }
       if (marcha == 0) {
        System.out.println("Não pode acelerar em ponto morto");
       }
       if (velocidade >= 120) {
        System.out.println("velocidade máxima 120km/h");
       }
       if(velocidade + 1 > getMaxDaMarcha(marcha)){
        System.out.println("Velocidade máxima da " + marcha + "ª marcha é " + getMaxDaMarcha(marcha) + "km/h. Troque para " + (marcha + 1) + "ª");
        return;
       }
       velocidade++;
       System.out.println("Acelerando para " + velocidade + " km/h");
       
    }

    public void reduzirVelocidade(){
        if (!ligado) {
            System.out.println("Carro precisa estar ligado para realizar função");
        }
        if(velocidade == 0) {
            System.out.println("carro precisa estar em movimento para reduzir");
            return;
         }
        if (velocidade - 1 < getMinDaMarcha(marcha)) {
            System.out.println("precisa reduzir a marcha para " + (marcha - 1) + "ª");
            return;
        }
        velocidade--;
        System.out.println("Reduzindo para " + velocidade + "km/h");
        
    }

    public void trocarMarcha(int novaMarcha){
        if (!ligado) {
            System.out.println("Carro desligado, não troca marcha");
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não pode pular marcha! Você está na " + marcha + " e tentou ir para " + novaMarcha);
            return;
        }
        if (novaMarcha == 0 && velocidade > 20) {
            System.out.println("Só pode ir para ponto morto até 20km/h");
            return;
        }
        marcha = novaMarcha;
        System.out.println(marcha == 0 ? "Agora em ponto morto" : "Marcha " + marcha + " engatada");
    }


    public void virarEsquerda(){  
        virar("Esquerda");
    }
    public void virarDireita(){
        virar("Direita");
    }

    public void virar(String direcao){
        if (!ligado) {
            System.out.println("Carro delisgado, não pode virar");
        }
        if (marcha < 1 || velocidade > 40) {
            System.out.println("só pode virar entre 1 e 40km/h você está a " + velocidade);
            return;
        }
        System.out.println("Virando para " + direcao + "a " + velocidade + "km/h");
    }

    private int getMinDaMarcha(int m) {
        if (m == 0) return 0;
        if (m == 1) return 0;
        if (m == 2) return 21;
        if (m == 3) return 41;
        if (m == 4) return 61;
        if (m == 5) return 81;
        return 101; // 6
    }

    private int getMaxDaMarcha(int m) {
        if (m == 0) return 0;
        if (m == 1) return 20;
        if (m == 2) return 40;
        if (m == 3) return 60;
        if (m == 4) return 80;
        if (m == 5) return 100;
        return 120; // 6
    }

    
}


