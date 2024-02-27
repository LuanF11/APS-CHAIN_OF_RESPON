public class DescontoPorValorTotal implements DescontoHandler {

    private DescontoHandler proximo;

    @Override
    public void setProximo(DescontoHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public double calcularDesconto(Produto produto) {
        if (produto.getValorTotal() > 1000) {
            System.out.println("DescontoPorValorTotal: Aplicando desconto de 5% para valor total acima de 1000");
            return produto.getValor() * 0.05;
        } else if (proximo != null) {
            System.out.println("DescontoPorValorTotal: Passando para o próximo handler");
            return proximo.calcularDesconto(produto);
        } else {
            System.out.println("DescontoPorValorTotal: Nenhum desconto aplicado");
            return 0;
        }
    }
}
