package svacee.ctrl;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import svacee.entity.SvaceeDadoConsumo;

public class SvaceeDadoConsumoCtrl {

    private File arq;
    private List<SvaceeDadoConsumo> dados = new ArrayList<>();
    private List<String> listaPontoColeta = new ArrayList<>();
    private List<SvaceeDadoConsumo> listaGrafico = new ArrayList<>();

    public void obterDadosCSV(File arq) throws FileNotFoundException, IOException {

        setArq(arq);

        String linha = "";
        String[] linhas;
        String[] coluna;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);

        br = new BufferedReader(fr);

        SvaceeDadoConsumo sdc;

        while ((linha = br.readLine()) != null) {
            linhas = linha.split(";");

            for (String v : linhas) {
                coluna = v.split(",");

                sdc = new SvaceeDadoConsumo();

                sdc.setDataHora(Timestamp.valueOf(coluna[0]));
                sdc.setIdPontoColeta(coluna[1]);
                sdc.setValorKwH(Double.parseDouble(coluna[2]));

                getDados().add(sdc);
            }
        }
    }

    public void preencherPontoColeta() {
        for (SvaceeDadoConsumo sdc : getDados()) {
            if (!listaPontoColeta.contains(sdc.getIdPontoColeta())) {
                getListaPontoColeta().add(sdc.getIdPontoColeta());
            } else {
                //System.out.println("Ponto já existente!");
            }
        }
    }

    public void preencherGrafico(String item) {
        for (SvaceeDadoConsumo sdc : getDados()) {
            if (sdc.getIdPontoColeta().equalsIgnoreCase(item)) {
                sdc.getDataHora();
                sdc.getValorKwH();
                getListaGrafico().add(sdc);

            }
        }
    }

    public File getArq() {
        return arq;
    }

    public void setArq(File arq) {
        this.arq = arq;
    }

    public List<SvaceeDadoConsumo> getDados() {
        return dados;
    }

    public void setDados(List<SvaceeDadoConsumo> dados) {
        this.dados = dados;
    }

    public List<String> getListaPontoColeta() {
        return listaPontoColeta;
    }

    public void setListaPontoColeta(List<String> listaPontoColeta) {
        this.listaPontoColeta = listaPontoColeta;
    }

    public List<SvaceeDadoConsumo> getListaGrafico() {
        return listaGrafico;
    }

    public void setListaGrafico(List<SvaceeDadoConsumo> listaGrafico) {
        this.listaGrafico = listaGrafico;
    }
}
