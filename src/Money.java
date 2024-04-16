public class Money {
    private TipoMoneda tipoMonedaOrigen;
    private TipoMoneda tipoMonedaDestino;
    private float cantidad;

    final float EURUSD = 1.18798F;
    final float USDEUR = 0.841815F;
    final float EURGBP = 0.857839F;
    final float GBPEUR = 1.165826F;
    final float USDGBP = 0.72214F;
    final float GBPUSD = 1.384773F;

    public Money() {
    }




    public double changue (TipoMoneda origen, TipoMoneda destino, float cantidad){
        float resultado = 0F;

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD && cantidad > 0){
            return resultado = EURUSD * cantidad;
        }
            else if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR && cantidad > 0) {
            return resultado = USDEUR * cantidad;
        }
            else if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP && cantidad > 0){
            return resultado = EURGBP * cantidad;
        }
            else if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR && cantidad > 0) {
            return resultado = GBPEUR * cantidad;
        }
            else if (origen == TipoMoneda.USD && destino == TipoMoneda.GBP && cantidad > 0) {
            return resultado = USDGBP * cantidad;
        }
            else if (origen == TipoMoneda.GBP && destino == TipoMoneda.USD && cantidad > 0) {
            return resultado = GBPUSD * cantidad;
        }else {
            return -1;
        }


    }

}














