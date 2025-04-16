package br.teste.servico.validacao;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import br.edu.ifpr.servico.ServicoValidacao;

public class TesteValidacao {

    @Test
    public void deveConterOito(){
        //Estruturas
        //Dado[PREPARAR]
        String senhaValida = "12345678";
        String senhaInvalida = "1234567";

        //Qunado[ÃGIR]
        ServicoValidacao servicoValidacao = new ServicoValidacao();
        boolean resultadoValido = servicoValidacao.validarTamanho(senhaValida);
        boolean resultadoInvalido = servicoValidacao.validarTamanho(senhaInvalida);

        //Então[VALIDAR]
        assertTrue(resultadoValido, "A senha deve ser válida com 8 caracteres.");
        assertFalse(resultadoInvalido, "A senha deve ser inválida com menos de 8 caracteres.");
    }

    @Test
    public void deveConterMaiuscula(){
        //Estruturas
        //Dado[PREPARAR]
        String senhaValida = "novaSenha";
        String senhaInvalida = "novasenha";
        
        //Qunado[AGIR]
        ServicoValidacao servicoValidacao = new ServicoValidacao();
        boolean resultadoValido = servicoValidacao.validarMaiusculo(senhaValida);
        boolean resultadoInvalido = servicoValidacao.validarMaiusculo(senhaInvalida);

        //Então[VALIDAR]
        assertTrue(resultadoValido, "A senha deve conter pelo menos 1 caractere Maiúsculo.");
        assertFalse(resultadoInvalido, "A senha deve ser inválida sem nenhum caractere Maiúsculo.");
    }

    @Test
    public void deveConterMinuscula(){
        //Estruturas
        //Dado[PREPARAR]
        String senhaValida = "NOVAsENHA";
        String senhaInvalida = "NOVASENHA";

        //Qunado[AGIR]
        ServicoValidacao servicoValidacao = new ServicoValidacao();
        boolean resultadoValido = servicoValidacao.validarMinusculo(senhaValida);
        boolean resultadoInvalido = servicoValidacao.validarMinusculo(senhaInvalida);

        //Então[VALIDAR]
        assertTrue(resultadoValido, "A senha deve conter pelo menos 1 caractere Minusculo");
        assertFalse(resultadoInvalido, "A senha deve ser inválido sem pelo menos 1 caractere Minusculo");
    }

    @Test
    public void deveConterNumero(){
        //Estruturas
        //Dado[PREPARAR]
        String senhaValida = "nov4senha";
        String senhaInvalida = "novasenha";
        
        //Qunado[AGIR]
        ServicoValidacao servicoValidacao = new ServicoValidacao();
        boolean resultadoValido = servicoValidacao.validarNumero(senhaValida);
        boolean resultadoInvalido = servicoValidacao.validarNumero(senhaInvalida);

        //Então[VALIDAR]
        assertTrue(resultadoValido, "A senha deve ser válida com pelo menos um número");
        assertFalse(resultadoInvalido, "A senha deve ser inválida sem pelo menos um número");
    }

    @Test
    public void deveConterCaractereEspecial(){
        //Estruturas
        //Dado[PREPARAR]
        String senhaValida = "senh@nova";
        String senhaInvalida = "senhanova";

        //Qunado[AGIR]
        ServicoValidacao servicoValidacao = new ServicoValidacao();
        boolean resultadoValido = servicoValidacao.validarCaractereEspecial(senhaValida);
        boolean resultadoInvalido = servicoValidacao.validarCaractereEspecial(senhaInvalida);

        //Então[VALIDAR]
        assertTrue(resultadoValido, "A senha deve ser válida com pelo menos um caractere especial");
        assertFalse(resultadoInvalido, "A senha deve ser falsa sem pelo menos um caractere especial");
    }

    @Test
    public void naoDeveConterEspacos(){
        //Estrutura
        //Dado[PREPARAR]



        //Quando[AGIR]



        //Então[VERIFICAR]
    }

}


/**
 * Mínimo de 8 caracteres.
Pelo menos uma letra maiúscula.
Pelo menos uma letra minúscula.
Pelo menos um número.
Pelo menos um caractere especial (ex: !@#$%^&*).
Não pode conter espaços em branco.
 */