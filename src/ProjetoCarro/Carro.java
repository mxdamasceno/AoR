package ProjetoCarro;

public class Carro {
    String modelo, cor, marca, chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    double velocMaxima, velocAtual, volCombustivel;
    boolean tetoSolar, cambioAutomatico;
    Proprietario proprietario;

    void acelera(){
        velocAtual += 1;
    }

    void freia(){
        velocAtual = 0;
    }

    void trocaMarcha(int marchaDesejada){
        if(marchaDesejada > nMarchas){
            System.out.println("Marcha Inesxistente!");
        }else marchaAtual = marchaDesejada;
    }

    void reduzMarcha(){
        marchaAtual -= 1;
    }


}
