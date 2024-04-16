public class Money {
    private TipoMoneda tipoMoneda;
    private double cantidad;

    final double EURUSD = 1.18798;
    final double USDEUR = 0.841815;
    final double EURGBP = 0.857839;
    final double GBPEUR = 1.165826;

    public Money() {
    }

    public Money(TipoMoneda tipoMoneda, double cantidad) {
        this.tipoMoneda = tipoMoneda;
        this.cantidad = cantidad;
    }

    public double changue (TipoMoneda origen, TipoMoneda destino, double cantidad){
        double resultado = 0;

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD && cantidad > 0){
            return resultado = EURUSD * cantidad;
        } else if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR && cantidad > 0) {
            return resultado = USDEUR * cantidad;
        } else if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP && cantidad > 0){
            return resultado = EURGBP * cantidad;
        } else if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR && cantidad > 0) {
            return resultado = GBPEUR * cantidad;
        }else {
            return -1;
        }


    }

}














