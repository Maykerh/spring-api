package com.zup.api.error.exception;

public class ProposalNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public ProposalNotFoundException() {
        super("Proposta não encontrada");
    }
}
