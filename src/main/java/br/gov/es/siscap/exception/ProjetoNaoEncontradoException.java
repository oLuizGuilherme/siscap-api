package br.gov.es.siscap.exception;

public class ProjetoNaoEncontradoException extends RuntimeException{

    public ProjetoNaoEncontradoException(Integer id) {
        super("Não foi encontrado um projeto com o id [" + id + "]!");
    }
}
