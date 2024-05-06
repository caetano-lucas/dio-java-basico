
public class caneta {

    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("uma caneta: " + this.cor);
        System.out.println(this.carga + this.ponta + this.modelo);
        System.out.println(tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("nao pode rabiscar");
        } else {
            System.out.println("escrevendo");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
