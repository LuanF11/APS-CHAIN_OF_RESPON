public class Cliente {

    public static void main(String[] args) {

                //Diminua para abaixo de 10 a quantidade de produtos para ver o desconto por valor total
                //Para que se ative o outro handle
                Produto produto = new Produto("Notebook", 800, 11);

                DescontoHandler descontoHandler1 = new DescontoPorQuantidade();
                DescontoHandler descontoHandler2 = new DescontoPorValorTotal();

                descontoHandler1.setProximo(descontoHandler2);


                double descontoFinal = descontoHandler1.calcularDesconto(produto);


                if (descontoFinal > 0) {
                    System.out.println("Desconto final aplicado: " + descontoFinal);
                } else {
                    System.out.println("Nenhum desconto aplicado.");
                }

            }
        }


