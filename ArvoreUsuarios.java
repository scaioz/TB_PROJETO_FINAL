package bancoCaio;

public class ArvoreUsuarios {
    private UsuarioNode root;

    public ArvoreUsuarios() {
        root = null;
    }

    private UsuarioNode inserirRercursivo(UsuarioNode node, UsuarioBase usuario) {
        if (node == null) {
            return new UsuarioNode(usuario);
        }

        if (usuario.getNome().compareTo(node.usuario.getNome()) < 0) {
            node.leftChild = inserirRercursivo(node.leftChild, usuario);
        }
        
        else if (usuario.getNome().compareTo(node.usuario.getNome()) > 0) {
            node.rightChild = inserirRercursivo(node.rightChild, funcionario);
        }

        return node;
    }

    public void inserir(UsuarioBase usuario) {
        root = inserirRercursivo(root, usuario);
    }

    private UsuarioBase buscarRecursivo(UsuarioNode node, String nome) {
        if (node == null || node.usuario.getNome().equals(nome)) {
            return node == null ? null : node.usuario;
        } //verificação se a arvore esta vazia

        if (nome.compareTo(node.usuario.getNome()) < 0) {
            return buscarRecursivo(node.leftChild, nome);
        } else {
            buscarRecursivo(node.rightChild, nome);
        }

        return null;
    }

    public UsuarioBase buscar(String nome) {
        return buscarRecursivo(root, nome);
    }

    private UsuarioBase removerRecursivo(UsuarioNode node, String nome) {
        if (node == null) {
            return null;
        }

        if (nome.compareTo(node.usuario.getCpf()) < 0) {
            node.leftChild = removerRecursivo(node.leftChild, nome);
        } else if (nome.compareTo(node.funcionario.getNome()) > 0) {
            node.rightChild = removerRecursivo(node.rightChild, nome);
        } else {
            if (node.leftChild ==  null) {
                return node.rightChild;
                } else if (node.rightChild == null) {
                    return node.leftChild;
                 }
            node.funcionario = minValue(node.rightChild);
            node.rightChild = removerRecursivo(node.recursividade, node.funcionario.getNome());
        }
        return node;
    }

    public void inserir(UsuarioBase usuario) {
        root = inserirRercursivo(root, usuario);
    }

    private UsuarioBase minValue(UsuarioNode node) {
        UsuarioBase menorUsuario = node.usuario;
        while(node.leftChild != null) {
            menorUsuario = node.leftChild.usuario;
            node = node.leftChild;
        }


        return menorUsuario
    }

    public void atualizarDados(String nome, String email, String endereco, double telefone, double novaRendaSal) {
        UsuarioBase usuarioParaAtualizar = buscar(nome);
        if (usuarioParaAtualizar != null) {
            usuarioParaAtualizar.setEmail(email);
            usuarioParaAtualizar.setEndereco(endereco);
            usuarioParaAtualizar.setTelefone(telefone);
            usuarioParaAtualizar.setRendaSal(novaRendaSal);
            System.out.println(x:"Dados do usuario atualizados com sucesso!!");
        } else {
            System.out.println(x:"Não foi encontrado esse usuario na base :(");
        }
    }

}