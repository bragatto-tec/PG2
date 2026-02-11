public class AgenteIA {
    
    public void processarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }
        
        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo");
        }
        
        System.out.println("Agente processando: " + prompt);
    }

    public void lerPalavra(String prompt) throws PromptInadequadoException {
        if(prompt.equals("hackear") || prompt.equals("roubar")) {
            throw new PromptInadequadoException("Palavra inadequada detectada: " + prompt);
        }
    }