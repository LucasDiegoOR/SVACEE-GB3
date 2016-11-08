package svacee.ctrl;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.sql.Timestamp;

public class DadoConsumoCtrl {

    private Timestamp dataHora = new Timestamp(System.currentTimeMillis());
    private String idPontoColeta;
    private double valorKwH;

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public String getIdPontoColeta() {
        return idPontoColeta;
    }

    public void setIdPontoColeta(String idPontoColeta) {
        this.idPontoColeta = idPontoColeta;
    }

    public double getValorKwH() {
        return valorKwH;
    }

    public void setValorKwH(double valorKwH) {
        this.valorKwH = valorKwH;
    }
}
