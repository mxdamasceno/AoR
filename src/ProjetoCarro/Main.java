package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Paulo";
        proprietario.bairro = "Jurunas";
        proprietario.cep = "660033";
        proprietario.cidade = "Belém";
        proprietario.cpf = "66000888892";
        proprietario.datNascimento = "09/10/2017";
        proprietario.estado = "Pará";
        proprietario.rg = "342682";
        proprietario.complemento = "casa";

        Carro carro = new Carro();
        carro.nPortas = 5;
        carro.nMarchas = 5;
        carro.marchaAtual = 1;
        carro.proprietario = proprietario;
        carro.velocAtual = 10;

        System.out.println(carro.velocAtual);
        carro.acelera();
        carro.acelera();
        System.out.println(carro.velocAtual);

        System.out.println(carro.marchaAtual);
        carro.trocaMarcha(3);
        System.out.println(carro.marchaAtual);
    }
}
