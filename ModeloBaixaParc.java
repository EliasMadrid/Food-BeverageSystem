/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bookafe
 */
public class ModeloBaixaParc {
    private int codParc;
    private String dataVenc;
    private int codVend;
    private float valor;
    

    /**
     * @return the codParc
     */
    public int getCodParc() {
        return codParc;
    }

    /**
     * @param codParc the codParc to set
     */
    public void setCodParc(int codParc) {
        this.codParc = codParc;
    }

    /**
     * @return the dataVenc
     */
    public String getDataVenc() {
        return dataVenc;
    }

    /**
     * @param dataVenc the dataVenc to set
     */
    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    /**
     * @return the codVend
     */
    public int getCodVend() {
        return codVend;
    }

    /**
     * @param codVend the codVend to set
     */
    public void setCodVend(int codVend) {
        this.codVend = codVend;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
}
