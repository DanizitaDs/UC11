/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class AppTestCadastro {

    private Cadastro cad;

    @BeforeEach

    @Test
    public void testeValidarNomeCerto() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auau");
        assertTrue(cadastro.validarNome("danielle"));
    }

    @Test
    public void testeValidarNomeErrado() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auau");
        assertFalse(cadastro.validarNome(""));
    }

    @Test
    public void testeValidarEmailCerto() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auau");
        assertTrue(cadastro.validarEmail("danipadilha@gmail.com"));
    }

    @Test
    public void testeValidarEmailErrado() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auau");
        assertFalse(cadastro.validarEmail(""));
        assertFalse(cadastro.validarEmail("@dani.com"));
        assertFalse(cadastro.validarEmail(".dani@gmail"));
        assertFalse(cadastro.validarEmail("dani@gmail"));
        assertFalse(cadastro.validarEmail(".danigmail"));
    }

    @Test
    public void testeValidarSenhaCerta() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auauau");
        assertTrue(cadastro.validarSenha("Abcdef!"));
        assertTrue(cadastro.validarSenha("A@bcde"));
        assertTrue(cadastro.validarSenha("D@nielle"));
    }

    @Test
    public void testeValidarSenhaErrada() {
        Cadastro cadastro = new Cadastro("danielle", "danipadilha@gmail.com", "auau");
        assertFalse(cadastro.validarSenha(""));
        assertFalse(cadastro.validarSenha("abcdef!"));
        assertFalse(cadastro.validarSenha("Abc123"));

    }

}
