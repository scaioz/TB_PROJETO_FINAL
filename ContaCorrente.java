package bancoCaio;

public class CC extends UsuarioBase {
    
    public CC(String nome, String cpf, String email, String endereco, double telefone, double rendasal) {
        super (nome, cpf, email, endereco, telefone, rendasal);
    }

    public void criarCC() {
        System.out.println(x:"CC criada com sucesso!!");
    }

    public void lerCC() {
        System.out.println(x:"Nome " + nome + ", CPF: ", + cpf + ", Email: ", + email + ", Endereço: ", + endereco + ", Telefone: ", + telefone + ", Renda Salarial: R$" + rendasal);
    }

    public void atualizarDados(String email, String endereco, double telefone, double rendasal) {
        this.email = novoEmail;
        this.endereco = novoEndereco;
        this.telefone = novoTelefone;
        this.rendasal = novaRendaSal;
        System.out.println(x:"Dados de CC atualizados com sucesso!!");
    }

    public void removerCC() {
        System.out.println(x:"CC removida com sucesso!!");
    }
}