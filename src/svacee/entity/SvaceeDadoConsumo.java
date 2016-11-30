package svacee.entity;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.sql.Timestamp;

public class SvaceeDadoConsumo {

    private Timestamp dataHora;
    private String idPontoColeta;
    private double valorKwH;
    
    public SvaceeDadoConsumo(){
        
    }

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
