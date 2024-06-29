package bancoCaio;

public class UsuarioNode {
    UsuarioBase usuario;
    UsuarioNode leftChild;
    UsuarioNode rightChild;

    public UsuarioNode(UsuarioBase usuario) {
        this.usuario = usuario;
        leftChild = null;
        rightChild = null;
    }
}