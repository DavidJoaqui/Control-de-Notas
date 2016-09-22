/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica_Notas;

/**
 *
 * @author DavidJP
 */
public class ConsolidadoNotas {

    private int codest;
    private int codasg;
    private String nomasg;
    private float nota1;
    private float nota2;
    private float nota3;
    private String definitiva;

    public ConsolidadoNotas() {
    }

    public ConsolidadoNotas(int codest, int codasg, String nomasg, float nota1, float nota2, float nota3, String definitiva) {
        this.codest = codest;
        this.codasg = codasg;
        this.nomasg = nomasg;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.definitiva = definitiva;
    }

    public int getCodest() {
        return codest;
    }

    public void setCodest(int codest) {
        this.codest = codest;
    }

    public int getCodasg() {
        return codasg;
    }

    public void setCodasg(int codasg) {
        this.codasg = codasg;
    }

    public String getNomasg() {
        return nomasg;
    }

    public void setNomasg(String nomasg) {
        this.nomasg = nomasg;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(String definitiva) {
        this.definitiva = definitiva;
    }
}
