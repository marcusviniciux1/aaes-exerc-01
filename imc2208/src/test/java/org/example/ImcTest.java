package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {
    Imc imc;

    @BeforeEach
    void setUp() {
        imc = new Imc();
    }

    @Test
    void deveRetornarPessoaFemininaAbaixoPeso() {
        imc.setAltura(1.0f);
        imc.setPeso(19.0f);
        imc.setSexo("f");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaFemininaNoPesoNormal() {
        imc.setAltura(1.0f);
        imc.setPeso(25.7f);
        imc.setSexo("f");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaFemininaMarginalmenteAcimaDoPeso() {
        imc.setAltura(1.0f);
        imc.setPeso(27.2f);
        imc.setSexo("f");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaFemininaAcimaPesoIdeal() {
        imc.setAltura(1.0f);
        imc.setPeso(32.2f);
        imc.setSexo("f");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaFemininaObesa() {
        imc.setAltura(1.0f);
        imc.setPeso(32.3f);
        imc.setSexo("f");
        assertEquals("obesa", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaMasculinaAbaixoPeso() {
        imc.setAltura(1.0f);
        imc.setPeso(19.0f);
        imc.setSexo("m");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaMasculinaNoPesoNormal() {
        imc.setAltura(1.0f);
        imc.setPeso(25.7f);
        imc.setSexo("m");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaMasculinaMarginalmenteAcimaDoPeso() {
        imc.setAltura(1.0f);
        imc.setPeso(27.2f);
        imc.setSexo("m");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaMasculinaAcimaPesoIdeal() {
        imc.setAltura(1.0f);
        imc.setPeso(31.0f);
        imc.setSexo("m");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarPessoaMasculinaObesa() {
        imc.setAltura(1.0f);
        imc.setPeso(31.1f);
        imc.setSexo("m");
        assertEquals("obeso", imc.calcularImc());
    }

    @Test
    void deveRetornarExcecaoSexoInvalido() {
        try {
            imc.setSexo("01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo invalido", e.getMessage());
        }
    }
}