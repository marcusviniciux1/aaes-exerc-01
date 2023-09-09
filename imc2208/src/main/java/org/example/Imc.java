package org.example;

public class Imc {
    private float peso;
    private float altura;
    private float imc;
    private String sexo;
    private String resultado;

    public String calcularImc() {
        imc = (peso / (altura * altura));

        if (sexo.equals("f")) {
            if (imc < 19.1f) {
                resultado = "abaixo do peso";
            } else if (imc < 25.8f) {
                resultado = "no peso normal";
            } else if (imc < 27.3f) {
                resultado = "marginalmente acima do peso";
            } else if (imc < 32.3f) {
                resultado = "acima do peso ideal";
            } else {
                resultado = "obesa";
            }
        } else {
            if (imc < 20.7f) {
                resultado = "abaixo do peso";
            } else if (imc < 26.4f) {
                resultado = "no peso normal";
            } else if (imc < 27.8f) {
                resultado = "marginalmente acima do peso";
            } else if (imc < 31.1f) {
                resultado = "acima do peso ideal";
            } else {
                resultado = "obeso";
            }
        }
        return resultado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!(sexo.equals("f")) && !(sexo.equals("m"))) {
            throw new IllegalArgumentException("Sexo invalido");
        }
        this.sexo = sexo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

