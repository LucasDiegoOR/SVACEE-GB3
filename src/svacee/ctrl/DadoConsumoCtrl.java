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
import svacee.entity.DadoConsumo;

public class DadoConsumoCtrl {

    private File arq;
    private List<DadoConsumo> dados = new ArrayList<>();

    public void obterDadosCSV(File arq) throws FileNotFoundException, IOException {

        setArq(arq);

        String linha = "";
        String[] linhas;
        String[] coluna;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);
        
        br = new BufferedReader(fr);

        DadoConsumo dc;

        while ((linha = br.readLine()) != null) {
            linhas = linha.split(";");

            for (String v : linhas) {
                coluna = v.split(",");

                dc = new DadoConsumo();

                dc.setDataHora(Timestamp.valueOf(coluna[0]));
                dc.setIdPontoColeta(coluna[1]);
                dc.setValorKwH(Double.parseDouble(coluna[2]));

                getDados().add(dc);
            }

        }
    }

    public File getArq() {
        return arq;
    }

    public void setArq(File arq) {
        this.arq = arq;
    }

    public List<DadoConsumo> getDados() {
        return dados;
    }

    public void setDados(List<DadoConsumo> dados) {
        this.dados = dados;
    }
}
