public interface DescontoHandler {

    void setProximo(DescontoHandler proximo);
    double calcularDesconto(Produto produto);
}
