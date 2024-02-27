public class DescontoPorQuantidade implements DescontoHandler {

    private DescontoHandler proximo;

    @Override
    public void setProximo(DescontoHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public double calcularDesconto(Produto produto) {
        if (produto.getQuantidade() > 10) {
            System.out.println("DescontoPorQuantidade: Aplicando desconto de 10% para mais de 10 unidades");
            return produto.getValor() * 0.1;
        } else if (proximo != null) {
            System.out.println("DescontoPorQuantidade: Passando para o próximo handler");
            return proximo.calcularDesconto(produto);
        } else {
            System.out.println("DescontoPorQuantidade: Nenhum desconto aplicado");
            return 0;
        }

    }


}
