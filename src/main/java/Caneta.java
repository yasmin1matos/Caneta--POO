public class Caneta {
     public String modelo;
     private float ponta;
     private String cor;
     private boolean tampada;

     public  Caneta(String c, String m, float p){
         this.cor = c;
         this.modelo = m;
         this.ponta = p;

     }

     public String getcor(){
          return this.cor;
     }
     public void setCor(String m){
          this.modelo= m;
     }

     public String getModelo(){
          return this.modelo;
     }
     public void setModelo(String m){
          this.modelo= m;
     }
     public float getPonta(){
          return this.ponta;
     }
     public void setPonta(float p){
          this.ponta = p;
     }

     public void tampar(){
          this.tampada = true;
     }
     public void destampar(){
          this.tampada = false;
     }

     public void status(){
          System.out.println("Sobre a caneta: ");
          System.out.println("modelo: " + this.getModelo());
          System.out.println("Ponta: " + this.getPonta());
          System.out.println("Cor: " + this.getcor());

     }



}
